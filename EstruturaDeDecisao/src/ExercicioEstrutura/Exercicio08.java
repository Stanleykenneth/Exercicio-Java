package ExercicioEstrutura;

import javax.swing.JOptionPane;

/*Faça um programa que leia 2 notas de um aluno,
  verifique se as notas são validas e exiba na tela a
  média destas notas. Uma nota válida deve ser, obrigatoriamente,
  um valor entre 0.0 e 10.0, onde caso a nota não possua um valor válido,
  este fato deve ser informado ao usuário e o programa termina.*/
public class Exercicio08 {

	public static void main(String[] args) {
		
		double nota1;
		double nota2;
		double media;
		
		nota1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite valor da Primeira nota:"));
		JOptionPane.showMessageDialog(null, "O valor da primeira nota é :" + nota1);
		
		nota2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite valor da Segunda nota:"));
		JOptionPane.showMessageDialog(null, "O valor da Segunda nota é :" + nota2);
		
		media = (nota1 + nota2) / 2;
		
		if(media >= 6.0) {
			JOptionPane.showMessageDialog(null, "Aluno Aprovado!");
		} else if (media >= 5.0 & media <= 5.9) {
			
			JOptionPane.showMessageDialog(null, "Aluno de exame!");
		} else {
			
			JOptionPane.showMessageDialog(null, "Aluno reprado!");
		}
		
	}
}
