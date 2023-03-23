package trabajos;
import java.util.Scanner;
public class CalcularNumMedio {

	public static void main(String[] args)
	{
		
		double vnum1,vnum2,vnum3,valorM;
		Scanner sc= new Scanner(System.in);
		Medio NumMedio1 = new Medio();
		
		//Solicitamos los valores de entrada
		
		System.out.println("Este programa calcula el numero de valor medio de tres numeros\n");
		System.out.println("Ingrese el valor del primer numero");
		vnum1 = sc.nextDouble();
		System.out.println("Ingrese el valor del segundo numero");
		vnum2 = sc.nextDouble();
	    System.out.println("Ingrese el valor del tercer numero");
	    vnum3 = sc.nextDouble();
	    
	    //Calculamos el numero con el valor medio
	    NumMedio1.Medio(vnum1, vnum2, vnum3);
	    valorM = NumMedio1.CalcularNumeroEnMedio();
	    
	    //Imprimimos los resultados
	    System.out.printf("El numero con el valor medio es: %.2f",valorM);
	}

}
