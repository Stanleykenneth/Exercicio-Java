package ExercicioEstrutura;

import javax.swing.JOptionPane;

/* Leia um número fornecido pelo usuário.
 * Se o número for positivo, calcule a raiz quadrada do número.
 * Se o número for for negativo, mostre uma mensagem dizendo que o número é inválido.*/
public class Exercicio02 {

	public static void main(String[] args) {

		int numero;

		numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor"));

		if (numero > 0) {

			JOptionPane.showInternalMessageDialog(null, "A raiz quadrada do número digitado é: " + Math.sqrt( Math.round(numero)));
		} else if (numero < 0) {

			JOptionPane.showMessageDialog(null, "O número digitado foi um número negativo. Por favor digite um número positivo!");

		} else {

			JOptionPane.showMessageDialog(null, "Por favor refaça a operação com um número postivo!");
		}
	}

}
