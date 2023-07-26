package mx.com.conversor.modelo;

import javax.swing.JOptionPane;

import mx.com.conversor.function.ConvertirUnidadesDePeso;

/**
 * Clase que tiene como funcion dar al usuario los diferentes tipos de cambios de unidades de peso que se maneja en el 
 * programa
 * @author adair
 *
 */

public class UnidadesDePeso {
	
	private ConvertirUnidadesDePeso convetir = new ConvertirUnidadesDePeso();
	
	public void SeleccionUnidades(double Minput) {
		
		String opcion = (JOptionPane.showInputDialog( null, "Elije los grados a la que deseas convertir", "Temperaturas", JOptionPane.PLAIN_MESSAGE, null, new Object[] {"De Kilogramo a Gramo", "De Kilogramo a Libra", "De Kilogramo a Tonelada", "De Gramo a Miligramo", "De Libra a Onza", "De Tonelada a Stone", "De Stone a Onza"}, "Seleccion")).toString();
		
		switch (opcion) {
			case "De Kilogramo a Gramo":
				convetir.ConvertirDeKilogramoAGramo(Minput, "Gramo");
				break;
			case "De Kilogramo a Libra":
				convetir.ConvertirDeKilogramoALibra(Minput, "Libra");
				break;
			case "De Kilogramo a Tonelada": 
				convetir.ConvertirDeKilogramoATonelada(Minput, "Toneladas");
				break;
			case "De Gramo a Miligramo":
				convetir.ConvertirDeGramoAMiligramo(Minput, "Miligramo");
				break;
			case "De Libra a Onza": 
				convetir.ConvertirDeLibraAOnza(Minput, "Onza");
				break;
			case "De Tonelada a Stone": 
				convetir.ConvertirDeToneladaAStone(Minput, "Stone");
				break;
			case "De Stone a Onza":
				convetir.ConvertirDeStoneAOnza(Minput, "Onza");
				break;
		}
	}
}
