package trabajos;

public class Tarifa 
{
	private int cantPersonas;
	
	public void Tarifa(int vcantPersonas)
	{
		cantPersonas = vcantPersonas; 
	}
	
	public double CalcularCosto()
	{
		double costo;
		if((cantPersonas>200) && (cantPersonas<300))
		{
			costo = 85.00;
		}
		else if (cantPersonas > 300)
		{
			costo = 75.00;
		}
		else
		{
			costo = 95.00;
		}
		return costo;
	}
}
