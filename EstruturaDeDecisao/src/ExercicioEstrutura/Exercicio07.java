package ExercicioEstrutura;

import javax.swing.JOptionPane;

/*Faça um programa quec receba dois números e mostre o maior.
 * Se por acaso, os  dois números forem iguais, imprima NÚMEROS IGUAIS.*/
public class Exercicio07 {

	public static void main(String[] args) {
		
		int num1, num2;
		
		num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número:"));
		JOptionPane.showMessageDialog(null, "O número digitado foi: " + num1);
		
		num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite outro número:"));
		JOptionPane.showMessageDialog(null, "O número ditado foi: " + num2);
		
		if(num1 > num2){
			JOptionPane.showMessageDialog(null, "O Primeiro número é maíor que o segundo.");
		}else if(num1 < num2){
				JOptionPane.showMessageDialog(null, "O Segundo número é maíor que o primeiro.");		
		}else {
			JOptionPane.showMessageDialog(null, "Os números são iguais.");
		}

	}

}
