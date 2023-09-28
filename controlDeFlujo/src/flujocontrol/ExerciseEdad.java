package flujocontrol;

import java.util.Scanner;

public class ExerciseEdad {

	public static void main(String[] args) {
		
	///Actividad ejemplo para confirmar  si es menor de edad de la clinica dental
		
		
		Scanner input = new Scanner(System.in);  // Create a Scanner object para solicitar un input
	    System.out.println("Ingrese una edad: ");

	    int edad = input.nextInt() ;  //se lee el input del usuario y con el metodo nextInt lo tenemos en entero
		
		if (edad<18) { //verificamos si mejor de edad o mayor
			System.out.println("Viene con un acompañante mayor de edad "); //se pregunta si tiene acompañante
			System.out.println("Ingrese un true para si y un false para no \n"); //
			boolean verdad = input.nextBoolean();// un input boleano del usuario para  saber si va a compañado 

			String verificarMensaje=verdad?"se le da servicio \n":"no se le da servicio a menores sin acompañante adulto \n";// condicional ternario para saber si llego acompañado  y mostrar el mensaje adecuado
			System.out.println(verificarMensaje);// imprimir el mensaje en consola
		} 
		else {
			System.out.println("si es mayor de edad le proporcionamos servicio ");//imprimir mensaje en consola si es mayor de edad
		}
		
		
		System.out.println("Fin del programa");
		input.close();// cerrando el scanner 

	}

}
