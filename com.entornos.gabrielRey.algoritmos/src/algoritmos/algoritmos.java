package algoritmos;

public class algoritmos {
	public algoritmos() {
		
	}
	public int algoritmos(int num) throws Exception{
		//Si el numero es menor a 0 lanza la Exception
		if (num < 0) throw new IllegalArgumentException();
		
		//Si el numero es 0 o 1 devuelve 1
		if (num <= 1) return num;
		
		//Variables para la formula
        int num1 = 0, resultado = 1;
        
        //For para ejecutar la formula
        for (int i = 2; i <= num; i++) {
            int suma = num1 + resultado;
            num1 = resultado;
            resultado = suma;
        }

        return resultado;
    }

}
