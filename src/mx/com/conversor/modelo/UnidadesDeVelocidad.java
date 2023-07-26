package mx.com.conversor.modelo;

import javax.swing.JOptionPane;

import mx.com.conversor.function.ConvertirUnidadesDeVelocidad;

/**
 * Clase que tiene como funcion dar al usuario los diferentes tipos de cambios de unidades de velocidad 
 * que se maneja en el programa 
 * @author adair
 *
 */

public class UnidadesDeVelocidad {
	
	private ConvertirUnidadesDeVelocidad convetir = new ConvertirUnidadesDeVelocidad();
	public void SeleccionUnidades(double Minput) {
		
		String opcion = (JOptionPane.showInputDialog( null, "Elije los grados a la que deseas convertir", "Temperaturas", JOptionPane.PLAIN_MESSAGE, null, new Object[] {"De Km/h a Mach (Velocidad del sonido a traves del aire)", "De km/h a m/s", "De km/h a c (Velocidad de la luz)", "De m/s a mph", "De m/s a km/s", "De mph a Pies por segundo"}, "Seleccion")).toString();
		
		switch (opcion) {
			case "De Km/h a Mach (Velocidad del sonido a traves del aire)":
				convetir.ConvertirDeKmhAMach(Minput, "Mach");
				break;
			case "De km/h a m/s":
				convetir.ConvertirDekmhAms(Minput, "m/s");
				break;
			case "De km/h a c (Velocidad de la luz)": 
				convetir.ConvertirDekmhAc(Minput, "c");
				break;
			case "De m/s a mph":
				convetir.ConvertirDemsAmph(Minput, "mph");
				break;
			case "De m/s a km/s": 
				convetir.ConvertirDemsAkms(Minput, "km/s");
				break;
			case "De mph a Pies por segundo": 
				convetir.ConvertirDemphAPiesPorsegundo(Minput, "Pies por segundo");
				break;
		}
	}
}
