package PracticaNo2;

import java.util.Scanner;

public class IMC {

	private double peso;
	private double altura;

	public void FijarValor(double vpeso, double valtura) {
		peso = vpeso;
		altura = valtura;
	}

	public double CalcularIMC() {
		double IMC;
		IMC = 0.0;

		IMC = peso / (altura * altura);
		return IMC;
	}

	public static void main(String[] args) {
		double vpeso, valtura, IMC;
		vpeso = 0.0;
		valtura = 0.0;
		IMC = 0.0;

		Scanner sc = new Scanner(System.in);
	    IMC im = new IMC();

		// Solicitar los valores

		System.out.println("Ingrese el peso en kilogramos:");
		vpeso = sc.nextDouble();
		System.out.println("Ingrese la altura en metros:");
		valtura = sc.nextDouble();

		im.FijarValor(vpeso, valtura);
		IMC = im.CalcularIMC();

		System.out.printf("El índice de masa corporal es de %.2f", IMC);

	}

}
