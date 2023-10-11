package figura;

public class TestFiguras {

	public static void main(String[] args) {
		// genera las instancias de nuestra clases
		//1. Instancia de la clase Figura
		//Figura Generica=new Figura();// Error porque es clase abstracta
		
		//2 Instancia de un rectangulo
		Figura rectagulo=new Rectangulo(5.0f, 6.5f);//base y altura
		
		//3.2 Instanca de un cirulo
		Figura circulo=new Circulo(3.14, 3.0);
		//Invocacion del metodo
		System.out.println(rectagulo.calcularArea());
		System.err.println(circulo.calcularArea());
	}

}
