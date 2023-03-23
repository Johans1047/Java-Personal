package PracticaNo11;

import java.util.Scanner;

public class RetroEx {

    private static String [] maquinas = new String [5];
    private static String [] dias = new String[6];
    private static double [][] numeros = new double[5][6];
    private static double numero;
    private static String nombre; 

   public void RetroEx(String vnombre, double vnumero){
	   nombre = vnombre;
	   numero = vnumero;
   }
   
   public static double getNumero() {
	return numero;
   }

   public static void setNumero(double numero) {
	RetroEx.numero = numero;
   }

   public static String getNombre() {
	return nombre;
   }

   public static void setNombre(String nombre) {
	RetroEx.nombre = nombre;
   }

public void RegistrarMaquinas() {
	   
	   Scanner sc = new Scanner (System.in);
	   
        int i;
        String vnombre;
        
        for(i=0;i<5;i=i+1)
        {
            System.out.printf("Registra la máquina #%d: ", i+1);
            vnombre = sc.nextLine();
            maquinas[i] = vnombre;
        }
        
        System.out.println("\nHa registrado las máquinas: ");

        for (i=0;i<5;i=i+1) {
            System.out.println(maquinas[i]);
        }
}
   
   public void RegistrarDias() {
	   
	   Scanner sc = new Scanner (System.in);
	   
        int i;
        String vnombre;
        
        for(i=0;i<=5;i=i+1)
        {
            System.out.printf("Registra el día #%d: ", i+1);
            vnombre = sc.nextLine();
            dias[i] = vnombre;
        }
        
        System.out.println("\nHa registrado los días: ");

        for (i=0;i<=5;i=i+1) {
            System.out.println(dias[i]);
        }
}
   
public void RegistrarHoras() {
	   
	   Scanner sc = new Scanner (System.in);
	   
        int x, y;
        double vnumero;
        
        for(x=0;x<5;x=x+1)
        {
        	
        	for(y=0;y<6;y=y+1) {
        		
            System.out.println("Registre las horas: ");
            vnumero = sc.nextDouble();
            numeros[x][y] = vnumero;
        	 
        	}
        	
        }
        
        System.out.println("\nHa registrado las horas: \n");

        for(x=0;x<5;x=x+1)
		{	

		    for(y=0;y<6;y=y+1) {
		    	
			System.out.printf("\t%.0f", numeros[x][y]); 
			
		    }
		
		System.out.println("\n");
		
		}
}

public void ConsultarDia() {
	   
	   Scanner sc = new Scanner (System.in);
	   
     int x; 
     double mayor = 0.0;
     double num = 0.0, num2 = 0.0, num3 = 0.0, num4 = 0.0, num5 = 0.0, num6 = 0.0;
     
     for(x=0;x<5;x=x+1)
     {
     	
      num = num + numeros[x][0];
      num2 = num2 + numeros[x][1];
      num3 = num3 + numeros[x][2];
      num4 = num4 + numeros[x][3];
      num5 = num5 + numeros[x][4];
      num6 = num6 + numeros[x][5]; 	 
     	
     }
     
     if (num > mayor) {
    	 mayor = num;
     }
     
     if (num2 > mayor) {
    	 mayor = num2;
     }
     
     if (num3 > mayor) {
    	 mayor = num3;
     }
     
     if (num4 > mayor) {
    	 mayor = num4;
     }
     
     if (num5 > mayor) {
    	 mayor = num5;
     }
     
     if (num6 > mayor) {
    	 mayor = num6;
     }
     
     if(mayor == num) {
     System.out.printf("\nEl día en el que se trabajaron más horas fue el %s con un total de %.0f horas \n", dias[0], num);
     } 
     
     else if(mayor == num2) {
         System.out.printf("\nEl día en el que se trabajaron más horas fue el %s con un total de %.0f horas \n", dias[1], num2);
         }
     
     else if(mayor == num3) {
         System.out.printf("\nEl día en el que se trabajaron más horas fue el %s con un total de %.0f horas \n", dias[2], num3);
         }
     
     else if(mayor == num4) {
         System.out.printf("\nEl día en el que se trabajaron más horas fue el %s con un total de %.0f horas \n", dias[3], num4);
         }
     
     else if(mayor == num5) {
         System.out.printf("\nEl día en el que se trabajaron más horas fue el %s con un total de %.0f horas \n", dias[4], num5);
         }
     
     else if(mayor == num6) {
         System.out.printf("\nEl día en el que se trabajaron más horas fue el %s con un total de %.0f horas \n", dias[5], num6);
         }
 
} 

public void ConsultarPorcentajesHora() {
	   
	   Scanner sc = new Scanner (System.in);
	   
  int x;
  double total = 0.0;
  double num = 0.0, num2 = 0.0, num3 = 0.0, num4 = 0.0, num5 = 0.0, num6 = 0.0;
  double p1 = 0.0, p2 = 0.0, p3 = 0.0, p4 = 0.0, p5 = 0.0, p6 = 0.0;
  
  for(x=0;x<5;x=x+1)
  {
  	
   num = num + numeros[x][0];
   num2 = num2 + numeros[x][1];
   num3 = num3 + numeros[x][2];
   num4 = num4 + numeros[x][3];
   num5 = num5 + numeros[x][4];
   num6 = num6 + numeros[x][5]; 	 
  	
  }
  
  total = num + num2 + num3 + num4 + num5 + num6;
  
  p1 = (num / total) * (100);
  p2 = (num2 / total) * (100);
  p3 = (num3 / total) * (100);
  p4 = (num4 / total) * (100);
  p5 = (num5 / total) * (100);
  p6 = (num6 / total) * (100);
  
  System.out.printf("El porcentaje para el día %s es de un %.2f por ciento\n", dias[0], p1);
  System.out.printf("El porcentaje para el día %s es de un %.2f por ciento\n", dias[1], p2);
  System.out.printf("El porcentaje para el día %s es de un %.2f por ciento\n", dias[2], p3);
  System.out.printf("El porcentaje para el día %s es de un %.2f por ciento\n", dias[3], p4);
  System.out.printf("El porcentaje para el día %s es de un %.2f por ciento\n", dias[4], p5);
  System.out.printf("El porcentaje para el día %s es de un %.2f por ciento\n", dias[5], p6);

}

public void ConsultarPromediosHora() {
	   
	   Scanner sc = new Scanner (System.in);
	   
int y;
double p1 = 0.0, p2 = 0.0, p3 = 0.0, p4 = 0.0, p5 = 0.0;
double num = 0.0, num2 = 0.0, num3 = 0.0, num4 = 0.0, num5 = 0.0;


for(y=0;y<6;y=y+1)
{
	
num = num + numeros[0][y];
num2 = num2 + numeros[1][y];
num3 = num3 + numeros[2][y];
num4 = num4 + numeros[3][y];
num5 = num5 + numeros[4][y]; 	 
	
}

p1 = num / 6;
p2 = num2 / 6;
p3 = num3 / 6;
p4 = num4 / 6;
p5 = num5 / 6;

System.out.printf("El promedio de la máquina %s en la semana es igual a %.2f \n", maquinas[0], p1);
System.out.printf("El promedio de la máquina %s en la semana es igual a %.2f \n", maquinas[1], p2);
System.out.printf("El promedio de la máquina %s en la semana es igual a %.2f \n", maquinas[2], p3);
System.out.printf("El promedio de la máquina %s en la semana es igual a %.2f \n", maquinas[3], p4);
System.out.printf("El promedio de la máquina %s en la semana es igual a %.2f \n", maquinas[4], p5);


}

public void ConsultarMayoryMenor() {
	   
	   Scanner sc = new Scanner (System.in);
	   
int y;
double num = 0.0, num2 = 0.0, num3 = 0.0, num4 = 0.0, num5 = 0.0;
double mayor = 0.0, menor = 999999.99;


for(y=0;y<6;y=y+1)
{
	
num = num + numeros[0][y];
num2 = num2 + numeros[1][y];
num3 = num3 + numeros[2][y];
num4 = num4 + numeros[3][y];
num5 = num5 + numeros[4][y]; 	 
	
}

if (num > mayor) {
	 mayor = num;
}

if (num2 > mayor) {
	 mayor = num2;
}

if (num3 > mayor) {
	 mayor = num3;
}

if (num4 > mayor) {
	 mayor = num4;
}

if (num5 > mayor) {
	 mayor = num5;
}



if (num < menor) {
	 menor = num;
}

if (num2 < menor) {
	 menor = num2;
}

if (num3 < menor) {
	 menor = num3;
}

if (num4 < menor) {
	 menor = num4;
}

if (num5 < menor) {
	 menor = num5;
}



if(menor == num) {
	System.out.printf("La máquina %s fue la que trabajó menos horas en la semana con un total de %.0f horas \n", maquinas[0], num);
}

else if(menor == num2) {
	System.out.printf("La máquina %s fue la que trabajó menos horas en la semana con un total de %.0f horas \n", maquinas[1], num2);
}

else if(menor == num3) {
	System.out.printf("La máquina %s fue la que trabajó menos horas en la semana con un total de %.0f horas \n", maquinas[2], num3);
}

else if(menor == num4) {
	System.out.printf("La máquina %s fue la que trabajó menos horas en la semana con un total de %.0f horas \n", maquinas[3], num4);
}

else if(menor == num5) {
	System.out.printf("La máquina %s fue la que trabajó menos horas en la semana con un total de %.0f horas \n", maquinas[4], num5);
}



if(mayor == num) {
	System.out.printf("La máquina %s fue la que trabajó más horas en la semana con un total de %.0f horas \n", maquinas[0], num);
}

else if(mayor == num2) {
	System.out.printf("La máquina %s fue la que trabajó más horas en la semana con un total de %.0f horas \n", maquinas[1], num2);
}

else if(mayor == num3) {
	System.out.printf("La máquina %s fue la que trabajó más horas en la semana con un total de %.0f horas \n", maquinas[2], num3);
}

else if(mayor == num4) {
	System.out.printf("La máquina %s fue la que trabajó más horas en la semana con un total de %.0f horas \n", maquinas[3], num4);
}

else if(mayor == num5) {
	System.out.printf("La máquina %s fue la que trabajó más horas en la semana con un total de %.0f horas \n", maquinas[4], num5);
}

   ImprimirResultado();

}

public void ImprimirResultado() {
	   
	   Scanner sc = new Scanner (System.in);
	   
     int x, h, y, z, f;
     
     System.out.println("\n");
     
     System.out.printf("\t%s %s %s %s %s %s", dias[0], dias[1], dias[2], dias[3], dias[4], dias[5]);
     
     System.out.println("\n");
     System.out.println(maquinas[0]);
     
     for(x=0;x<6;x=x+1)
     {
    	 System.out.printf("\t%.0f", numeros[0][x]);
     }
     
     System.out.println("\n");
     System.out.println(maquinas[1]);
     
     for(h=0;h<6;h=h+1)
     {
    	 System.out.printf("\t%.0f", numeros[1][h]);
     }
     
     System.out.println("\n");
     System.out.println(maquinas[2]);
     
     for(y=0;y<6;y=y+1)
     {
    	 System.out.printf("\t%.0f", numeros[2][y]);
     }
     
     System.out.println("\n");
     System.out.println(maquinas[3]);
     
     for(z=0;z<6;z=z+1)
     {
    	 System.out.printf("\t%.0f", numeros[3][z]);
     }
     
     System.out.println("\n");
     System.out.println(maquinas[4]);
     
     for(f=0;f<6;f=f+1)
     {
    	 System.out.printf("\t%.0f", numeros[4][f]);
     }
     
     System.out.println("\n");
    
}

