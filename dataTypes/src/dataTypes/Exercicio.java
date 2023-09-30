package dataTypes;

public class Exercicio {

	public static void main(String[] args) {
		//Enrique, Paola y Mariana se dirigen a la MacStore y deciden comprar un iphone 15 cada uno. La tienda tiene una promoción por el mes patrio: "Si el total de tu compra supera los 25 mil pesos, obten un 10% de descuento". Enrique, Paola y Mariana deciden comprar los tres equipos con una sola tarjeta. Al llegar a caja, la cajera les menciona que la tienda en estos momentos cuenta con una promoción de 12 meses sin intereses, pcor lo tanto, deciden pagar con la TDC de Mariana. ¿Cuál sería el costo total por los 3 equipos sin descuento? ¿Aplicaría el descuento en su compra? ¿Cuál sería el costo total con el descuento aplicado? ¿Cuánto pagarían mensualmente?

 int iphonePrecio=19499;
 float descuento=0.1f;
 int promocionMinimo=25000;
 int cantidadIphone=3; //uno de enrique,paola y mariana
 float precioDescuento;
 float totalDescuento;
 float mensualidad;

 int total=iphonePrecio*cantidadIphone;
 
 if (total>=promocionMinimo) {
	 precioDescuento=total*descuento;
	 totalDescuento=total-precioDescuento;
	 mensualidad=totalDescuento/12;
	 
	 System.out.println("total a pagar: "+total+" por 3 phones 15 con un costo de "+iphonePrecio);
	 System.out.println("si aplica la promocion de 10% tiene un reduccion del: "+precioDescuento);
	 System.out.println("total con el descuento aplicado es: "+totalDescuento);
	 System.out.println("Su mensualidad seria de: "+mensualidad);
	
} else {
	System.out.println("No tiene descuento el precio a pagar es "+total);
}
 
 
	}
}
