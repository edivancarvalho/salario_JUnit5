package codigos;

public class Calculos {
	
	
		
	private double salario = 0;
	private double vale = 15;
	
	public double valor(int a, int b) {
		salario = (a * b);
		return salario;
	}
	
	public double vale() {
		salario = salario + vale;
		return salario;
	}
	

}
