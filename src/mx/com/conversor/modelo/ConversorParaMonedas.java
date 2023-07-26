package mx.com.conversor.modelo;

public interface ConversorParaMonedas {
	
	public void ConvertirMoneda(double valor, double moneda, String nombreMoneda);
	public void ConvertirMoneda2Parte(double valor, double moneda, String nombreMoneda);

}
