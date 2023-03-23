package trabajos;
import java.util.Scanner;
public class CalcularTarifa {

	public static void main(String[] args)
	{
		int vcantPersonas;
		double costo,costoT;
		
		//Creamos una instancia del objeto
		Tarifa Evento1 = new Tarifa();
		Scanner sc= new Scanner(System.in);
		
		//Solicitamos los valores de entrada
		System.out.println("Ingrese la cantidad de personas para el banquete");
		vcantPersonas = sc.nextInt();
		
		//Calculamos el costo por pesonas del banquete
		Evento1.Tarifa(vcantPersonas);
		costo = Evento1.CalcularCosto();
		costoT = costo * vcantPersonas;
		
		//Imprimimos los resultados
		System.out.printf("El costo por platillo por persona es: %.2f \n",costo);
		System.out.printf("El costo total del banquete es: %.2f",costoT);
		
		

	}

}
