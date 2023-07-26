package mx.com.conversor.function;

import mx.com.conversor.modelo.Validar;

/**
 * Clase que tiene como función detectar si los datos ingresados son numeros, si lo son 
 * retorna un booleano afrimativo y da luz verde para continuar el programa pero en dado caso retorna false,
 * esque hay caracteres no admitidos en los datos ingresados, por lo tanto te lanza una ventada con una advertencia 
 * y no te deja continuar hasta que los datos sean correctos.  
 * @author adair
 *
 */

public class ValidarNumero implements Validar {

	@Override
	public boolean ValidarNumeroIngresado(String input) {
		try {
			double x = Double.parseDouble(input);
			if(x >= 0 || x < 0); 
				return true;
		}catch (NumberFormatException e) {
			return false;
		}
	}

}
