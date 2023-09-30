package loops;


public class ForLoops {

	public static void main(String[] args) {
		/*
		 * El ciclo for proporciona una forma compacta de iterar sobre valores.
		 * for (inicilizacion;condicion;contador(incremento/decremento)){
		 * 		//bloque de codigo		
		 * }
		 * */
		
		//for con variable local
		
		for (int numero = 1; numero <= 10; numero++) {
			System.out.println("Numero igual a "+numero);
		}
		
		//for con variable globañ
		int contador;
		for (contador=1; contador <= 10; contador++) {
			System.out.println("La cuenta es igual a "+contador);
		}
		
		/*
		 * Bucles anidados. bucle dentro de otro bucle.
		 * Imprimir una forma traingular de asteriscos
		 * */
		
		int filas=5;
				
				for (int i = 0; i < filas; i++) {
					for (int j = 0; j <= i*2; j++) {
						System.out.print("*");
						
					}
					System.out.println();
				}
		
		//java API - Math
		//https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Math.html
			/*Calcular 5 potencias del valor de PI y mostrar en consola el valor de cada una de ellas
			 * output:
			 * PI elevado a la 1 potencia es igual a 3.141592653589793
			 * PI elevado a la 1 potencia es igual a ....
				
				*/
			System.out.println("El valor de PI es "+ Math.PI);
			int potencias=5;	
			for (int base =1 ; base <=potencias; base++) {
				double resultado =Math.pow(Math.PI, base);
				System.out.println("PI elevado a la "+base+" es igual a "+resultado);
				
			}
	}
	

}
