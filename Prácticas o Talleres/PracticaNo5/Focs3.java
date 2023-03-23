package PracticaNo5;

import java.util.Scanner;

public class Focs3 {

	private int cantidad, cantidad2, verde, blanco, rojo; 

	public void Focs3(int vcantidad, int vcantidad2, int vverde, int vblanco, int vrojo) {
		cantidad = vcantidad;
		cantidad2 = vcantidad2;
		verde = vverde;
		blanco = vblanco;
		rojo = vrojo;
	}

	public int getCantidad() {
		return cantidad;
	}


	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getCantidad2() {
		return cantidad2;
	}


	public void setCantidad2(int cantidad2) {
		this.cantidad2 = cantidad2;
	}


	public int getVerde() {
		return verde;
	}


	public void setVerde(int verde) {
		this.verde = verde;
	}


	public int getBlanco() {
		return blanco;
	}


	public void setBlanco(int blanco) {
		this.blanco = blanco;
	}


	public int getRojo() {
		return rojo;
	}


	public void setRojo(int rojo) {
		this.rojo = rojo;
	}


	public int CalcularTotalFocs3() {
		int total;
	    
		total = 0;
		total = verde + blanco + rojo;

		return total;
	}

	public static void main(String[] args) {
		int vcantidad, vcantidad2, vverde, vblanco, vrojo, i, resultado;
		
		i = 1;
		vverde = 0;
		vblanco = 0;
		vrojo = 0;

		Scanner sc = new Scanner(System.in);
		Focs3 fc = new Focs3();
		
		System.out.printf("Ingrese la cantidad de lotes a pedir:\n");
		vcantidad = sc.nextInt();

		System.out.printf("Ingrese la cantidad de focos a pedir:\n");
		vcantidad2 = sc.nextInt();

		// Solicitar los valores

		do
		{	
		System.out.println("\nIngrese la cantidad de focos verdes:");
		vverde = sc.nextInt();
		System.out.println("Ingrese la cantidad de focos blancos:");
		vblanco = sc.nextInt();
		System.out.println("Ingrese la cantidad de focos rojos:");
		vrojo = sc.nextInt();

		fc.Focs3(vcantidad, vcantidad2, vverde, vblanco, vrojo);
		resultado = fc.CalcularTotalFocs3();

		System.out.printf("\nLote #%d:\n", i);
		System.out.printf("Focos verdes: %d\n", vverde);
		System.out.printf("Focos blancos: %d\n", vblanco);
		System.out.printf("Focos rojos: %d\n\n", vrojo);
		System.out.printf("El total de focos es: %d\n\n", resultado);
		System.out.printf("El total de pedidos fue: %d\n\n", vcantidad2);
		
		i = i + 1;

		if(resultado == vcantidad2) {
			System.out.println("Cantidad de focos correcta");
		}

		else {
			System.out.println("Cantidad de focos incorrecta, pedir los focos de nuevo.");
			i = i - 1;
		}	

		}while(i<=vcantidad);
		
		System.out.printf("Total de lotes: %d", vcantidad);
	}

}