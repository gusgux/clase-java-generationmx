package persona;

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
		
	
	}

	

}
