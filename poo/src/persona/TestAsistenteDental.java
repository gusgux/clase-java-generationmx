package persona;

public class TestAsistenteDental {
	public static void main(String[] args){
		
		//Instancia de nuestro asistente
		AsistenteDental Francisca=new AsistenteDental("05/10/2023",875.40d);
		
		Francisca.mostrarDatosAsistente();
		
		//Mostrar el sueldo (despues del getter)
		System.out.println(Francisca.getSalario());
		
		//Modificar salario con setter
		Francisca.setSalario(30.0);//si cumple la condicion
		//Imprimir el nuevo salario de francisca
		System.out.println(Francisca.getSalario());

		
	}
	
	
	
}
