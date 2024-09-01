package ar.edu.untref.dyasc.fibonacci;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Salida {
	
	private final String DESKTOP_PATH = System.getProperty("user.home") + File.separator + "Desktop";
	
	public void salidaPorArchivo(String serie, String nombreArchivo) throws IOException {
		 String rutaCompleta = DESKTOP_PATH + File.separator + nombreArchivo;
	     File archivo = new File(rutaCompleta);
	     BufferedWriter escritor = new BufferedWriter(new FileWriter(archivo));
	     escritor.write(serie);
	     escritor.close();
	}
	
	public void salidaPorPantalla(String valor) {
		System.out.println(valor);
	}

}
