package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Collections {
	public static void main(String[] args) {
		
		/*//Array
		//Tipo de datos del array, nombre, instancia del objeto arreglo, los datos
		
		String[] listaDeCompras=new String[] {"Leche","Pan","Huevos"};
		
		//solo imprime el espacio en memoria
		System.out.println(listaDeCompras);
		
		//Imprimir info de listaDeCompras con un forEach
		//Para el dato de tipo String que llamaremos productoAImprimir de la lista de compras, lo vamos a tomar y lo vamos a imprimir
		for(String productoAImprimir : listaDeCompras) {
				System.out.println(productoAImprimir);
			}
		//https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Set.html
		//Que es un Set, para que lo usarian, y sus principales caracteristicas
		*/
		
		// implementación de un arrayList
		//clase general(interfaz),tipo de dato que usare, nombre de mi estructura de datos,instancia de dicha clase general
		
		
		//Hola soy un ArrarList, hijo de una Lista, nieto de una Coleccion
		List<String> listaDecontactos=new ArrayList<>();
		//agrego elemntos del tipo string a mi arrayList llamado listaDecontactos
		listaDecontactos.add("Felipe");
		listaDecontactos.add("Roberto");
		listaDecontactos.add("Alicia");
		listaDecontactos.add("Fatima");
		
		//obtener un elemento de la lista-asignar a una variable
		String datoFelipe=listaDecontactos.get(0);
		System.out.println(datoFelipe);
		
		//Borrar un elemento de la lista
		listaDecontactos.remove(3);
		System.out.println(listaDecontactos);
		
		//imprementacion de un conjunto
		//Sintaxis
		//Interface de donde implento + tipo de dato que usare + nombre que le doy al conjunto + instancia de la clase especifica
		
		Set<String> cartaDeJuego=new HashSet<>();
		
		//agregar elementos
		
		cartaDeJuego.add("As de Corazones");
		cartaDeJuego.add("2 de picas");
		cartaDeJuego.add("Reinca de Treboles");
		
		if(cartaDeJuego.contains("Reinca de Treboles")) {
			System.out.println("La reina de treboles si esta en el conjunto");
		}else {
			System.out.println("No encuentro el elemento solicitado");
		}
		
		
		//Mutabilidad -Map = bases de datos
		
		//Implementacion de un mapa(hashMap)
		Map<String,String> libretaDirecciones=new HashMap<>();
		
		//Agregar elementos a mi libreta de direcciones,dondemi k-nombre y mi v=direccion
		libretaDirecciones.put("Felipe","Tlalnepantla");
		libretaDirecciones.put("Doctor simi","CDMX");
		libretaDirecciones.put("Konoha","Naruto");
		
		//metodo para sacar informacion de la libreta,creando una nueva variable
		String direccionFelipe=libretaDirecciones.get("Felipe");
		String direccionNaruto=libretaDirecciones.get("Naruto");//null

		//impresion
		System.out.println(direccionFelipe);
		System.out.println(direccionNaruto);
		
		
	}
	

	

}//collecciones

/*-Arrays(arreglos)
 * 	es una estructura de datos lineal que contiene elementos del mismo tipo. Los elementos estan almacenados de forma contigua(uno al lado del otro) , yse pueden acceder a ellos a traves de un indice. Las principales caracteristicas de un array son:
 * -Es una estructura de datos fija, generalmente almacena datos del mismo tipo
 * -La longitud de un array se establece al momento de crearlo, y no cambia
 * -Podemos acceder a elementos por medio de un indice
 * -Los arrays pueden contener datos primitivos y objetos
 * -No proporciona metodos adicionales para agregar o eliminar elementos 
 *
 * 
 * Un ejemplo de array es una lista de compras del supermercado
 * 
 * 
 * -ArrayList
 * 
 * 
 * Es una implementacion de una lista (List), es decir, que esta en un nivel abajo de las listas. Utiliza un array dinamico que permite almacenar datos.
 * 
 * Sus principales caracteristicas son:
 * 
 * 	- Tamanio dinamico, a diferencia de los arrays tradicionales, el tamanio de un arrayList si se puede modificar.
 *  - Acceso rapido, podemos acceder a un elemento del arrayList por su posicion o indice
 *  - Coste elevado al momento de insertar o eliminar elementos. Si agrego un elemento, tengo que recorrer todos los demas elementos.
 * 
 * 
 * --set(conjuntos)
 * 
 * Estructura de datos que almacena datos unicos sin orden especificos.Las principales caracteristicas de un son:
 * 
 * 		- No hay elementos duplicados,ya que los conjuntos no los pueden contener. si se intenta agregar un elemento ya existente,la operacion se ignora.
 * 
 * 		- No hay un orden espeficico, los elementos se alamcena sin orden espeficico.
 * 		- La busqueda es mas sencilla, y aque al no tener elementos duplicados se usa una funcion hash para encontrar elementos deseados
 * 
 * Map (mapas)
 * un mapa es una estructura de datos que almacena pares de clave-valor
 * -Almacenamiento con partes K-V
 * -Sin ordenEspecifico(similar a un set)
 * -Busqueda rapida, la busqueda se hace por medio de un valor(key), y usa una funcion interna hash para buscar elementos
 * 
 * 
 * Agenda telefonica(agregar,modificar,eliminar)
 * 
 * 
 */


