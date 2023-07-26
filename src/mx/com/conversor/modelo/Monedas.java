package mx.com.conversor.modelo;

import javax.swing.JOptionPane;

import mx.com.conversor.api.ApiDivisas;
import mx.com.conversor.function.ConvertirMonedas;

/**
 * Clase que tiene como funcion dar al usuario los diferentes tipos de cambios de divisas que se maneja en el 
 * programa
 * @author adair
 *
 */

public class Monedas {
	
	private ConvertirMonedas convertir = new ConvertirMonedas();
	private ApiDivisas api = new ApiDivisas();
	
	public void SeleccionarMonedas(double Minput) throws Exception {
		String opcion = (JOptionPane.showInputDialog( null, "Elije la moneda a la que deseas convertir tu dinero ", "Monedas", JOptionPane.PLAIN_MESSAGE, null, new Object[] {"De pesos a Dolar", "De pesos a Euro", "De pesos a Libras Esterlinas", "De pesos a Yen Japonés", "De pesos a Won sul-coreano", "De Dolar a pesos", "De Euro a pesos", "De Libras Esterlinas a pesos", "De Yen Japonés a pesos", "De Won sul-coreano a pesos"}, "Seleccion")).toString();
		
		switch (opcion) {
			case "De pesos a Dolar":
				convertir.ConvertirMoneda(Minput, api.getReq_result("USD", "MXN"), " Dolares");
				break;
			case "De pesos a Euro":
				convertir.ConvertirMoneda(Minput, api.getReq_result("EUR", "MXN"), " Euros");
				break;
			case "De pesos a Libras Esterlinas":
				convertir.ConvertirMoneda(Minput, api.getReq_result("GBP", "MXN"), " Libras Esterlinas");
				break;
			case "De pesos a Yen Japonés":
				convertir.ConvertirMoneda(Minput, api.getReq_result("JPY", "MXN"), " Yen Japonés");
				break;
			case "De pesos a Won sul-coreano":
				convertir.ConvertirMoneda(Minput, api.getReq_result("KRW", "MXN"), " Won sul-coreano");
				break;
			case "De Dolar a pesos":
				convertir.ConvertirMoneda2Parte(Minput, api.getReq_result("USD", "MXN"), " Pesos");
				break;
			case "De Euro a pesos":
				convertir.ConvertirMoneda2Parte(Minput, api.getReq_result("EUR", "MXN"), " Pesos");
				break;
			case "De Libras Esterlinas a pesos":
				convertir.ConvertirMoneda2Parte(Minput, api.getReq_result("GBP", "MXN"), " Pesos");
				break;
			case "De Yen Japonés a pesos":
				convertir.ConvertirMoneda2Parte(Minput, api.getReq_result("JPY", "MXN"), " Pesos");
				break;
			case "De Won sul-coreano a pesos":
				convertir.ConvertirMoneda2Parte(Minput, api.getReq_result("KRW", "MXN"), " Pesos");
				break;
		}
	}
	
}
