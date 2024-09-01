package ar.edu.untref.dyasc.fibonacci;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
	
	public List<Integer> calcular(int iteraciones) {
		List<Integer> serie = new ArrayList<Integer>();
		
		if (iteraciones == 1) {
			serie.add(0);
            return serie;
        }
        
        if (iteraciones == 2) {
        	serie.add(0);
        	serie.add(1);
            return serie;
        }
        
		int fiboA = 0;
		int fiboB = 1;
		int fibonacci = 0;
		
		serie.add(fiboA);
		serie.add(fiboB);
		
		for(int i = 2; i < iteraciones; i++) {
			fibonacci = fiboA + fiboB;
			serie.add(fibonacci);

			fiboA = fiboB;
			fiboB = fibonacci;
		}
		
		return serie;
	}
}
