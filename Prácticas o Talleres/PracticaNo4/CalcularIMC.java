package PracticaNo4;

import java.util.Scanner;

public class CalcularIMC {

   public static void main(String[] args) {
	double vpeso, vtalla, indice;
	vpeso = 0.0;
	vtalla = 0.0;
	
	Scanner sc = new Scanner(System.in);
    IMC im = new IMC();

	// Solicitar los valores

	System.out.println("Ingrese el peso en Kg:");
	vpeso = sc.nextDouble();
	System.out.println("Ingrese la talla en metros:");
	vtalla = sc.nextDouble();
	
	
	im.IMC(vpeso, vtalla);
	indice = im.CalcularIMC();

	System.out.printf("\nYa que su imc es: %.2f",indice);
	
		
   }

 

}