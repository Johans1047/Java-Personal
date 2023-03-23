package PracticaNo3;

import java.util.Scanner;

public class Llantas {

	private double cantidad;
	private double precio;

	public void FijarValor(double vcantidad, double vprecio) {
		cantidad = vcantidad;
		precio = vprecio;
	}

	public double CalcularDescuento() {
		double Descuento, total;
		Descuento = 0.0;
		total = 0.0;
		total = precio * cantidad;
		
		if (cantidad > 4)
		{	
			Descuento = total - (total * 0.10);
			return Descuento;
		}

		else {
			return total;
		}
		
	}

	public static void main(String[] args) {
		double vcantidad, vprecio, descuento;
		vcantidad = 0.0;
		vprecio = 0.0;

		Scanner sc = new Scanner(System.in);
	    Llantas llant = new Llantas();

		// Solicitar los valores

		System.out.println("Ingrese la cantidad de llantas:");
		vcantidad = sc.nextDouble();
		System.out.println("Ingrese el precio inicial de cada llanta:");
		vprecio = sc.nextDouble();

		llant.FijarValor(vcantidad, vprecio);
		descuento = llant.CalcularDescuento();

		System.out.printf("La cantidad de llantas solicitadas es de %.2f\n", vcantidad);
		System.out.printf("El precio inicial de cada llanta es %.2f\n", vprecio);
		System.out.printf("El precio total a pagar es %.2f", descuento);
		
	}

}