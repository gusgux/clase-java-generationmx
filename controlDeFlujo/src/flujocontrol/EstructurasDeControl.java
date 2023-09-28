package flujocontrol;

import java.util.Scanner;

public class EstructurasDeControl {//Debe conincidir la clase con el nombre d nuestro documento

	public static void main(String[] args) {
		/*
		 * Todo dentro del main
			Recordar que para que algo se ejecute,siemopre debe ir dentro del metodo principal*/

		String citaPrograma="28-09-23";//Dejamos en NULL y despues lo cambiamos a una fecha "28-09-23"
		//La variable declarada,se inicia en null a proposito para tener un espacio de memoria ya asignado y solo reemplzarlo con un nuevo dato.
		
		if (citaPrograma!=null) {
			//Por que la variable ya esta ocupada o llena
			System.out.println("Ya hay una cita Programada una disculpita"+citaPrograma);
		} else {
			//Podemos registrar otra cita o una cita
			System.out.println("Puede registrar su cita.");
		}
		
		////////////////////////////////////////////
		
		int opcion=1;
		
		//Creamos un menu
		
		System.out.println("Menu del diente Feliz");
		System.out.println("1. ¿Desea Programar una cita?");
		System.out.println("2. Verificar Cita Programada");
		System.out.println("3. Cancelar Cita");
		System.out.println("4. Salir del Menú");
		System.out.println("Seleccione una opción del Menú ");
		
		
		
		switch (opcion) {
		case 1:
			System.out.println("Usted ha seleccionado la opcion Programar una cita");//Agrega la logica para programar una cita
			break;
		case 2:
			System.out.println("Usted ha seleccionado la opcion  Verificar Cita Programada");//Agrega la logica para Verificar una cita
			break;
		case 3:
			System.out.println("Usted ha seleccionado la opcion Cancelar Cita");//Agrega la logica para opcion Cancelar Cita
			break;
		case 4:
			System.out.println("Usted ha seleccionado la opcion Salir del Menú");//Agrega la logica para opcion Salir del Menú
			break;

		default:
			System.out.println("no selecciono ninguna de las opciones");//mensaje si no mostro 
			break;
		}//switch cierre
		
		
		
	
		
		
	}//Metodo

}//clase
