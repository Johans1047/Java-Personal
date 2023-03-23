package PracticaNo8;

import java.util.Scanner;

public class Promedios {

	private double[] arreglo = new double[100]; 
	private double numero;
	private Scanner sc = new Scanner (System.in);

	public void Promedios(double vnumero) {
		numero = vnumero;
	}
	
	public double getNumero() {
		return numero;
	}

	public void setNumero(double numero) {
		this.numero = numero;
	}

	public void IngresarCalificaciones() {
		int i, num = 0;
		double vnumero, total = 0.0, porcentaje = 0.0, porcentaje2 = 0.0;
		double promedio = 0.0, cantidad = 0.0;
		
		System.out.printf("Ingrese la cantidad de estudiantes: \n");
		cantidad = sc.nextInt();
		
		for(i=0;i<cantidad;i=i+1)
		{	
		System.out.printf("Ingrese la calificación del estudiante #%d:\n", i+1);
		vnumero = sc.nextDouble();
		
		if (vnumero > 1300) {
			porcentaje = porcentaje + 1;
		}
		
		if (vnumero >= 1500) {
			num = num + 1;
		}
		
		total = total + vnumero;
		
		Promedios(vnumero);
		arreglo[i] = numero;
		}
		
		promedio = total / cantidad;
		porcentaje2 = (porcentaje / cantidad) * (100);
		
		System.out.printf("\nEl promedio del grupo es: %.0f", promedio);
		System.out.printf("\n\nEl porcentaje de alumnos aprobados con notas mayor a 1300: %.0f", porcentaje2);
		System.out.println("%");
		System.out.printf("\nEl número de alumnos cuya calificación sea mayor o igual a 1500: %d", num);
		
	}
	
	public int OpcionesMenu()
	{
		int opcion;
		
		System.out.println("\t\t\n\nUNIVERSIDAD TECNOLOGICA DE PANAMA");
		System.out.println("\t \t FACULTAD DE SISTEMAS");
		System.out.println("\t \tPROGRAMACION DE SOFTWARE I\n\n");
		System.out.println("1. Calcular las calificaciones de un grupo");
		System.out.println("2. Salir");
		System.out.println("\n \nSeleccione una opción: ");
		opcion = sc.nextInt();
		sc.nextLine();
		
		return opcion;
	}
	
	public int Menu()
	{
		int menu, fin;
		fin=0;
		menu = this.OpcionesMenu();
		
		Promedios pr = new Promedios();

		switch (menu) 
		{
			case 1: 
			{
				System.out.println("Escogiò la opción 1: \n");
				pr.IngresarCalificaciones();
				break;
			}

			case 2:
			{
				System.out.println("A continuación saldrá del programa\n");
				fin = 1;
				break;
			}
			
			default:
			{
				System.out.println("Ha ingresado un número inválido, inténtelo de nuevo");
			}
			
		}
		return fin;
	}
		

}