package PracticaNo6;

import java.util.Scanner;

public class Calificacion {

	private String nombre; 
	private String apellido;
	private int cantidad;
	private double nota1, nota2, nota3, nota4;

	public void Calificacion(String vnombre, String vapellido, int vcantidad, double vnota1, double vnota2, double vnota3, double vnota4) {
		nombre = vnombre;
		apellido = vapellido;
		cantidad = vcantidad;
		nota1 = vnota1;
		nota2 = vnota2;
		nota3 = vnota3;
		nota4 = vnota4;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}
	
	public double getNota4() {
		return nota4;
	}

	public void setNota4(double nota4) {
		this.nota4 = nota4;
	}

	public double CalcularCalificacion() {
		double promedio;
		promedio = 0.0;

		promedio = (nota1 + nota2 + nota3 + nota4) / 4;
		return promedio;
	}
	
	public char CalcularLiteral() {
		double promedio; 
		char literal;
		
		promedio = 0.0;

		promedio = (nota1 + nota2 + nota3 + nota4) / 4;
		
		if (promedio > 90) {
			literal = 'A';
		}
		
		else if (promedio > 80) {
			literal = 'B';
		}
		
		else if (promedio > 70) {
			literal = 'C';
		}
		
		else if (promedio > 60) {
			literal = 'D';
		}
		
		else {
			literal = 'F';
		}
		
		return literal;
	}

	public static void main(String[] args) {
		String vnombre, vapellido;
		double vnota1, vnota2, vnota3, vnota4, prom;
		char letra;
		int i, vcantidad;
		
		vnota1 = 0.0;
		vnota2 = 0.0;
		vnota3 = 0.0;
		vnota4 = 0.0;

		Scanner sc = new Scanner(System.in);
	    Calificacion ca = new Calificacion();
		
		System.out.printf("Ingrese la cantidad de alumnos que hay en el salón:\n");
		vcantidad = sc.nextInt();
		
		// Solicitar los valores

		for(i=1;i<=vcantidad;i=i+1)
		{	
		System.out.printf("Ingrese el nombre del estudiante %d:\n", i);
		vnombre = sc.next();
		System.out.printf("", i);
		vapellido = sc.next();
		System.out.println("Ingrese la nota 1:");
		vnota1 = sc.nextDouble();
		System.out.println("Ingrese la nota 2:");
		vnota2 = sc.nextDouble();
		System.out.println("Ingrese la nota 3:");
		vnota3 = sc.nextDouble();
		System.out.println("Ingrese la nota 4:");
		vnota4 = sc.nextDouble();

		ca.Calificacion(vnombre, vapellido, vcantidad, vnota1, vnota2, vnota3, vnota4);
		prom = ca.CalcularCalificacion();
		letra = ca.CalcularLiteral();

		System.out.printf("\nNombre del Alumno #%d: %s %s\n", i, vnombre, vapellido);
		System.out.printf("Nota1: %.2f\n", vnota1);
		System.out.printf("Nota2: %.2f\n", vnota2);
		System.out.printf("Nota3: %.2f\n", vnota3);
		System.out.printf("Nota4: %.2f\n\n", vnota4);
		System.out.printf("El Promedio es de: %.2f\n", prom);
		System.out.printf("La literal corresponde a una: %c \n\n", letra);
		
		}
	}

}