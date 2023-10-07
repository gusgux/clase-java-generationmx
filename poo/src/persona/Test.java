package persona;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {
	//Metodo principal para instancias mis clases
	public static void main(String[] args) {
		
		
		//instancia de persona
		Persona angel = new Persona("angel","ek", (byte) 28,"9655558","exmaple@gmail.com");
		
		
		System.out.println(angel);// imprime el espacio en memoria
		angel.imprimirInfo();// imprime informacion
		angel.saludar();// imprime saludo
	
		//instanca de dentistia
		Dentista simi=new Dentista("Dr.simi","Lares",(byte)50,"1351465","simi@lares.com","Odontologia","525545454568"," Consultorio 500","intermedio","matutino",600);
		System.out.println("************************");
		System.out.println(simi);
		simi.calcularSalario();
		simi.imprimirInfoDentista();
		
		//instancia de Paciente con todos los datos
		
		Paciente chencho=new Paciente("chingo113", "RH-positivo", true, true, "05/oct/2023", "Dr. Simi Lare", false);
		
		System.out.println("*********");
		System.out.println(chencho);
		
		//instancia de paciente con todos los datos
		Paciente masiosare=new Paciente("masioare2354", false, false);
		System.out.println("*********");
		System.out.println(masiosare);
		
		System.out.println("*********");
		System.out.println(masiosare);
	
		System.out.println("*********");
		masiosare.getSeguroGastoMedicos();
		
		System.out.println(masiosare);	
		
		//Implementacion de Arraylist de Dentistas
		List<Dentista> listaDentistasArraList=new ArrayList<Dentista>();
		//Primero genero una instancia del artista
		Dentista drChapatin=new Dentista("Chapatin", "chespirito", (byte)45,"1351465","chapatin@gmail.com","Odontologia","546545"," Consultorio 200","General","matutino", 450);
		//Luego la agrego a la lista
		//si agrego la instancia  a una varriable , puedo imprimir su informacioSn usado un totring o un método mostrarInfo()
		listaDentistasArraList.add(drChapatin);
		
		//hago una instancia y la agrego directamente a la lista
		listaDentistasArraList.add(new Dentista("Dr.simi","Lares",(byte)50,"1351465","simi@lares.com","Odontologia","525545454568"," Consultorio 500","intermedio","matutino",600));
		//si gebnero la instancia y agrego directamente al arrayList, para sacar el dato tendre que utilizar un forEach o algun ciclo para impirmir dato por dato
			
		System.out.println("*******************List Array******************");
		System.out.println(listaDentistasArraList);
		
		System.err.println("**************Set**************");

		//implementacion de lista de Dentista con hashSet
		Set<Dentista> conjuntoDentistas=new HashSet<Dentista>();
		
		//agregando Dentista a mi conjunto
		conjuntoDentistas.add(new Dentista("Dr.simi","Lares",(byte)50,"1351465","simi@lares.com","Odontologia","525545454568"," Consultorio 500","intermedio","matutino",600));
		
		System.out.println(conjuntoDentistas);
		
		System.err.println("**************Map**************");
		//implementacion de un hashMao de Dentista
		Map<String, Dentista> mapaDentistas=new HashMap<String, Dentista>();
		
		//agregar un dentista a mi mapa
		
	mapaDentistas.put("Dr house",new Dentista("Dr.Gregory","House",(byte)55,"1351435165","Gregory@house.com","Cirujano","95558404568"," Consultorio 600","Avanzado","matutino",1400));
	mapaDentistas.put("chapatin", drChapatin);
	
	
	//imprimir el objecto doctor House
	 Dentista DoctorBuscado=mapaDentistas.get("Dr house");
	 DoctorBuscado.imprimirInfoDentista();
	 System.err.println(mapaDentistas);

	 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	 
		
		
		
		
		
		
		
		
		
		
		
	}//cierre main
	
	

	

}//cierre class
