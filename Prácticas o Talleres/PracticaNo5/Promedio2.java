package PracticaNo5;

import java.util.Scanner;

public class Promedio2 {

	private String nombre; 
	private String apellido;
	private String materia;
	private double nota1, nota2, nota3;

	public void Promedio2(String vnombre, String vapellido, String vmateria, double vnota1, double vnota2, double vnota3) {
		nombre = vnombre;
		apellido = vapellido;
		materia = vmateria;
		nota1 = vnota1;
		nota2 = vnota2;
		nota3 = vnota3;
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

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
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

	public double CalcularPromedio2() {
		double promedio;
		promedio = 0.0;

		promedio = (nota1 + nota2 + nota3) / 3;
		return promedio;
	}

	public static void main(String[] args) {
		String vnombre, vapellido, vmateria;
		double vnota1, vnota2, vnota3, prom;
		int i;
		
		i = 1;
		vnota1 = 0.0;
		vnota2 = 0.0;
		vnota3 = 0.0;

		Scanner sc = new Scanner(System.in);
		Promedio2 pr = new Promedio2();

		// Solicitar los valores

		while(i<11)
		{	
		System.out.printf("Ingrese el nombre del estudiante %d:\n", i);
		vnombre = sc.next();
		System.out.printf("", i);
		vapellido = sc.next();
		System.out.println("Ingrese la materia dada:");
		vmateria = sc.next();
		System.out.println("Ingrese la nota 1:");
		vnota1 = sc.nextDouble();
		System.out.println("Ingrese la nota 2:");
		vnota2 = sc.nextDouble();
		System.out.println("Ingrese la nota 3:");
		vnota3 = sc.nextDouble();

		pr.Promedio2(vnombre, vapellido, vmateria, vnota1, vnota2, vnota3);
		prom = pr.CalcularPromedio2();

		System.out.printf("Nombre del Alumno #%d: %s %s\n", i, vnombre, vapellido);
		System.out.printf("Materia: %s\n\n", vmateria);
		System.out.printf("Nota1: %.2f\n", vnota1);
		System.out.printf("Nota2: %.2f\n", vnota2);
		System.out.printf("Nota3: %.2f\n\n", vnota3);
		System.out.printf("El Promedio es de: %.2f\n\n", prom);
		
		i = i + 1;
		
		}
	}

}