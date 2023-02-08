package ExercicioEstrutura;

import java.util.Scanner;

import javax.swing.JOptionPane;

/*Faça um programa que receba altura e o sexo de uma pessoa
  e calcule e mostre seu peso ideal, utilizando as seguintes formulas(onde h corresponde à altura):
  .HOMENS:(72.7 *h) - 58
  .MULHERES:(62.1 *h) - 44.7*/

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String sexo;
		double h, peso = 0;

		System.out.println("Digite o seu sexo:");
		sexo = ler.nextLine();

		System.out.println("Digite sua altura:");
		h = ler.nextDouble();

		switch (sexo) {

		case "masc":
			System.out.println("Masculino");
			break;

		case "Fem":
			System.out.println("Femino");
			break;

		default:
			System.out.println("O sexo é: " + sexo);
		}
		
		
		if (sexo == "masc" & (peso == (72.7 * h) - 58)) {
			System.out.println("Seu peso é: " + peso);
			System.out.println("Parabéns você está no peso ideal.");
		} else if (sexo == "masc" & (peso <= (72.7 * h) - 58)) {
			System.out.println("Cuidado vc pode estar muito abaixo do seu peso ideal");
		} else {
			System.out.println("Cuidado vc pode estar muito acima do seu peso ideal");
		}
		if (sexo == "Fem" & (peso == (62.1 * h) - 44.7)) {
			System.out.println("Seu peso é: " + peso);
			System.out.println("Parabéns você está no peso ideal.");
		} else if (sexo == "Fem" & (peso <= (62.1 * h) - 44.7)) {
			System.out.println("Cuidado vc pode estar muito abaixo do seu peso ideal");
		} else {
			System.out.println("Cuidado vc pode estar muito acima do seu peso ideal");
		} ler.close();
	}
}
