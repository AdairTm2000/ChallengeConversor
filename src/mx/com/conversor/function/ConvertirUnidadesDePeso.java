package mx.com.conversor.function;

import javax.swing.JOptionPane;

/**
 * Clase que tiene como funcion convertir las unidades de peso que selecciono el usuario.
 * @author adair
 *
 */

public class ConvertirUnidadesDePeso {
	
	public void ConvertirDeKilogramoAGramo(double valorUnidad, String nombreMasa) { 
		double total = valorUnidad * 1000;
		JOptionPane.showMessageDialog(null, "Son " + total + " " + nombreMasa);
	}
	
	public void ConvertirDeKilogramoALibra(double valorUnidad, String nombreMasa) { 
		double total = valorUnidad * 2.2046;
		total = (double) Math.round(total * 100d)/100;
		JOptionPane.showMessageDialog(null, "Son " + total + " " + nombreMasa);
	}
	
	public void ConvertirDeKilogramoATonelada(double valorUnidad, String nombreMasa) { 
		double total = valorUnidad / 1000;
		JOptionPane.showMessageDialog(null, "Son " + total + " " + nombreMasa);
	}
	
	public void ConvertirDeGramoAMiligramo(double valorUnidad, String nombreMasa) { 
		double total = valorUnidad * 1000;
		JOptionPane.showMessageDialog(null, "Son " + total + " " + nombreMasa);
	}
	
	public void ConvertirDeLibraAOnza(double valorUnidad, String nombreMasa) { 
		double total = valorUnidad * 16;
		total = (double) Math.round(total * 100d)/100;
		JOptionPane.showMessageDialog(null, "Son " + total + " " + nombreMasa);
	}
	
	public void ConvertirDeToneladaAStone(double valorUnidad, String nombreMasa) { 
		double total = valorUnidad * 157.473;
		total = (double) Math.round(total * 1000d)/1000;
		JOptionPane.showMessageDialog(null, "Son " + total + " " + nombreMasa);
	}
	
	public void ConvertirDeStoneAOnza(double valorUnidad, String nombreMasa) { 
		double total = valorUnidad * 224;
		JOptionPane.showMessageDialog(null, "Son " + total + " " + nombreMasa);
	}
	
}
