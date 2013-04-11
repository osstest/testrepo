package de.test.xmltest;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.ksoap2.SoapEnvelope;
import org.ksoap2.transport.HttpTransportSE;
import org.w3c.dom.Document;

import android.content.Context;
import android.util.Log;

public class MyHTTPTransport extends HttpTransportSE {

	Context context;

	public MyHTTPTransport(String url, Context context) {
		super(url);
		this.context = context;
	}

	@Override
	protected byte[] createRequestData(SoapEnvelope envelope)
			throws IOException {
		byte[] data = null;
		try {
			//bestimmen welche xml verwendet werden soll
			//xml muss in raw ordner vorhanden sein
			InputStream input = context.getResources().openRawResource(R.raw.sigenc);
			
			//XML laden und in byte array umwandeln
			DocumentBuilderFactory f = DocumentBuilderFactory.newInstance();
			Document doc = f.newDocumentBuilder().parse(input);
			input.close();
			Source source = new DOMSource(doc);
			ByteArrayOutputStream out = new ByteArrayOutputStream();
			Result result = new StreamResult(out);
			TransformerFactory factory = TransformerFactory.newInstance();
			Transformer transformer = factory.newTransformer();
			transformer.transform(source, result);

			Log.e("test", out.toString());

			data = out.toByteArray();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
	}
}
