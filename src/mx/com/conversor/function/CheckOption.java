package mx.com.conversor.function;

import javax.swing.JOptionPane;

/**
 * Clase que tienen como funcion detectar en el JOptionPane si el usuario desea volver a utilizar el conversor
 * o desea salir, si en dado caso es la segunda, lanzalar un MessageDialog con un mensaje diciendo programa terminado
 * y el programa terminara, pero si desea seguir utilizando el conversor regresara al inicio para volver a usarlo. 
 * @author adair
 *
 */

public class CheckOption {
	
	private boolean aux;
	private int respuesta;
	
	public void setAux(boolean aux) {
		this.aux = aux;
	}

	public void setRespuesta(int respuesta) {
		this.respuesta = respuesta;
	}
	
	public boolean Ok_Option() {
		if(JOptionPane.OK_OPTION == respuesta) {
			System.out.println("Selecciona opción Afirmativa");
		} else {
			JOptionPane.showMessageDialog(null, "Programa Terminado");
			this.aux = false;
		}
		return aux;
	}
}
