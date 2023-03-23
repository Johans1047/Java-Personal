package trabajos;

public class Fecha 
{
	private int dia,mes,año;
	
	public void Fecha(int vdia, int vmes, int vaño)
	{
		dia = vdia;
		mes = vmes;
		año = vaño;
	}
	
	public int CalcularDiasRestantes()
	{
		int dRestantes,dMes = 0;
		
		switch(mes)
		{
			case 1:
			case 3:
			case 5:
			case 7: 
			case 8:
			case 10:
			case 12:
				dMes= 31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				dMes = 30;
				break;
			case 2:
				if(año%4 == 0)
				{
					if((año%100 == 0)&& (año%400 == 0))
					{
						dMes = 29;
					}
					else
					{
						dMes = 28;
					}
				}
				else
				{
					dMes = 28;
				}
				break;
			default:
				System.out.println("La fecha ingresada es invalida");
				return 0;
		}
		dRestantes = dMes - dia;
		return dRestantes;
	}
	
	

}
