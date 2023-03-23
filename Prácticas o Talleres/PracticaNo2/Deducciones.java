package PracticaNo2;

import java.util.Scanner;

public class Deducciones {

	private String Nombre;  
	private double SBruto;

	public void FijarValor(String vNombre, double vSBruto) {
		Nombre = vNombre;
		SBruto = vSBruto;
	}

	public double CalcularSeguroSocial() {
		double SSocial;
		SSocial = 0.0;

		SSocial = SBruto * 0.09;
		return SSocial;
	}
	
	public double CalcularSeguroEducativo() {
		double SEducativo;
		SEducativo = 0.0;

		SEducativo = SBruto * 0.0175;
		return SEducativo;
	}
	
	public double CalcularSalarioNeto(double SSocial, double SEducativo) {
		double SNeto;
		SNeto = 0.0;

		SNeto = SBruto - (SSocial + SEducativo);
		return SNeto;
	}

	public static void main(String[] args) {
		String vNombre;
		double vSBruto, SSocial, SEducativo, SNeto;
		vSBruto = 0.0;
		SSocial = 0.0;
		SEducativo = 0.0;
		SNeto = 0.0;

		Scanner sc = new Scanner(System.in);
	    Deducciones emp = new Deducciones();

		// Solicitar los valores

		System.out.println("Ingrese el nombre del empleado:");
		vNombre = sc.nextLine();
		System.out.println("Ingrese el salario bruto del empleado:");
		vSBruto = sc.nextDouble();

		emp.FijarValor(vNombre, vSBruto);
		SSocial = emp.CalcularSeguroSocial();
		SEducativo = emp.CalcularSeguroEducativo();
		SNeto = emp.CalcularSalarioNeto(SSocial, SEducativo);

		System.out.printf("El nombre del empleado es: %S\n", vNombre);
		System.out.printf("El salario bruto del empleado es: %.2f\n", vSBruto);
		System.out.printf("La deducción del seguro social del empleado es: %.2f\n", SSocial); 
		System.out.printf("La deducción del seguro educativo del empleado es: %.2f\n", SEducativo);
		System.out.printf("El salario neto del empleado es: %.2f", SNeto);
	}

}