package trabajos;
import java.util.Scanner;
public class CalcularDiasRestantes {

	public static void main(String[] args)
	{
		int vdia,vmes,vaño,dRestantes;
		
		//Creamos una instancia del objeto
		Scanner sc= new Scanner(System.in);
		Fecha Date1 = new Fecha();
		
		//Solicitamos los valores de entrada
		System.out.println("Este programa calcula los dias restantes del mes de la fecha introducida");
		System.out.println("Ingrese el dia de la fecha");
		vdia = sc.nextInt();
		System.out.println("Ingrese el mes, en numero, correspondiente a la fecha");
		vmes = sc.nextInt();
		System.out.println("Ingrese eñ año correspondiente a la fecha deseada");
		vaño = sc.nextInt();
		
		//Calculamos los días restantes del mes de la fecha ingresada
		Date1.Fecha(vdia, vmes, vaño);
		dRestantes = Date1.CalcularDiasRestantes();
		
		//Imprimimos los resultados
		System.out.printf("Los días restantes del mes de la fecha son: %d",dRestantes);
		
		

	}

}
