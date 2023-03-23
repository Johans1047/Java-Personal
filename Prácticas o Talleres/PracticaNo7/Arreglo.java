package PracticaNo7;

import java.util.Scanner;

public class Arreglo {

	private int[] arreglo = new int[10];
	private int[] arreglo2 = new int[10]; 
	private int numero;

	public void Arreglo(int vnumero) {
		numero = vnumero;
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void IngresarDatos() {
		int i, vnumero;
		
		Scanner sc = new Scanner (System.in);
		
		for(i=0;i<10;i=i+1)
		{	
		System.out.printf("Ingrese el valor a insertar en la posición #%d:\n", i);
		vnumero = sc.nextInt();
		
		Arreglo(vnumero);
		arreglo[i] = numero;
		}
		
		System.out.println("\n");
		
	}
	
	public void ArregloInverso() {
		int i, aux, f;
		
		aux = 9;
		for(i=0;i<10;i=i+1)
		{
		arreglo2[i] = arreglo[aux];
		aux = aux - 1;
		}	
		
		for(f=0;f<10;f=f+1)
		{
		System.out.println(arreglo2[f]);
		System.out.println("\t");
		}
	}

}