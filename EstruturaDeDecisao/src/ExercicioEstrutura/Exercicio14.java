package ExercicioEstrutura;

import javax.swing.JOptionPane;

/*A nota final de um estudante é calculada a partir de três notas atribuidas
 entre o intervalo de 0 até 10, respectivamente, a um trabalho de laboratório,
 a uma avaliação semestral e au exame final. A média das três notas mencionadas
 anteriormente obedece aos  pesos: Trabalho de laboratório: 2; Avaliação Semestral: 3;
 Exame Final: 5. De acordo com o resultado, mostre na tela se o aluno está 
 reprovado(média entre 0 e 2,9), de recuperação (média entre 3 e 4,9) ou se foi aprovado.
 Faça todas as verificações necessárias.*/
public class Exercicio14 {

	public static void main(String[] args) {

		String nome;
		double notaLab = 2.0;
		double avaSemestral = 3.0;
		double exameFinal = 5.0;
		double media;

		nome = JOptionPane.showInputDialog(null, "Digite o nome do Aluno:");
		JOptionPane.showMessageDialog(null, nome);
		media = (notaLab + avaSemestral + exameFinal) / 3;
		JOptionPane.showMessageDialog(null, "A média do Aluno " + nome + " é: " + media);

		if (media > 0 & media == 2.9) {
			JOptionPane.showMessageDialog(null, "Aluno de Recupareção!");
		} else if (media == 3 & media > 4.9) {

			JOptionPane.showMessageDialog(null, "Aluno está de Aprovado!");
		} else {
			JOptionPane.showMessageDialog(null, "Aluno Reprovado!");
		}

	}

}
