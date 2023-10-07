package persona;


public class AsistenteDental {
	//1 Atributos privados
	private String fechaIngreso;
	private double	salario;
	
	//constructor
	public AsistenteDental(String fechaIngreso,double salario) {
		this.fechaIngreso=fechaIngreso;
		this.salario=salario;
		
	}//constructor

	//3 Metodos
	//Metodo para imprimir informacion
		public void mostrarDatosAsistente() {
			System.out.println("La fecha de ingreso del asistente es: " + fechaIngreso);
			System.out.println("El salario del asistente es: " + salario);
		}//Metodo para imprimir informacion
		
		
		//getters y setters para poder acceder a mis datos privados y poder realizar operaciones con ellos
		//sin getter, la informacion me aparece en null
		//sin setter, no puedo cambiar la informacion
		
		//Mostrar el sueldo(despues del getter)
		
		//este getter perimite retornar el dato de la fecha de ingreso en formato string
		public String getFechaIngreso() {
			return fechaIngreso;
		}//getFechaIngreso
		
		
		//getter para salario
		public double getSalario() {
			return salario;
		}
		
		//setter para salario (modificar los datos)
		public void setSalario(double nuevoSalario) {
			if (nuevoSalario >0 && nuevoSalario <100) {
				salario = nuevoSalario;
			}//cierre if
		}//cierre setter
		
		
		
		
		
		
		
}

