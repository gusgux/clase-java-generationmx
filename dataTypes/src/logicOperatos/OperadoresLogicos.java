package logicOperatos;

public class OperadoresLogicos {
	
	public static void main(String[] args) {
		/*
		 * -- Operadores aritméticos (+, - , *, /, %)
		 * -- Operadores lógicos. (AND ,OR 	,NOT)
		 * -- Operadores relacionales ( =, +=, -=, *=, /=, <, >, <=, >=)
		 */
		
		int num1 = 12;
		int num2 = 7;
		
		int resultado = num1 % num2;
		System.out.println(resultado);
		
		/*
		double num1 = 12d;
		double num2 = 7d;
		
		double resultado = num1 / num2;
		System.out.println(resultado);
		*/
		
		/*Relacionales
		= asignación
		+= asignación suma
		-= asignación resta
		*= asignación multiplicación
		/= asignación división
		== igual que
		!= distinto que
		< menor que
		> mayor que
		<= menor igual que
		>= mayor igual que
		*/
		
		System.out.println(num1>=num2);//true
		System.out.println(num1<=num2);//false
		
		
		/*
		 * Operadores Lógicos
		 * AND (&&)
		 * OR (||)
		 * NOT (!)
		 * 
		 */
		
		int numeroUno=5;
		int numeroDos=7;
		
		boolean compacionUno=numeroUno==numeroDos;
		System.out.println("comparacion:Uno "+compacionUno);//false
		
		boolean compacionDos=(numeroUno<numeroDos)&&(numeroUno>numeroDos);
		System.out.println("comparacion:Dos "+compacionDos);//false
		
		boolean compacionTres=(numeroUno<numeroDos)||(numeroUno>numeroDos);
		System.out.println("comparacion:Tres "+compacionTres);//true
		
		boolean compacionCuatro=false;
		System.out.println("comparacion:Cuatro "+ !compacionCuatro);//true
		
		//daniel.cruz@idr.edu.mx
	}

}
