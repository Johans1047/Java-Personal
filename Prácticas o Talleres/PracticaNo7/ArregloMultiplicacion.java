package PracticaNo7;

import java.util.Scanner;

public class ArregloMultiplicacion {

	private int[] A = new int[20];
	private int[] B = new int[20]; 
	private int[] C = new int[20]; 
	private int numero;
	private int numero2;

	public void ArregloMultiplicacion(int vnumero, int vnumero2) {
		numero = vnumero;
		numero2 = vnumero2;
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getNumero2() {
		return numero2;
	}

	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}

	public void IngresarDatosA() {
		int i, vnumero;
		
		Scanner sc = new Scanner (System.in);
		
		for(i=0;i<20;i=i+1)
		{	
		System.out.printf("Ingrese el valor a insertar en la posición #%d de A:\n", i);
		vnumero = sc.nextInt();
		
		ArregloMultiplicacion(vnumero, vnumero);
		A[i] = numero;
		}
		System.out.println("\n");
		
	}
	
	public void IngresarDatosB() {
		int i, vnumero2;
		
		Scanner sc = new Scanner (System.in);
		
		for(i=0;i<20;i=i+1)
		{	
		System.out.printf("Ingrese el valor a insertar en la posición #%d de B:\n", i);
		vnumero2 = sc.nextInt();
		
		ArregloMultiplicacion(vnumero2, vnumero2);
		B[i] = numero2;
		}
		
		System.out.println("\n");
		
	}
	
	public void MultiplicacionC() {
		int i, aux1, aux2, h;
		
		aux1 = 0;
		aux2 = 19;
		for(i=0;i<20;i=i+1)
		{
		C[i] = A[aux1] * B[aux2];
		aux1 = aux1 + 1;
		aux2 = aux2 - 1;
		}
		
		for(h=0;h<20;h=h+1)
		{
		System.out.println(C[h]);
		System.out.println("\t");
		}		
	}
}