package mx.com.conversor.principal;

import javax.swing.JOptionPane;
import mx.com.conversor.function.CheckOption;
import mx.com.conversor.function.ValidarNumero;
import mx.com.conversor.modelo.Monedas;
import mx.com.conversor.modelo.Temperaturas;
import mx.com.conversor.modelo.UnidadesDePeso;
import mx.com.conversor.modelo.UnidadesDeVelocidad;

public class Main {
	
	public static void main(String[] args) {
		
		Monedas moneda = new Monedas();
		Temperaturas grados = new Temperaturas();
		CheckOption option = new CheckOption();
		ValidarNumero validar = new ValidarNumero();
		UnidadesDePeso unidades = new UnidadesDePeso();
		UnidadesDeVelocidad unidades2 = new UnidadesDeVelocidad();
		
		int respuesta = 0;
		double Minput = 0.0;
		String input;
		boolean aux = true;  //Variable auxiliar que simula una bandera
		option.setAux(aux); //Comparte el valor booleano del auxiliar
		
		try {
			
			while (aux) {
				
				String opciones = (JOptionPane.showInputDialog( null, "Seleccione una opcion de conversion", "Menu" , JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Conversor de Moneda", "Conversor de Temperatura", "Conversor de Unidades de peso", "Conversor de velocidad"}, "Seleccion")).toString();
				
				switch (opciones) {
				
					case "Conversor de Moneda":
						input = JOptionPane.showInputDialog("Ingresa la cantidad de dinero que deseas convertir: ");
						if(validar.ValidarNumeroIngresado(input)) {
							Minput = Double.parseDouble(input);
							moneda.SeleccionarMonedas(Minput);
							respuesta = JOptionPane.showConfirmDialog( null, "¡Deseas realizar otra conversion?");
							option.setRespuesta(respuesta);
							aux = option.Ok_Option();
						} else {
							JOptionPane.showMessageDialog(null, "Valor invalido");
						}
						break;
					case "Conversor de Temperatura":
						input = JOptionPane.showInputDialog("Ingresa los grados que deseas convertir: ");
						if(validar.ValidarNumeroIngresado(input)) {
							Minput = Double.parseDouble(input);
							grados.SeleccionGrados(Minput);
							respuesta = JOptionPane.showConfirmDialog( null, "¡Deseas realizar otra conversion?");
							option.setRespuesta(respuesta);
							aux = option.Ok_Option();
						}else {
							JOptionPane.showMessageDialog(null, "Valor invalido");
						}
						break;
					case "Conversor de Unidades de peso":
						input = JOptionPane.showInputDialog("Ingresa la masa que deseas convertir: ");
						if(validar.ValidarNumeroIngresado(input)) {
							Minput = Double.parseDouble(input);
							unidades.SeleccionUnidades(Minput);
							respuesta = JOptionPane.showConfirmDialog( null, "¡Deseas realizar otra conversion?");
							option.setRespuesta(respuesta);
							aux = option.Ok_Option();
						}else {
							JOptionPane.showMessageDialog(null, "Valor invalido");
						}
						break;
					case "Conversor de velocidad":
						input = JOptionPane.showInputDialog("Ingresa la cantidad de velocidad que deseas convertir: ");
						if(validar.ValidarNumeroIngresado(input)) {
							Minput = Double.parseDouble(input);
							unidades2.SeleccionUnidades(Minput);
							respuesta = JOptionPane.showConfirmDialog( null, "¡Deseas realizar otra conversion?");
							option.setRespuesta(respuesta);
							aux = option.Ok_Option();
						}else {
							JOptionPane.showMessageDialog(null, "Valor invalido");
						}
						break;
				}
				
			}
			
		}catch (Exception e) {
			System.exit(0);
		}
		
	}
	
}
