package ExercicioEstrutura;

import javax.swing.JOptionPane;

/* Faça programa que leia um número e,
 * caso ele seja positivo, calcule e mostre:
 * . O número digitado ao quadrado
 * . A raiz quadrada do número digitado. */

public class Exercicio04 {

	public static void main(String[] args) {

		int numero;

		numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número:"));

		if (numero > 0) {

			JOptionPane.showMessageDialog(null, " O valor do número digitado ao quadrado é: " + (numero * numero)
                                			  + "\nE a sua raiz é: " + Math.sqrt(numero));
		}
		else {
			JOptionPane.showMessageDialog(null, " O número é negativo!");
		}
	}

}
