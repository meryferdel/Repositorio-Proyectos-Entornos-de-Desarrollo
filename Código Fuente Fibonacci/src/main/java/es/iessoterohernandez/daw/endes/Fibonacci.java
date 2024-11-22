package es.iessoterohernandez.daw.endes;

public class Fibonacci {
	
	public static int[] fibonacci(int number) { // number = 5

        int[] sequence = new int[number]; // sequence = [0, 0, 0, 0, 0]
        sequence[0] = 0; // [0, 0, 0, 0, 0]

        if (number > 1) sequence[1] = 1; // [0, 1, 0, 0, 0]

        // f(n) = f(n-1) + f(n-2)
        for (int i = 2; i < number; i++) {
            sequence[i] = sequence[i - 1] + sequence[i - 2];
            // Paso 0: [0, 1, 0, 0, 0]
            // Paso 1: [0, 1, 1, 0, 0]
            // Paso 2: [0, 1, 1, 2, 0]
            // Paso 3: [0, 1, 1, 2, 3]
        }

        return sequence; // [0, 1, 1, 2, 3]
    }
}
