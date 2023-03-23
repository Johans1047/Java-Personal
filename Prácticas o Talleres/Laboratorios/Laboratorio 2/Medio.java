package trabajos;

public class Medio {
	private double num1, num2, num3;
	
	public void Medio(double vnum1, double vnum2, double vnum3)
	{
		num1 = vnum1;
		num2 = vnum2;
		num3 = vnum3;
	}
	
	public double CalcularNumeroEnMedio() 
	{
		double numMedio;
		if ((num1 > num2) && (num1 < num3) || (num1 > num3) && (num1 < num2))
		{
			numMedio = num1;
		}
		else if ((num2 > num1) && (num2 < num3) || (num2 > num3) && (num2 < num1))
		{
			numMedio = num2;
		}
		else
		{
			numMedio = num3;
		}
		return numMedio;
		
	}

}
