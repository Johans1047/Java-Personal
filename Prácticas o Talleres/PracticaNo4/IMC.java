package PracticaNo4;

public class IMC {

	private double peso, talla;


	public void IMC(double vpeso, double vtalla) {
		peso = vpeso;
		talla = vtalla;
	}

	public double CalcularIMC() {
		
		double imc;
		imc = 0;
		
		imc = peso / (talla*talla);
		
		if (imc < 18.5)
		{	
			System.out.println("\nDesnutrido");
			return imc;
		}

		else if (imc >= 18.5 && imc <= 25.5)
		{	
			System.out.println("\nPeso Normal");	
			return imc;
		}
		
		else 
		{	
			System.out.println("\nSobrepeso");
			return imc;
		}
		
	}

}