package ExercicioEstrutura;

/* 1 - Faça um programa que receba dois números e mostre qual deles é o maior.*/

import java.util.Scanner;

public class Exercício01 {
	public static void main(String[] args) {

		int num1;
		int num2;

		Scanner ler = new Scanner(System.in);

		System.out.println("Digite um número:");
		num1 = ler.nextInt();

		System.out.println("Digite um outro número:");
		num2 = ler.nextInt();

		if (num1 > num2) {
			
			System.out.println("O primeiro número é maoir que o segundo número digitado! ");
		} else if (num1 == num2) {
			
			System.out.println("Ambos os números são iguais!");
		}else {
			System.out.println("O segundo número é maior que o primeiro número digitado!");
		}
		ler.close();
	}
}
