package animal;

public class Perro extends Animal{
	public static void main(String[] args) {
		
		
		Animal Generico=new Animal();
		Generico.hacerSonido();
		
		//Generar la instancia de mi perrito
		//Si hay polimorfismo, por que es el equivalente a decir a decir "instancia un animal que es un perrito"
		//referenciar primero la clase general, y luego la instancia particular, permite el polimorfismo
		Animal Chilaquile = new Perro();
		
		Chilaquile.hacerSonido();
}//Metodo main
	//"Polimorfear" o sobreescribir el metodo heredado
	
	@Override //con la anotacion @override , le decimos a java que el metodo hacer solido sera sobreescrito
	public void hacerSonido() {
		System.out.println("El perrito ladra y hace guau");
	}//metodo hacerSonido heredado de animal
	
}
