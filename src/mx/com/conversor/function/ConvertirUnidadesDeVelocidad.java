package mx.com.conversor.function;

import javax.swing.JOptionPane;

/**
 * Clase que tiene como funcion convertir las unidades de velocidad que selecciono el usuario.
 * @author adair
 *
 */

public class ConvertirUnidadesDeVelocidad {
	
	public void ConvertirDeKmhAMach(double valorUnidad, String nombreUnidad) { 
		double total = valorUnidad * 0.000809716599;
		total = (double) Math.round(total * 1000000d)/1000000;
		JOptionPane.showMessageDialog(null, "Son " + total + " " + nombreUnidad);
	}
	
	public void ConvertirDekmhAms(double valorUnidad, String nombreUnidad) { 
		double total = valorUnidad * 0.2778;
		JOptionPane.showMessageDialog(null, "Son " + total + " " + nombreUnidad);
	}
	
	public void ConvertirDekmhAc(double valorUnidad, String nombreUnidad) { 
		double total = valorUnidad / 1.079e+9;
		JOptionPane.showMessageDialog(null, "Son " + total + " " + nombreUnidad);
	}
	
	public void ConvertirDemsAmph(double valorUnidad, String nombreUnidad) { 
		double total = valorUnidad * 2.2369;
		JOptionPane.showMessageDialog(null, "Son " + total + " " + nombreUnidad);
	}
	
	public void ConvertirDemsAkms(double valorUnidad, String nombreUnidad) { 
		double total = valorUnidad / 1000;
		JOptionPane.showMessageDialog(null, "Son " + total + " " + nombreUnidad);
	}
	
	public void ConvertirDemphAPiesPorsegundo(double valorUnidad, String nombreUnidad) { 
		double total = valorUnidad * 1.46667;
		JOptionPane.showMessageDialog(null, "Son " + total + " " + nombreUnidad);
	}
}
