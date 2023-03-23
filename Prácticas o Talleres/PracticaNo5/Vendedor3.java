package PracticaNo5;

import java.util.Scanner;

public class Vendedor3 {

	private int cantidad; 
	private double sueldo, venta1, venta2, venta3;

	public void Vendedor3(int vcantidad, double vsueldo, double vventa1, double vventa2, double vventa3) {
		cantidad = vcantidad;
		sueldo = vsueldo;
		venta1 = vventa1;
		venta2 = vventa2;
		venta3 = vventa3;
	}
	
	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public double getVenta1() {
		return venta1;
	}

	public void setVenta1(double venta1) {
		this.venta1 = venta1;
	}

	public double getVenta2() {
		return venta2;
	}

	public void setVenta2(double venta2) {
		this.venta2 = venta2;
	}

	public double getVenta3() {
		return venta3;
	}

	public void setVenta3(double venta3) {
		this.venta3 = venta3;
	}

	public double CalcularComisiones3() {
		double cs1, cs2, cs3, tcs;
	    cs1 = 0.0;
	    cs2 = 0.0;
	    cs3 = 0.0;
	    
	    cs1 = venta1 * 0.10;
	    cs2 = venta2 * 0.10;
	    cs3 = venta3 * 0.10;
	    tcs = cs1 + cs2 + cs3;

		return tcs;
	}

	public double CalcularTotal3() {
		double cs1, cs2, cs3, tcs, total;
	    cs1 = 0.0;
	    cs2 = 0.0;
	    cs3 = 0.0;
	    
	    cs1 = venta1 * 0.10;
	    cs2 = venta2 * 0.10;
	    cs3 = venta3 * 0.10;
	    tcs = cs1 + cs2 + cs3;
	    total = tcs + sueldo;

		return total;
	}

	public static void main(String[] args) {
		double vsueldo, vventa1, vventa2, vventa3, resultado, resultado2;
		int i, vcantidad;
		
		i = 1;
		vventa1 = 0.0;
		vventa2 = 0.0;
		vventa3 = 0.0;

		Scanner sc = new Scanner(System.in);
		Vendedor3 vr = new Vendedor3();
		
		System.out.printf("Ingrese la cantidad de vendedores a pagar:\n");
		vcantidad = sc.nextInt();

		// Solicitar los valores

		do
		{	
		System.out.printf("Ingrese el sueldo base para el vendedor #%d:\n", i);
		vsueldo = sc.nextDouble();
		System.out.println("Ingrese la venta 1:");
		vventa1 = sc.nextDouble();
		System.out.println("Ingrese la venta 2:");
		vventa2 = sc.nextDouble();
		System.out.println("Ingrese la venta 3:");
		vventa3 = sc.nextDouble();

		vr.Vendedor3(vcantidad, vsueldo, vventa1, vventa2, vventa3);
		resultado = vr.CalcularComisiones3();
		resultado2 = vr.CalcularTotal3();

		System.out.printf("\nVendedor #%d:\n", i);
		System.out.printf("Venta1: %.2f\n", vventa1);
		System.out.printf("Venta2: %.2f\n", vventa2);
		System.out.printf("Venta3: %.2f\n\n", vventa3);
		System.out.printf("El total de comisiones es de: %.2f\n\n", resultado);
		System.out.printf("El total a pagar es de: %.2f\n\n", resultado2);
		
		i = i + 1;
		
		}while(i<=vcantidad);
	}

}