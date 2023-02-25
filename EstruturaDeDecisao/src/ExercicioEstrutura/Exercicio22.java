package ExercicioEstrutura;

import javax.swing.JOptionPane;

/*Leia a idade e o tempo de serviço de um trabalhador e escreva se ele pode ou não 
  se aposentar. As condições de aposentadoria são:
  . Ter pelo menos 65 anos.
  . Ou ter trabalhado mais de 30 anos.
  . Ou ter pelo menos 60 anos e trabalhado pelo menos 25 anos. */

public class Exercicio22 {

	public static void main(String[] args) {

		/* String nome; */
		int Ano = 2023;
		int nasc;
		int idade;
		int tempoDeServico;

		/*
		 * nome = JOptionPane.showInputDialog(null, "Digite o seu nome: ");
		 * JOptionPane.showMessageDialog(null, nome);
		 */
		nasc = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ano de nascimento"));
		JOptionPane.showMessageDialog(null, nasc);

		JOptionPane.showMessageDialog(null, /* nome + */ " Você possui " + (idade = (Ano - nasc)) + " anos de idade.");

		if (idade >= 65) {
			JOptionPane.showMessageDialog(null, "Parabéns, pela sua idade você já pode se aposentar");
		} else {
			JOptionPane.showMessageDialog(null,
					"Infelizmente você não possui idade suficiente para se aposentar. \nMas veja pelo tempo de contribuição!");
		}

		tempoDeServico = Integer
				.parseInt(JOptionPane.showInputDialog(null, "Digite o ano de seu primeiro registro em carteira : "));
		JOptionPane.showMessageDialog(null, tempoDeServico);

		tempoDeServico = Ano - tempoDeServico;

		if (tempoDeServico > 30) {
			JOptionPane.showMessageDialog(null,
					"Parabéns,  você já possui tempo suficiente de serviço para se aposentar");
		} else if (tempoDeServico >= 30 || idade <= 60) {
			JOptionPane.showMessageDialog(null,
					"Parabéns,  você já possui tempo de serviço e idade suficiente suficiente para se aposentar");
		} else {
			JOptionPane.showMessageDialog(null,
					"Infelizmente você não possui idade e nem tempo de serviço suficientes para se aposentar.");
		}

	}

}
