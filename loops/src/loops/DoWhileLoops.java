package loops;

import java.util.Scanner;

public class DoWhileLoops {
	public static void main(String[] args ) {
		/*
		 *  Do-While. Evalúa su expresión en la parte inferior del ciclo. POr lo tanto, las declaraciones dentro del bloque "do" siempre se ejecutan al menos una vez
		 * */
		
		//cuenta de 1 al 10
		
		int cuenta=1;
		do {
			System.out.println(cuenta);
			cuenta++;
		}while(cuenta<0);
		
		/*
		 * Crear un programa para un cajero bancario
		 * - El programa me mostrará 4 opciones:
		 * 1. Consultar saldo
		 * 2. Ingresar dineros
		 * 3. Retirar dineros
		 * 4. Salir
		 * - Mostrar mensaje de bienvenida al usuario, darle contexto y solicitar que elija una opción (número)
		 * - Mostrar al usuario la opción que eligió y permitir que elija otra opción
		 * - El usuario puede salir del programa escribiendo 4 (salir)
		 */
		System.out.println("Bienvenido al Banco Generation, elige cualquiera de las opciones, para ello escribe el número que corresponda:");
		System.out.println("1. Consultar saldo");
		System.out.println("2. Ingresar dineros");
		System.out.println("3. Retirar dineros");
		System.out.println("4. Salir");
		
		Scanner skner = new Scanner(System.in);
		int opcionSeleccionada;
		
		do {
			opcionSeleccionada = skner.nextInt();
		
			switch(opcionSeleccionada) {
			case 1:
				System.out.println("Consultar saldo");
				break;
			case 2:
				System.out.println("Ingresar dineros");
				break;
			case 3:
				System.out.println("Retirar dineros");
				break;
			case 4: 
				System.out.println("Salir");
				break;
				default:
					System.out.println("Elige una opción válida");
					break;
			}
		} while (opcionSeleccionada != 4);
		
		skner.close()
;	}
}