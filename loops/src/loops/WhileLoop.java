package loops;

import java.util.Scanner;

public class WhileLoop {
	public static void main(String[] args) {
		/*
		 * While. El ciclo While ejecuta Continuamente un bloque de código hasta que se cumpla una condicion dada
		 * while (condition) {
			bloque de codigo a ejecutar
			contador-interador
		}
		 * */
//		int cuenta=1;
//		while (cuenta<11) {
//			
//			System.out.println("La cuenta es de: "+cuenta);
//			cuenta++;
//		}
		
		int cuenta=0;
		while (cuenta<10) {
			cuenta++;
			System.out.println("La cuenta es de: "+cuenta);
			
		}
		
		/*Crear un programa que solicite al usuario un número. Dicho número será tomado como el número final de una cuenta. Dicha cuenta inicia en 1. Debe mostrar en consola la cuenta del 1 hasta el número proporcionado.
		 * 1-impotar un scanner e implementarlo
		 * 2- un mensaje para darle contexto al usuario
		 * 3-almacenar el numero del usuario en una variable
		 * 4-guardar en variable el numero que iniciar la cuenta (1)
		 * 5-imprementar un ciclo while
		 * 6-mostrar por consola el resultado
		 * */
	
		//1. crear e importar el scanner
		
		Scanner input= new Scanner(System.in);
		//2
		System.out.println("Escribe un número que servira como número final de una cuenta");
		//3
		int numFinal=input.nextInt();
		input.close();
		//4
		int numInicial=1;
		//5
		while (numInicial<=numFinal) {
			System.out.println("La cuenta va en "+numInicial);
			numInicial++;
		}
		
	
	}
}
