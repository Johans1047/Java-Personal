package PracticaNo3;

import java.util.Scanner;

public class Pago {

	private double horas;
	private double tarifa;

	public void FijarValor(double vhoras, double vtarifa) {
		horas = vhoras;
		tarifa = vtarifa;
	}

	public double CalcularPago() {
		double pagonuevo, total;
		pagonuevo = 0.0;
		total = 0.0;
		total = horas * tarifa;
		
		if (horas > 40)
		{	
			pagonuevo = total + ((horas - 40) * (tarifa/2));
			return pagonuevo;
		}

		else {
			return total;
		}
		
	}

	public static void main(String[] args) {
		double vhoras, vtarifa, pago;
		vhoras = 0.0;
		vtarifa = 0.0;

		Scanner sc = new Scanner(System.in);
	    Pago pa = new Pago();

		// Solicitar los valores

		System.out.println("Ingrese la cantidad de hotas trabajadas:");
		vhoras = sc.nextDouble();
		System.out.println("Ingrese la tarifa por hora:");
		vtarifa = sc.nextDouble();

		pa.FijarValor(vhoras, vtarifa);
		pago = pa.CalcularPago();

		System.out.printf("La cantidad de horas trabajadas es %.2f\n", vhoras);
		System.out.printf("La tarifa por hora es %.2f\n", vtarifa);
		System.out.printf("El precio total a pagar esta semana es %.2f", pago);
		
	}

}