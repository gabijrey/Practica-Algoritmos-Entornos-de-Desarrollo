package algoritmos;

public class Principal {
	
	public static void main(String[] args) {
		
		algoritmos algoritmo = new algoritmos();
		
		//Bucle 1
		int num, numeros[] = new int[3], contador = 0;
		boolean repetido;
		while(contador < 3) {
			num = (int)(Math.random()*(10-2+1)+2);
			repetido = false;
			for (int i = 0; i < numeros.length; i++) {
				if (numeros[i] == num) {
					repetido = true;
					i = 3;
				}
			}
			if(!repetido) {
				numeros[contador] = num;
				contador++;
			}
		}
		//Fibonacci
		int resultadoFibonacci[] = new int[numeros.length];
		for (int i = 0; i < numeros.length; i++) {
			resultadoFibonacci[i] = algoritmo.fibonacci(numeros[i]);
		}
		//Factorial
		int resultadoFactorial[] = new int[numeros.length];
		for (int i = 0; i < numeros.length; i++) {
			resultadoFactorial[i] = algoritmo.factorial(numeros[i]);
		}
		//Primos
		boolean resultadoPrimos[] = new boolean[numeros.length];
		for (int i = 0; i < numeros.length; i++) {
			resultadoPrimos[i] = algoritmo.primo(numeros[i]);
		}	
	}
}
