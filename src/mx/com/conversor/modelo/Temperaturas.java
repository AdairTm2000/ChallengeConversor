package mx.com.conversor.modelo;

import javax.swing.JOptionPane;

import mx.com.conversor.function.ConvertirGrados;

/**
 * Clase que tiene como funcion dar al usuario los diferentes tipos de cambios de temperaturas que se maneja en el 
 * programa
 * @author adair
 *
 */

public class Temperaturas {

	private ConvertirGrados convetir = new ConvertirGrados();
	
	public void SeleccionGrados(double Minput) {
		
		String opcion = (JOptionPane.showInputDialog( null, "Elije los grados a la que deseas convertir", "Temperaturas", JOptionPane.PLAIN_MESSAGE, null, new Object[] {"De Celsius a Fahrenheit", "De Celsius a Kelvin", "De Fahrenheit a Celsius", "De Fahrenheit a Kelvin", "De Kelvin a Celsius", "De Kelvin a Fahrenheit"}, "Seleccion")).toString();
		
		switch (opcion) {
			case "De Celsius a Fahrenheit":
				convetir.ConvertirGradosCelciusAFahrenheit(Minput, "Fahrenheit");
				break;
			case "De Celsius a Kelvin":
				convetir.ConvertirGradosCelciusAKelvin(Minput, "Kelvin");
				break;
			case "De Fahrenheit a Celsius": 
				convetir.ConvertirGradosFahrenheitACelsius(Minput, "Celsius");
				break;
			case "De Fahrenheit a Kelvin":
				convetir.ConvertirGradosFahrenheitAKelvin(Minput, "Kelvin");
				break;
			case "De Kelvin a Celsius": 
				convetir.ConvertirGradosKelvinACelsius(Minput, "Celsius");
				break;
			case "De Kelvin a Fahrenheit": 
				convetir.ConvertirGradosKelvinAFahrenheit(Minput, "Fahrenheit");
				break;
		}
	}
}
