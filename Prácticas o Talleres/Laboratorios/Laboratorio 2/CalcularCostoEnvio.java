package trabajos;
import java.util.Scanner;
public class CalcularCostoEnvio {

	public static void main(String[] args) 
	{
		double vpeso,vcosto,precio;
		char vdestino;
		
		//Creamos una instancia del objeto
		Scanner sc= new Scanner(System.in);
		Paquete Objeto1 = new Paquete();
		
		//Solicitamos los valores de entrada
		System.out.println("Ingrese el peso, en libras, del paquete a enviar");
		vpeso = sc.nextDouble();
		System.out.println("Ingrese la letra, de la siguiente tabla, correspondiente al destino del paquete");
		System.out.println("(a) América del Norte");
		System.out.println("(b) América Central");
		System.out.println("(c) América del Sur");
		System.out.println("(d) Europa");
		System.out.println("(e) Asia");
		vdestino = sc.next().charAt(0);
		
		//Calculamos elcosto del envio del paquete
		Objeto1.Paquete(vpeso, vdestino);
		precio = Objeto1.CalcularCostoEnvio();
		
		//Imprimimos los resultados
		System.out.printf("El costo del envió del paquete es: %.2f", precio);

	}

}
