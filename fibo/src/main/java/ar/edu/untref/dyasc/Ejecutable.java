package ar.edu.untref.dyasc;

public class Ejecutable {
	
    public static void main(String[] args) {
    	Fibonacci fibonacci = new Fibonacci();
    	int iteraciones = Integer.parseInt(args[0]);
    	fibonacci.calcular(iteraciones);
    	System.out.print(Formateador.imprimirResultadoFinal(iteraciones, fibonacci.getResultado(), Constantes.ESPACIO));
    }
    
}
