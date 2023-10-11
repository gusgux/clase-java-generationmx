package figura;
//1 Aplicamos herencia
public class Rectangulo extends Figura {
	//Parametros
	double base;
	double altura;
	//constructor
	public Rectangulo(double base,double altura) {
		this.base=base;
		this.altura=altura;
	}
	@Override
	public double calcularArea() {
		double formulaRectangulo=base*altura;
		return formulaRectangulo;
	}

}
