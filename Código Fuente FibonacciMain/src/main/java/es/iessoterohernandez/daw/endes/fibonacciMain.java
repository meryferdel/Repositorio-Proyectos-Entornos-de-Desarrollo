package es.iessoterohernandez.daw.endes;

import es.iessoterohernandez.daw.endes.Fibonacci;

/**
 * Hello world!
 */
public class fibonacciMain {
    public static void main(String[] args) {
    	
    	Fibonacci f = new Fibonacci();
    	
    	int[] num = f.fibonacci(10);
    

    	for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
    	
    }
}
