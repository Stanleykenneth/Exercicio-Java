package ExercicioEstrutura;

import javax.swing.JOptionPane;
import java.text.NumberFormat;

/*Leia um salário de um trabalhador e o valor da pretação de um empréstimo.
  Se prestação for maior que 20% do salário: Empréstiomo não concedido concedido.
  Caso contrário imprima: Empréstimo concedido. */

public class Exercicio09 {

	public static void main(String[] args) {

		double salario;
		double emprestimo;
		int parcelas;
		double valorParcela;

		salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do seu salário:"));
		JOptionPane.showMessageDialog(null, "Seu salário é: " +  NumberFormat.getCurrencyInstance().format(salario));
		
		emprestimo = Double.parseDouble(JOptionPane.showInputDialog(null, "Didige o valor que deseja solicitar:"));
		JOptionPane.showMessageDialog(null, "Valor solicitado de emprestimo foi: " +  NumberFormat.getCurrencyInstance().format(emprestimo));
		
		parcelas = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o número de parcelas que deseja pagar:"));
		JOptionPane.showInternalMessageDialog(null, "A quantidade de parcelas de deseja em que deseja pagar são:" + parcelas + " vezes." );
		
		valorParcela = emprestimo / parcelas;
		JOptionPane.showInternalMessageDialog(null, "O valor da parcela será " + NumberFormat.getCurrencyInstance().format(valorParcela));
		
		if(valorParcela <= (salario * 0.2)) {
			
			JOptionPane.showInternalMessageDialog(null, "Emprestimo concedido!");
		}else {
			JOptionPane.showInternalMessageDialog(null, "Emprestimo não concedido!");
		}
		
		
	}

}
