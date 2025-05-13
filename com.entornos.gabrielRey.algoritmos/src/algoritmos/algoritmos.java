package algoritmos;

public class algoritmos {
	public algoritmos() {
		
	}
	public int fibonacci(int numero){
		//Si el numero es menor a 0 lanza la Exception
		if (numero < 0) throw new IllegalArgumentException();
		
		//Si el numero es 0 o 1 devuelve 1
		if (numero <= 1) return numero;
		
		//Variables para la formula
        int num1 = 0, resultado = 1;
        
        //For para ejecutar la formula
        for (int i = 2; i <= numero; i++) {
            int suma = num1 + resultado;
            num1 = resultado;
            resultado = suma;
        }

        return resultado;
    }
	public int factorial(int numero){
		//Si el numero es menor a 0 lanza la Exception
		if (numero < 0) throw new IllegalArgumentException();
				
		//Variable del resultado
		 int resultado = 1;
	     for (int i = 2; i <= numero; i++) {
	    	 resultado *= i;
	     }
	     return resultado;
	}
	public static boolean primo(int numero) {
		//Si el numero es menor a 2 lanza la Exception
		if (numero < 2) throw new IllegalArgumentException();
		
		//Si el numero es 2 es primo
        if (numero == 2) return true;
        
        //Los numero pares no son primos
        if (numero % 2 == 0) return false;

        // Verificar divisibilidad hasta la raíz cuadrada del numero dado
        for (int i = 3; i <= Math.sqrt(numero); i += 2) {
            if (numero % i == 0) return false;
        }
        return true;
    }
}
