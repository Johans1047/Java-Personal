package trabajos;

public class Paquete
{
		private double peso;
		private char destino;
		
	public void Paquete(double vpeso, char vdestino)
	{
		peso = vpeso;
		destino = vdestino;
	}
	
	public double CalcularCostoEnvio()
	{
		double costo;
		switch(destino)
		{	
			case 'a':
				costo = peso * 3.00;
				break;
			case 'b':
				costo = peso * 2.50;
				break;
			case 'c':
				costo = peso * 3.50;
				break;
				
			case 'd':
				costo = peso * 5.00;
				break;
			
			case 'e':
				costo = peso * 7.00;
				break;
			default:
				System.out.println("Destino ingresado invalido");
				return 0;
		}
		return costo;
	}
}
