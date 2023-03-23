package PracticaNo4;

public class Calificacion {

	private int cal1, cal2, cal3;


	public void Calificacion(int vcal1, int vcal2, int vcal3) {
		cal1 = vcal1;
		cal2 = vcal2;
		cal3 = vcal3;
	}

	public int  CalcularCalificacion() {
		
		int aux=0;
		
		if ((cal1 > cal2) && (cal1 < cal3) || (cal1 > cal3) && (cal1 < cal2))
		{
			if (cal2 > cal3)
			{
		    System.out.println("La calificación más alta es: "+cal2);
		    System.out.println("La calificación más baja es: "+cal3);
		    return aux;
		    }
			
			else
			{
		    System.out.println("La calificación más alta es: "+cal3);
		    System.out.println("La calificación más baja es: "+cal2);
		    return aux;
		    }
			
		}
		
		else if ((cal2 > cal1) && (cal2 < cal3) || (cal2 > cal3) && (cal2 < cal1))
		{
			if (cal1 > cal3)
			{
		    System.out.println("La calificación más alta es: "+cal1);
		    System.out.println("La calificación más baja es: "+cal3);
		    return aux;
		    }
			
			else
			{
		    System.out.println("La calificación más alta es: "+cal3);
		    System.out.println("La calificación más baja es: "+cal1);
		    return aux;
		    }
			
		}
		
		else 
		{
			if (cal1 > cal2)
			{
		    System.out.println("La calificación más alta es: "+cal1);
		    System.out.println("La calificación más baja es: "+cal2);	
		    return aux;
		    }
			
			else
			{
		    System.out.println("La calificación más alta es: "+cal2);
		    System.out.println("La calificación más baja es: "+cal1);
		    return aux;
		    }
			
		}
		
	}
	
}
