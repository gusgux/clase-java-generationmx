package dataTypes;

public class DatosPrimitivos {

	public static void main(String[] args) {
		/*
		 * Datos primitivos. Datos fundamentales en Java que sirven para gestionar los tipos de información más básicos
		 * Existen 8 tipos de datos primitivos: byte, short, int, long, float, dohble, boolean, char
		 */
		
		
		//byte, short, int, long, float, double
		
		// Byte - Vmin y Vmax
		
		
		byte minByte=Byte.MIN_VALUE;
		byte maxByte=Byte.MAX_VALUE;
		
		System.out.println("El valor minimo de Byte es:"+ minByte);
		System.out.println("El valor maximo de Byte es:"+ maxByte);

		
		// short - Vmin y Vmax
		
		short minShort=Short.MIN_VALUE;
		short maxShort=Short.MAX_VALUE;
		
		System.out.println("El valor minimo de Short es:"+ minShort);
		System.out.println("El valor maximo de Short es:"+ maxShort);

		
		// Int - Vmin y Vmax
		
		int minInt=Integer.MIN_VALUE;
		int maxInt=Integer.MAX_VALUE;
		
		System.out.println("El valor minimo de Integer es:"+ maxInt);
		System.out.println("El valor maximo de Integer es:"+ minInt);

		
		// Log - Vmin y Vmax
		
		long minLong=Long.MIN_VALUE;
		long maxLong=Long.MAX_VALUE;
		
		System.out.println("El valor minimo de Long es:"+ minLong);
		System.out.println("El valor maximo de Long es:"+ maxLong);

		
		
		// Float - Vmin y Vmax
		float minFloat=Float.MAX_VALUE;
		float maxFloat=Float.MIN_VALUE;

		
		System.out.println("El valor minimo de Float es:"+ minFloat);
		System.out.println("El valor maximo de Float es:"+ maxFloat);

		
		// Double - Vmin y Vmax
		
		double minDouble=Double.MIN_VALUE;
		double maxDouble=Double.MAX_VALUE;
		
		
		System.out.println("El valor minimo de double es:"+ minDouble);
		System.out.println("El valor maximo de double es:"+ maxDouble);

		
		// char - Vmin y Vmax
		
		char minChart=Character.MIN_VALUE;
		char maxChart=Character.MAX_VALUE;
		
		System.out.println("El valor minimo de Character es:"+ minChart);
		System.out.println("El valor maximo de Character es:"+ maxChart);

		char valorChart1=64;
		char valorChart2=98;

		System.out.println(valorChart1);
		System.out.println(valorChart2);
		
		char aChiquita;
		aChiquita=200;
	
		System.out.println(aChiquita);
		
		/*Casting-casteo (conversion de tipos en JAVA).
		 * -- Automatico(dato mas pequeño a un dato mas grande)
		 * -- Manual (tipo de dato más grande a tipo de dato mas pequeño)
		 * 
		 * 
		 * 
		 */
		
		
		int myNumber=125;
		System.out.println(myNumber);
		//int< dobule
		double myCasting=myNumber;
		System.out.println(myCasting);
		
		short edad=25;
		int valorEdad=edad;
		
		System.out.println(edad);
		System.out.println(valorEdad);
		
		
		//--Manual
		
		int myNewCasting=(int) myCasting;
		
		System.out.println(myNewCasting);
		
		//--convertir de float a int
		
		float myFloat=1.99f;
		System.out.println(myFloat);
		
		//conversión
		int myNewFloat=(int) myFloat;
		System.out.println(myNewFloat);
		
		//convertir de chart a int
		
		char myChar='M';
		int myNewChar=myChar;
		
		System.out.println(myNewChar);
		
		///string array creadas por el usuario
		

		//byte age=127;
		//System.out.println(age); //sysout ctrl + space
		//System.out.println(age); //syso + ctrl + space

	}

}
