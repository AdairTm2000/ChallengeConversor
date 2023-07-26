package mx.com.conversor.function;

import javax.swing.JOptionPane;

import mx.com.conversor.modelo.ConversorParaMonedas;

/**
 * Clase que tiene como funcion convertir las monedas que selecciono el usuario.
 * @author adair
 *
 */

public class ConvertirMonedas implements ConversorParaMonedas {

	@Override
	public void ConvertirMoneda(double valor, double moneda, String nombreMoneda) {
		double total = valor / moneda;
		total = (double) Math.round(total * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + total + nombreMoneda);
	}

	@Override
	public void ConvertirMoneda2Parte(double valor, double moneda, String nombreMoneda) {
		double total = valor * moneda;
		total = (double) Math.round(total * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + total + nombreMoneda);
	}

}
