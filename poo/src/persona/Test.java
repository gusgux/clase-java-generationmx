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
		simi.calcularSalario();
		simi.imprimirInfoDentista();
		
	
	}

	

}
