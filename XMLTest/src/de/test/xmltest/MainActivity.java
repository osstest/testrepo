package de.test.xmltest;

import java.io.IOException;
import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.xmlpull.v1.XmlPullParserException;

import android.os.AsyncTask;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

	private static final String sample= "sample06";
	private static final String NAMESPACE = "http://"+ sample +".samples.rampart.apache.org";
	private static String URL = "http://192.168.0.107:2000/axis2/services/"+sample+"/";
	private static final String METHOD_NAME = "echo";
	private static final String SOAP_ACTION = "urn:" + METHOD_NAME;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

	//Aufruf durch betätigen des Buttons
	public void OnClick(View view) {
		new AsyncTask<Void, Void, Void>() {
			@Override
			protected Void doInBackground(Void... params) {
				try {
					SoapObject so = new SoapObject(NAMESPACE, METHOD_NAME);

					SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
					envelope.setOutputSoapObject(so);

					MyHTTPTransport httpTransport = new MyHTTPTransport(URL,MainActivity.this);
					httpTransport.call(SOAP_ACTION, envelope);
					SoapPrimitive response = (SoapPrimitive) envelope
							.getResponse();
					response.toString();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (XmlPullParserException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				return null;
			}

		}.execute(null, null);
	}

}
