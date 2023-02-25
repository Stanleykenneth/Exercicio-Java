package ExercicioEstrutura;

import javax.swing.JOptionPane;

/*Determine se um determinado ano lido é bissexto. Sendo que um 
  ano bissexto é divisível por 400 ou ser for divisível por 4 e
  e não for divisível por 100. Exemplo: 1988, 1992, 1996.*/


public class Exercicio23 {

	public static void main(String[] args) {
		int ano;
		
		ano = Integer.parseInt(JOptionPane.showInputDialog(null, "Didigite um Ano:"));
		JOptionPane.showMessageDialog(null, ano);
		
		if(ano % 4 != 0 & ano % 400 != 0 ) {
			JOptionPane.showMessageDialog(null, "Ano não é Bissexto!");
		} else {
			JOptionPane.showMessageDialog(null, "Ano é Bissexto!");
		}
	}

}
