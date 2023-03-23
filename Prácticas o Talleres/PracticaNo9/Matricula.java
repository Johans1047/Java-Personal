package PracticaNo9;

import java.util.Scanner;

public class Matricula {

    private static String [] carrera = new String [5];
    private static int [] estudiantes = new int[5];
    private static int [] aux = new int[1];
    private static int numero;
    private static String nombre; 

   public void Matricula(String vnombre, int vnumero){
	   nombre = vnombre;
	   numero = vnumero;
   }
   
   public static int getNumero() {
		return numero;
	}

	public static void setNumero(int numero) {
		Matricula.numero = numero;
	}

	public static String getNombre() {
		return nombre;
	}

	public static void setNombre(String nombre) {
		Matricula.nombre = nombre;
	}
   
   public void IngresarDatosCarreras() {
	   
	   Scanner sc = new Scanner (System.in);
	   
        int i;
        String vnombre;
        
        for(i=0;i<5;i=i+1)
        {
            System.out.println("Ingrese el nombre de la carrera: ");
            vnombre = sc.nextLine();
            carrera[i] = vnombre;
        }
        
        System.out.println("Sus carreras son: ");

        for (i=0;i<5;i=i+1) {
            System.out.println(carrera[i]);
        }
}

public void IngresarDatosMatriculas() {
	  
     Scanner sc = new Scanner (System.in);

        int i, total=0, vnumero;
        
        for (i=0;i<5;i=i+1)
        {
            System.out.println("Ingrese la cantidad de estudiantes en la carrera de " + carrera[i] + ":");
            vnumero = sc.nextInt();
            estudiantes[i] = vnumero;
            
            total = total + vnumero;
        }
    
        aux[0] = total;
        		
        System.out.println("La cantidad de matrículas son");

        for (i=0;i<1;i=i+1) {
            System.out.println("1. "+ carrera[0] + ":" + estudiantes[0]);
            System.out.println("2. "+ carrera[1] + ":" + estudiantes[1]);
            System.out.println("3. "+ carrera[2] + ":" + estudiantes[2]);
            System.out.println("4. "+ carrera[3] + ":" + estudiantes[3]);
            System.out.println("5. "+ carrera[4] + ":" + estudiantes[4]);
        }
}
  
  public void ConsultaMatriculas() {
	     Scanner sc = new Scanner (System.in);

	        int num;
	        
	        System.out.println("Ingrese la posición de la carrera para consultar la cantidad de estudiantes (0-4): ");
			num = sc.nextInt();
			
	        System.out.println(carrera[num] + " tiene un total de estudiantes matriculados de: " + estudiantes[num]);
			
			System.out.println("\n");			   
	        
	}
	
	public int EstudiantesMatriculados() {
		int promedio = 0;
		
		promedio = aux[0] / 5;
		
		System.out.printf("El promedio de estudiantes matriculados es: %d", promedio);	
		System.out.println("\n");
		
		return promedio;
	
	}
	
	public void PromedioBajoMatriculados() {
		int i, prom = 0;
		
		prom = EstudiantesMatriculados();
		
		for(i=0;i<5;i=i+1) 
		{
			if(estudiantes[i] < prom)
			{
				System.out.println(carrera[i] + " es una carrera por debajo del promedio de estudiantes matriculados.\n");
			}		
		}	
				
	}
	
	public void MayorMatriculados() {
		int i, mayor = 0;
		
		for(i=0;i<5;i=i+1) 
		{
			if(estudiantes[i] > mayor)
			{
				mayor = estudiantes[i];				
			}		
		}
		
		if(mayor == estudiantes[0])
		{
			System.out.println(carrera[0]);
			System.out.printf("es la carrera con mayor cantidad de estudiantes matriculados con una cifra de %d matrículas", mayor);
				
		}
		
		else if(mayor == estudiantes[1])
		{
			System.out.println(carrera[1]);
			System.out.printf(" es la carrera con mayor cantidad de estudiantes matriculados con una cifra de %d matrículas", mayor);
			
		}
		
		else if(mayor == estudiantes[2])
		{
			System.out.println(carrera[2]);
			System.out.printf(" es la carrera con mayor cantidad de estudiantes matriculados con una cifra de %d matrículas", mayor);
			
		}
		
		else if(mayor == estudiantes[3])
		{
			System.out.println(carrera[3]);
			System.out.printf(" es la carrera con mayor cantidad de estudiantes matriculados con una cifra de %d matrículas", mayor);
			
		}
		
		else if(mayor == estudiantes[4])
		{
			System.out.println(carrera[4]);
			System.out.printf(" es la carrera con mayor cantidad de estudiantes matriculados con una cifra de %d matrículas", mayor);
			
		}	
		
	}
	
	public int OpcionesMenu()
	{
		int opcion;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("\t\t\n             UNIVERSIDAD TECNOLOGICA DE PANAMA");
		System.out.println("\t \t FACULTAD DE SISTEMAS");
		System.out.println("\t \tPROGRAMACION DE SOFTWARE I\n\n");
		System.out.println("1. Crear carreras.");
		System.out.println("2. Registro de cantidad de matriculados por carrera.");
		System.out.println("3. Total de estudiantes matriculados en una carrera.");
		System.out.println("4. Promedio de estudiantes matriculados.");
		System.out.println("5. Carreras por debajo del promedio de estudiantes matriculados.");
		System.out.println("6. Carrera con mayor cantidad de estudiantes matriculados.");
		System.out.println("7. Salir.");
		System.out.println("\n \nSeleccione una opción: ");
		opcion = sc.nextInt();
		
		return opcion;
	}
	
	public int Menu()
	{
		int menu, fin;
		fin=0;
	
		menu = this.OpcionesMenu();
		
		Matricula mat = new Matricula();

		if(menu == 1) {
			System.out.println("\n''Escogió la opción 1''\n");
			mat.IngresarDatosCarreras();
		}
		
		else if(menu == 2) {
			
			if(carrera[0] == null)
			{
				System.out.println("Primero debe ingresar una carrera. \n");
			}
			
			else {
			System.out.println("\n''Escogió la opción 2''\n");
			mat.IngresarDatosMatriculas();
			}
		}
		
		else if(menu == 3) {
			
			if(aux[0] == 0)
			{
				System.out.println("Primero debe ingresar una carrera. \n");
			}
			
			else { 
			System.out.println("\n''Escogió la opción 3''\n");
			mat.ConsultaMatriculas();
			}
		}
		
		else if(menu == 4) {
			
			if(aux[0] == 0)
			{
				System.out.println("Primero debe ingresar una carrera. \n");
			}
			
			else {
			System.out.println("\n''Escogió la opción 4''\n");
			mat.EstudiantesMatriculados();
			}
		}
		
		else if(menu == 5) {
			
			if(aux[0] == 0)
			{
				System.out.println("Primero debe ingresar una carrera. \n");
			}
			
			else {
			System.out.println("\n''Escogió la opción 5''\n");
			mat.PromedioBajoMatriculados();
			}
		}
		
		else if(menu == 6) {
			
			if(aux[0] == 0)
			{
				System.out.println("Primero debe ingresar una carrera. \n");
			}
			
			else {
			System.out.println("\\n''Escogió la opción 6''\n");
			mat.MayorMatriculados();
			}
		}
		
		else if(menu == 7) {
			System.out.println("\nA continuación saldrá del programa...\n");
			fin = 1;
		}
		
		else {
			System.out.println("\nHa ingresado un número inválido, inténtelo de nuevo");
		}
		
		return fin;
	}

}