package ExercicioEstrutura;

/*Usando switch, escreva um programa que leia um número inteiro entre 1 e 7
  e imprima o dia da semana correspondente a esse número. Isto é,
  Domingo = 1, Segunda = 2 e assim por diante.*/
public class Exercicio15 {
	
	public static void main(String[] args) {
		
		int dia = 7;	 
		
		switch(dia) {
		 
		case 1:
			System.out.println("Domingo");
		break;
		
		case 2:
			System.out.println("Segunda-Feira");
		break;
		
		case 3:
			System.out.println("Terça-Feira");
		break;
		
		case 4:
			System.out.println("Quarta-Feira");
		break;
		
		case 5:
			System.out.println("Quinta-Feira");
		break;
		
		case 6:
			System.out.println("Sexta Feira");
		break;
		
		case 7:
			System.out.println("Sábado");
		break;
		
		default:
		break;	
		}		
		
	}
}