	public int OpcionesMenu()
	{
		int opcion;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("\t\t\n             UNIVERSIDAD TECNOLOGICA DE PANAMA");
		System.out.println("\t \t FACULTAD DE SISTEMAS");
		System.out.println("\t \tPROGRAMACION DE SOFTWARE I\n\n");
		System.out.println("1. Registrar las máquinas.");
		System.out.println("2. Registrar los días.");
		System.out.println("3. Registrar las horas.");
		System.out.println("4. Consultar día en que se trabajaron mayor cantidad de horas.");
		System.out.println("5. Consultar porcentajes de cantida de horas trabajadas por día.");
		System.out.println("6. Consultar los promedios de horas trabajadas por una máquina X en la semana. ");
		System.out.println("7. Consultar cuáles fueron las 2 máquinas que trabajaron un mayor y un menor número de horas durante la semana.");
		System.out.println("8. Salir.");
		System.out.println("\n \nSeleccione una opción: ");
		opcion = sc.nextInt();
		
		return opcion;
	}
	
	public int Menu()
	{
		int menu, fin;
		fin=0;
	
		menu = this.OpcionesMenu();
		
		RetroEx ret = new RetroEx();

		if(menu == 1) {
			System.out.println("\n''Escogió la opción 1''\n");
			ret.RegistrarMaquinas();
		}
		
		else if(menu == 2) {
			System.out.println("\n''Escogió la opción 2''\n");
			ret.RegistrarDias();
		}
		
		else if(menu == 3) {
			System.out.println("\n''Escogió la opción 3''\n");
			ret.RegistrarHoras();
		}
		
        else if(menu == 4) {
			
			if(dias[0] == null)
			{
				System.out.println("Primero debe ingresar días para registrar horas. \n");
			}
			
			else {
			System.out.println("\n''Escogió la opción 4''\n");
			ret.ConsultarDia();
			}
		}
		
         else if(menu == 5) {
			
			if(dias[0] == null)
			{
				System.out.println("Primero debe ingresar días y luego registrar horas. \n");
			}
			
			else {
			System.out.println("\n''Escogió la opción 5''\n");
			ret.ConsultarPorcentajesHora();
			}
		}
		
         else if(menu == 6) {
 			
 			if(dias[0] == null)
 			{
 				System.out.println("Primero debe ingresar días y luego registrar horas. \n");
 			}
 			
 			else {
 			System.out.println("\n''Escogió la opción 6''\n");
 			ret.ConsultarPromediosHora();
 			}
 		}
		
         else if(menu == 7) {
  			
  			if(dias[0] == null)
  			{
  				System.out.println("Primero debe ingresar días y luego registrar horas. \n");
  			}
  			
  			else {
  			System.out.println("\n''Escogió la opción 7''\n");
  			ret.ConsultarMayoryMenor();
  			}
  		}
		
         else if(menu == 8) {
 			System.out.println("\nA continuación saldrá del programa...\n");
 			fin = 1;
 		}
		
		else {
			System.out.println("\nHa ingresado un número inválido, inténtelo de nuevo");
		}
		
		return fin;
	}

}