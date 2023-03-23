package PracticaNo4;

import java.util.Scanner;

public class CalcularCalificacion {

	public static void main(String[] args) {
		int vcal1, vcal2, vcal3, resultado;
		vcal1 = 0;
		vcal2 = 0;
		vcal3 = 0;
		
		Scanner sc = new Scanner(System.in);
	    Calificacion ca = new Calificacion();

		// Solicitar los valores

		System.out.println("Ingrese la calificación 1:");
		vcal1 = sc.nextInt();
		System.out.println("Ingrese la calificación 2:");
		vcal2 = sc.nextInt();
		System.out.println("Ingrese la calificación 3:");
		vcal3 = sc.nextInt();
				
		ca.Calificacion(vcal1, vcal2, vcal3);
		resultado = ca.CalcularCalificacion();
		
		System.out.printf("\n", resultado);
							
	   }
	
	

}
