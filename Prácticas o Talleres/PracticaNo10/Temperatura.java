package PracticaNo10;

import java.util.Scanner;

public class Temperatura {

	private double[][] temperatura = new double[2][7]; 
	private double numero;
	private Scanner sc = new Scanner (System.in);

	public void Temperatura(double vnumero) {
		numero = vnumero;
	}
	
	public double getNumero() {
		return numero;
	}

	public void setNumero(double numero) {
		this.numero = numero;
	}

	public void IngresarTemperaturas() {
		int x, y, h;
		double vnumero, menor = 0.0, temedia = 0.0, temedia2 = 0.0, temedia3 = 0.0;
		double temedia4 = 0.0, temedia5 = 0.0, temedia6 = 0.0, temedia7 = 0.0;
		double lectura = 0.0;
		
		
		for(x=0;x<2;x=x+1)
		{	

		for(y=0;y<7;y=y+1) {
			System.out.println("Ingrese la temperatura màxima de cada día (las 7 primeras) y la temperatura mínima de cada día (las 7 siguientes): ");
			vnumero = sc.nextDouble();
			
			Temperatura(vnumero);
			temperatura[x][y] = numero;
		}		

		}
		
		System.out.println("\tLunes Martes Miércoles Jueves Viernes Sábado Domingo\n");
		
		for(x=0;x<2;x=x+1)
		{	

		for(y=0;y<7;y=y+1) {
			System.out.printf("\t%.2f", temperatura[x][y]); 
		}
		
		System.out.println("\n");
		
		}
		
        temedia = (temperatura[0][0] + temperatura[1][0]) / 2;
        temedia2 = (temperatura[0][1] + temperatura[1][1]) / 2;
        temedia3 = (temperatura[0][2] + temperatura[1][2]) / 2;
        temedia4 = (temperatura[0][3] + temperatura[1][3]) / 2;
        temedia5 = (temperatura[0][4] + temperatura[1][4]) / 2;
        temedia6 = (temperatura[0][5] + temperatura[1][5]) / 2;
        temedia7 = (temperatura[0][6] + temperatura[1][6]) / 2;
        
        System.out.printf("La temperatura media del lunes es: %.2f \n", temedia);
        System.out.printf("La temperatura media del martes es: %.2f \n", temedia2);
        System.out.printf("La temperatura media del miércoles es: %.2f \n", temedia3);
        System.out.printf("La temperatura media del jueves es: %.2f \n", temedia4);
        System.out.printf("La temperatura media del viernes es: %.2f \n", temedia5);
        System.out.printf("La temperatura media del sábado es: %.2f \n", temedia6);
        System.out.printf("La temperatura media del domingo es: %.2f \n", temedia7);
		
       for(h=0;h<7;h=h+1) {
    	   
        if(temperatura[1][h] < menor) {
        	menor = temperatura[1][h];
        }
        
       }
       
       if(menor == temperatura[1][0]) {
    	   System.out.printf("La temperatura más baja es %.2f y corresponde al lunes \n", menor);
       }
       
       if(menor == temperatura[1][1]) {
    	   System.out.printf("La temperatura más baja es %.2f y corresponde al martes \n", menor);
       }
       
       if(menor == temperatura[1][2]) {
    	   System.out.printf("La temperatura más baja es %.2f y corresponde al miércoles \n", menor);
       }
       
       if(menor == temperatura[1][3]) {
    	   System.out.printf("La temperatura más baja es %.2f y corresponde al jueves \n", menor);
       }
       
       if(menor == temperatura[1][4]) {
    	   System.out.printf("La temperatura más baja es %.2f y corresponde al viernes \n", menor);
       }
       
       if(menor == temperatura[1][5]) {
    	   System.out.printf("La temperatura más baja es %.2f y corresponde al sábado \n", menor);
       }
       
       if(menor == temperatura[1][6]) {
    	   System.out.printf("La temperatura más baja es %.2f y corresponde al domingo \n", menor);
       }
       
       System.out.println("\nIntroduzca una temperatura: ");
	   lectura = sc.nextDouble();
	   
	   if(lectura == temperatura[0][0]) {
    	   System.out.printf("La temperatura %.2f corresponde con la temperatura máxima del lunes \n", lectura);
       }
	   
	   if(lectura == temperatura[0][1]) {
    	   System.out.printf("La temperatura %.2f corresponde con la temperatura máxima del martes \n", lectura);
       }
	   
	   if(lectura == temperatura[0][2]) {
    	   System.out.printf("La temperatura %.2f corresponde con la temperatura máxima del miércoles \n", lectura);
       }
	   
	   if(lectura == temperatura[0][3]) {
    	   System.out.printf("La temperatura %.2f corresponde con la temperatura máxima del jueves \n", lectura);
       }
	   
	   if(lectura == temperatura[0][4]) {
    	   System.out.printf("La temperatura %.2f corresponde con la temperatura máxima del viernes \n", lectura);
       }
	   
	   if(lectura == temperatura[0][5]) {
    	   System.out.printf("La temperatura %.2f corresponde con la temperatura máxima del sábado \n", lectura);
       }
	   
	   if(lectura == temperatura[0][6]) {
    	   System.out.printf("La temperatura %.2f corresponde con la temperatura máxima del domingo \n", lectura);
       }
       		
	}
	
	public int OpcionesMenu()
	{
		int opcion;
		
		System.out.println("\t\t\n\n           UNIVERSIDAD TECNOLOGICA DE PANAMA");
		System.out.println("\t \t FACULTAD DE SISTEMAS");
		System.out.println("\t \tPROGRAMACION DE SOFTWARE I\n\n");
		System.out.println("1. Ingresar las temperaturas");
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
		
		Temperatura tem = new Temperatura();

		switch (menu) 
		{
			case 1: 
			{
				System.out.println("Escogió la opción 1: \n");
				tem.IngresarTemperaturas();
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