package PracticaNo6;

import java.util.Scanner;

public class Cualidad {

	private int cantidad, sexo;
	private double estatura, peso;

	public void Cualidad(int vcantidad, int vsexo, double vestatura, double vpeso) {
		cantidad = vcantidad;
		sexo = vsexo;
		estatura = vestatura;
		peso = vpeso;
	}
	
	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getSexo() {
		return sexo;
	}

	public void setSexo(int sexo) {
		this.sexo = sexo;
	}

	public double getEstatura() {
		return estatura;
	}
	
	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public double DeterminarEstaturaM(double em, double m) {
		double prom;
		
		prom = em / m;
	
		return prom;
	}
	
	public double DeterminarEstaturaF(double ef, double f) {
		double prom;
		
		prom = ef / f;
	
		return prom;
	}
	
	public double DeterminarPesoM(double pm, double m) {
		double prom;
		
		prom = pm / m;
	
		return prom;
	}
	
	public double DeterminarPesoF(double pf, double f) {
		double prom;
		
		prom = pf / f;
	
		return prom;
	}

	public static void main(String[] args) {
		double vestatura, vpeso, resultado, resultado2, resultado3, resultado4, m, f, em, ef, pm, pf;
		int i, vcantidad, vsexo; 
		
		vsexo = 0;
		vcantidad = 0;
		em = 0;
		ef = 0;
		pm = 0;
		pf = 0;
        m = 0;
		f = 0;
		vestatura = 0.0;
		vpeso = 0.0;
		resultado = 0.0;
		
		Scanner sc = new Scanner(System.in);
	    Cualidad cl = new Cualidad();
		
		System.out.printf("Ingrese la cantidad de alumnos que hay en el salón:\n");
		vcantidad = sc.nextInt();
		
		// Solicitar los valores

		for(i=1;i<=vcantidad;i=i+1)
		{	
		System.out.printf("\nEstudiante #%d\n", i);
		System.out.println("¿Cuál es el sexo del estudiante? ingrese 1 para masculino o ingrese 2 para femenino");
		vsexo = sc.nextInt();
		System.out.println("¿Cuál es la estatura del estudianteen metros?");
		vestatura = sc.nextDouble();
		System.out.println("¿Cuál es el peso del estudiante en kg?");
		vpeso = sc.nextDouble();
		
		if (vsexo == 1){
			
			m = m + 1;
			
			if (vestatura != 0.0){	
				em = em + vestatura;
			}
			
			else {	
				em = 0;
			}
			
			if (vpeso != 0.0){	
				pm = pm + vpeso;
			}
			
			else {	
				pm = 0;
			}
			
		}
		
		else {	
			
			f = f + 1;
			
			if (vestatura != 0.0){	
				ef = ef + vestatura;
			}
			
			else {	
				ef = 0;
			}
			
			if (vpeso != 0.0){	
				pf = pf + vpeso;
			}
			
			else {	
				pf = 0;
			}
			
		}

		}
		
		cl.Cualidad(vcantidad, vsexo, vestatura, vpeso);
		resultado = cl.DeterminarEstaturaM(em, m);
		resultado2 = cl.DeterminarEstaturaF(ef, f);
		resultado3 = cl.DeterminarPesoM(pm, m);
		resultado4 = cl.DeterminarPesoF(pf, f);
		
		System.out.printf("\nLa cantidad de estudiantes en el salón es: %d\n", vcantidad);
		System.out.printf("La cantidad de estudiantes de sexo masculino es: %.0f\n", m);
		System.out.printf("La cantidad de estudiantes de sexo femenino es: %.0f\n", f);
		System.out.printf("El promedio de estatura masculina es: %.2f\n", resultado);
		System.out.printf("El promedio de estatura femenina es: %.2f\n", resultado2);
		System.out.printf("El promedio de peso masculino es: %.2f\n", resultado3);
		System.out.printf("El promedio de peso femenino es: %.2f\n", resultado4);
		
	}

}