package codigos;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		int a, b;
		String aA, bB, cC;
		double c;

		aA = JOptionPane.showInputDialog("Valor da Hora: ");
		a = Integer.parseInt(aA);

		bB = JOptionPane.showInputDialog("horas trabalhadas: ");
		b = Integer.parseInt(bB);

		cC = JOptionPane.showInputDialog("Quantidades de funcionario: ");

		Calculos calc = new Calculos();

		JOptionPane.showMessageDialog(null, "Qtd Funcionario: " + cC);
		JOptionPane.showMessageDialog(null, "Salário cada Funcionario = " + calc.valor(a, b));
		JOptionPane.showMessageDialog(null, "vale: " + calc.vale().to);
	}

}
