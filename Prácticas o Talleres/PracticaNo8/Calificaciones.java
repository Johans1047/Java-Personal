package PracticaNo8;

import java.util.Scanner;

public class Calificaciones {

	private int[] arreglo = new int[21]; 
	private int numero;

	public void Calificaciones(int vnumero) {
		numero = vnumero;
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void IngresarCalificaciones() {
		int i, vnumero;
		
		Scanner sc = new Scanner (System.in);
		
		for(i=0;i<20;i=i+1)
		{	
		System.out.printf("Ingrese la calificación del estudiante #%d:\n", i+1);
		vnumero = sc.nextInt();
		
		Calificaciones(vnumero);
		arreglo[i] = numero;
		}
		
	}	
	
	public void AnalizarFrecuencia() {
		int x, posicion = 0, mayor = 0;
		
		while (posicion < 20) {
			x = arreglo[posicion];
			System.out.printf("\nLa calificación '%d' ha sido obtenida por:", x);
			
			int contador = 1;
			
			while (x == arreglo[++posicion]) {
				contador++;
			}
			
			if(contador > mayor){
				mayor = contador;
			}
			
			if(contador == 1) {
			System.out.printf(" %d alumno", contador);
			}
			
			else {
			System.out.printf(" %d alumnos", contador);
			}
			
		}
		
		System.out.printf("\n\nLa mayor frecuencia ha sido: %d", mayor);
		
	}
	
	public void OrdenarNumeros() {
		
		int frecuencia = 0, i, j = 0;
		
		for(i=0;i<20;i=i+1) {
			
			frecuencia = arreglo[i];
			
			j = i;
			
			while(j > 0 && frecuencia > arreglo[j-1]){
				
				arreglo[j] = arreglo[j-1];
				
				j = j - 1;
			}
			
			arreglo[j] = frecuencia;
		}
		
   }
		
		

}


