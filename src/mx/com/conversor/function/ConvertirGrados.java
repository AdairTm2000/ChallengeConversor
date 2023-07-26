package mx.com.conversor.function;

import javax.swing.JOptionPane;

/**
 * Clase que tiene como funcion convertir los grados de temperatura que selecciono el usuario.
 * @author adair
 *
 */

public class ConvertirGrados {
	
	public void ConvertirGradosCelciusAFahrenheit(double valorGrado, String nombreGrado) { 
		double total = (valorGrado * 1.8) + 32;
		total = (double) Math.round(total * 100d)/100;
		JOptionPane.showMessageDialog(null, "Son " + total + "° " + nombreGrado);
	}
	
	public void ConvertirGradosCelciusAKelvin(double valorGrado, String nombreGrado) { 
		double total = valorGrado + 273.15;
		total = (double) Math.round(total * 100d)/100;
		JOptionPane.showMessageDialog(null, "Son " + total + "° " + nombreGrado);
	}
	
	public void ConvertirGradosFahrenheitACelsius(double valorGrado, String nombreGrado) { 
		double total = (valorGrado - 32) / 1.8;
		total = (double) Math.round(total * 100d)/100;
		JOptionPane.showMessageDialog(null, "Son " + total + "° " + nombreGrado);
	}
	
	public void ConvertirGradosFahrenheitAKelvin(double valorGrado, String nombreGrado) {
		double total = ((valorGrado - 32) / 1.8) + 273.15;
		total = (double) Math.round(total * 100d)/100;
		JOptionPane.showMessageDialog(null, "Son " + total + "° " + nombreGrado);
	}
	
	public void ConvertirGradosKelvinACelsius(double valorGrado, String nombreGrado) { 
		double total = valorGrado - 273.15;
		total = (double) Math.round(total * 100d)/100;
		JOptionPane.showMessageDialog(null, "Son " + total + "° " + nombreGrado);
	}
	
	public void ConvertirGradosKelvinAFahrenheit(double valorGrado, String nombreGrado) { 
		double total = (1.8*(valorGrado - 273.15)) + 32;
		total = (double) Math.round(total * 100d)/100;
		JOptionPane.showMessageDialog(null, "Son °" + total + " " + nombreGrado);
	}
	
	
}
