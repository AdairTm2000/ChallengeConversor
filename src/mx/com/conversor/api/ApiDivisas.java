package mx.com.conversor.api;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL; 
import java.net.HttpURLConnection;
import com.google.gson.JsonParser;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

/**
 * Api de divisas en tiempo real, ayuda al conversor de monedas a dar el valor de los cambios en tiempo real.
 * Se implemento la libreira externa gson version 2.8.2 de google para utilizar las funciones Json y ejecutar la api.
 * @author adair
 *
 */

public class ApiDivisas {
	
	private double req_result;
	
	public double getReq_result(String moneda, String monedaAConvertir) throws Exception {
		// Configurar URL
		String url_str = "https://v6.exchangerate-api.com/v6/9b525c957eb7168c7fdc4968/pair/" + moneda + "/" + monedaAConvertir;

		// Hacer la petición
		URL url = new URL(url_str);
		HttpURLConnection request = (HttpURLConnection) url.openConnection();
		request.connect();

		// Convertir a Json
		JsonParser jp = new JsonParser();
		JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
		JsonObject jsonobj = root.getAsJsonObject();

		// Acceder al objeto y obtener el resultado
		req_result = jsonobj.get("conversion_rate").getAsDouble();
		System.out.println(req_result);
		return req_result;
	}
	
}
