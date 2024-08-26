package ar.edu.untref.dyasc;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import ar.edu.untref.dyasc.exceptions.OpcionesNoValidasException;
import ar.edu.untref.dyasc.utils.Constantes;

public class ProcesadorParametros {
	
	private String orientacion = "h";
	private String direccion = "d";
	private int iteraciones = 0;
	
	public void procesarParametros(String[] args) throws OpcionesNoValidasException {
		
		if(args.length == 0 || args.length > 2){
			throw new OpcionesNoValidasException();
		}
		
		if(args.length == 2) {
		    if(!verificarComandos(args[0]) || !verificarIteraciones(args[1])) {
		    	throw new OpcionesNoValidasException();
		    }
		    
		    Map<String, Runnable> parametros = new HashMap<>();
		    parametros.put(Constantes.V, () -> setOrientacion(Constantes.V));
		    parametros.put(Constantes.H, () -> setOrientacion(Constantes.H));
	        parametros.put(Constantes.D, () -> setDireccion(Constantes.D));
	        parametros.put(Constantes.I, () -> setDireccion(Constantes.I));

	        for (Map.Entry<String, Runnable> entry : parametros.entrySet()) {
	            if (args[0].contains(String.valueOf(entry.getKey()))) {
	                entry.getValue().run();
	            }
	        }
	        
	        this.iteraciones = Integer.parseInt(args[1]);
		}else {
			if(!verificarIteraciones(args[0])) {
		    	throw new OpcionesNoValidasException();
		    }
			
			this.iteraciones = Integer.parseInt(args[0]);
		}
		
	}
	
	private boolean verificarComandos(String arg) {
		Pattern pattern = Pattern.compile(Constantes.REGEX_PARAMETROS);
	    Matcher matcher = pattern.matcher(arg);
		return matcher.find();
	}
	
	private boolean verificarIteraciones(String arg) {
		try {
			Integer interacciones = Integer.parseInt(arg);
			if(interacciones <= 0) {
				return false;
			}
			return true;
		}catch(NumberFormatException nfe) {
			return false;
		}
	}

	public String getOrientacion() {
		return orientacion;
	}

	public void setOrientacion(String orientacion) {
		this.orientacion = orientacion;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getIteraciones() {
		return iteraciones;
	}

	public void setIteraciones(int iteraciones) {
		this.iteraciones = iteraciones;
	}
	
	

}
