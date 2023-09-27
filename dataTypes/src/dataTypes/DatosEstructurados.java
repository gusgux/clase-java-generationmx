package dataTypes;

public class DatosEstructurados {

	public static void main(String[] args) {
		/*
		 * Datos estructurados. Son datos complejos que almacenan caracteres y/o cadenas de caracteres o bien, algún tipo de dato primitivo
		 * -- String. Cadena de Caracteres, se declaran entre comillas y hay que definir el tipo de dato con la palabra reservada String
		 * -- Arrays.
		 * -- Creados por el usuario (API Java)
		 */
		String myString="Hola,soy un string"; 
		System.out.println(myString);
		
		String helloString=new String("Hola,soy un segundo string");
		System.out.println(helloString);
        /*
         * Metodo strings
         * */
		
		String texto = "adasdasdGsad";
		//string. length. metodo que permite medir la longitud de una cadena de caracteres
		System.out.println("LA longitud de la variable texto del tipo string es "+ texto.length());
		
		/*
		 * Guardando la variable texto en una nueva variable de tipo int para pasarle el método length
		 * int metodoLength = texto.length();
		 *--Output: 10
		 *Imprimimos en consola la nueva variable
		 *System.out.println(metodoLength);
		 */
		
		//string: toUpperCase() y toLowerCase()
		/*/https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
		 * https://docs.oracle.com/javase/tutorial/java/data/strings.html
		 */
		String upperCase=texto.toUpperCase();
		System.out.println("aplicando el metodo touppercase: "+upperCase);
		
		String lowerCase=texto.toLowerCase();
		System.out.println("aplicando el metodo tolowercase: "+lowerCase);
		
		//indexof() DEvuel el indice de la primera aparicion de un texto especifico
		
		String fraseMotivacional="Todo es temporal,echale ganitas";
		int indexOf=fraseMotivacional.indexOf("temporal");
		System.out.println("La palabra: 'tempora' inicia en el indice "+indexOf);

		//https://www.w3schools.com/java/java_ref_string.asp
		
		//-- concatenacion
		
		String firstName="Daniel";
		String lastName="Maldonado";
		
		String userName=firstName+" "+lastName;
		
		System.out.println(userName);
		System.out.println(firstName.concat(lastName));
		
		//-- metodo de conversion (parse)
		String presupuesto="50000";
		
		System.out.println("El presupuesto es de $ "+presupuesto +" y el tipo de dato es "+presupuesto.getClass().getSimpleName());
		
		int parseado=Integer.parseInt(presupuesto);
		System.out.println("Aplicando parseInt,el valor de "+presupuesto +" de tipo "+presupuesto.getClass().getSimpleName() + " ahora es "+parseado+ " que ahora es del tipo "+ ((Object)parseado).getClass().getSimpleName());
		
		/*-- Métodos de conversión (parseo)
				String presupuesto = "50000";
				System.out.println("El presupuesto es de $" + presupuesto + " y el tipo de dato es " + presupuesto.getClass().getSimpleName());
				
				int parseao = Integer.parseInt(presupuesto);
				System.out.println("Aplicando parseInt, el valor de " + presupuesto + " de tipo " + presupuesto.getClass().getSimpleName() + " ahora es " + parseao + " que ahora es de tipo " + ((Object)parseao).getClass().getSimpleName());*/
		
		/*
		 * ARRAYS. conocidos como arreglos , se trata de una coleccion de datos del mismo tipo donde cada elemento corresponde a una posicion identificada por indices numericos.cuando trabajamos con arreglos de dos dimensiones(bidimensionales), usamos el termino matriz
		 * 
		 */
		
		
		String[] cars={"volkswagen","mazda","kia","nissan","tesla","Ford"};
		
		System.out.println(cars);
		//https://www.geeksforgeeks.org/java-program-to-write-an-array-of-strings-to-the-output-console/
		
		//https://www.geeksforgeeks.org/arrays-in-java/
		//https://github.com/danieldlcm86/Repositorio_CH31
		
		/*
		 * Variable por tipo de declaración
		 * -- Variables dinámicas. Son aquellas que se declaran con un valor pero que dicho valor puede cambiar durante el proceso.
		 * -- Variables constantes o finales. Su valor no puede modificarse.
		 * -- Variables literales (palabras reservadas). Su identificador es la representación de su valor y ya tiene un significado en el código fuente de Java 
		 * 
		 */
		
		float gastosMensuales=35684.30f;
		System.out.println(gastosMensuales);
		
		gastosMensuales=42699.2f;
		System.out.println(gastosMensuales);
		
		//variable finales o constantes buena practica escribir en mayusculas
		
		final int SALARIO=15000;
		System.out.println(SALARIO);
		
		
		
	}
	

}
