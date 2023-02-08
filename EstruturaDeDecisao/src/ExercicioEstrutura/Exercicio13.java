package ExercicioEstrutura;

import javax.swing.JOptionPane;

/*Faça um algoritmo que calcule á média ponderada das notas das 3 provas.
  A primeira e a segunda têm peso 1 e a terceira tem peso 2. Ao final,
  mostrar a média do aluno e indicar se o aluno foi aprovado ou reprovado. 
  A nota de aprovação deve ser igual ou  superior a 60 pontos.*/

public class Exercicio13 {
	
	public static void main(String[] args) {
		
		double nota1;
		double nota2;
		double nota3;
		double media;
		
		nota1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a nota da Primeira avaliação:"));
		JOptionPane.showMessageDialog(null, "A nota é: " + nota1);
		
		nota2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a nota da Segunda avaliação:"));
		JOptionPane.showMessageDialog(null, "A nota é: " + nota2);
		
		nota3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a nota da Terceira avaliação:"));
		JOptionPane.showMessageDialog(null, "A nota é: " + nota3);
		
		media = (nota1 * 1) + (nota2 * 1) + (nota3 *2) / 3;
		JOptionPane.showMessageDialog(null, "A média ponderada é: " + Math.round(media));
		
		if(media >= 60) {
			JOptionPane.showMessageDialog(null, "Aluno aprovado!");
		}else {
			JOptionPane.showMessageDialog(null, "Aluno reprovado!");
		}
	}
}
