package PracticaNo1;

import java.util.Scanner;

public class Superficie {

	private double Longitud;
	private double Anchura;

	public void FijarValor(double vLongitud, double vAnchura) {
		Longitud = vLongitud;
		Anchura = vAnchura;
	}

	public double CalcularSuperficie() {
		double Superficie;
		Superficie = 0.0;

		Superficie = Longitud * Anchura;
		return Superficie;
	}

	public static void main(String[] args) {
		double vLongitud, vAnchura, Superficie;
		vLongitud = 0.0;
		vAnchura = 0.0;
		Superficie = 0.0;

		Scanner sc = new Scanner(System.in);
		Superficie su = new Superficie();

		// Solicitar los valores

		System.out.println("Ingrese el valor de la longitud:");
		vLongitud = sc.nextDouble();
		System.out.println("Ingrese el valor de la anchura:");
		vAnchura = sc.nextDouble();

		su.FijarValor(vLongitud, vAnchura);
		Superficie = su.CalcularSuperficie();

		System.out.printf("La superficie del cuarto es de %.4f", Superficie);

	}

}