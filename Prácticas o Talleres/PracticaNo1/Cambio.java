package PracticaNo1;

import java.util.Scanner;

public class Cambio {

	private double dolares;

	public void FijarValor(double vdolares) {
		dolares = vdolares;
	}

	public double CalcularCambio() {
		double cambio;
		cambio = 0.0;
		cambio = dolares * 3640;
		return cambio;
	}

	public static void main(String[] args) {
		double vdolares, Cambio;
		vdolares = 0.0;
		Cambio = 0.0;

		Scanner sc = new Scanner(System.in);
		Cambio ca = new Cambio();

		// Solicitar el valor

		System.out.println("Introduza la cantidad de Dólares a cambiar:");
		vdolares = sc.nextDouble();

		ca.FijarValor(vdolares);
		Cambio = ca.CalcularCambio();

		System.out.printf("Cantidad de Dólares a cambiar: %.2f\n", vdolares);
		System.out.printf("Cantidad de Pesos a recibir: %.2f", Cambio);

	}

}