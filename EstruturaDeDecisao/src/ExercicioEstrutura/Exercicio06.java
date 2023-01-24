package ExercicioEstrutura;

import javax.swing.JOptionPane;

/* Escreva um programa que,dado dois números inteiros,
 * mostre na tela o maior deles,assim como a diferença existente entre ambos. */

public class Exercicio06 {

	public static void main(String[] args) {

		int num1, num2;

		int diferenca;

		num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número: "));
		JOptionPane.showMessageDialog(null, "O número digitado foi: " + num1);

		num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite outro número: "));
		JOptionPane.showMessageDialog(null, "O número digitado foi: " + num2);

		diferenca = num1 - num2;

		if (num1 > num2) {
			JOptionPane.showMessageDialog(null, "O primeiro número digitado é maior que o segundo."
					+ "\nE a diferença entre eles é de: " + diferenca + " números.");
		} else if (num1 < num2) {
			if (num1 < num2) {
				diferenca = num2 - num1;
			}
			JOptionPane.showMessageDialog(null, "O segundo número digitado é maior que o primeiro."
					+ "\nE a diferença entre eles é de: " + diferenca + " números.");
		}else {
			JOptionPane.showMessageDialog(null, "Os números são iguais");
		}
		

	}

}
