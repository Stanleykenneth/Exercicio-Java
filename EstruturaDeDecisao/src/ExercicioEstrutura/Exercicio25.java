package ExercicioEstrutura;

import java.util.Scanner;

/*Calcule as raízes da equação de 2° grau.
  . Se raiz for < 0 imprime: Não Existe Raiz. 
  . Se raiz for = 0 Existe uma Raiz real imprime: Raiz única.
  . Se raiz for >= 0 impreime: AS duas Raizes.*/
public class Exercicio25 {
	
	public static void main(String[] args) {
		
		double a, b, c, x1, x2, delta;
		double raiz;
		
		Scanner ler  = new Scanner(System.in);
		
		System.out.println("digite o valor de a: ");
		 a = ler.nextInt();
		
		System.out.println("digite o valor de b: ");
		 b = ler.nextInt();
		
		System.out.println("digite o valor de c: ");
		 c = ler.nextInt();
		
		
		 delta = (b * b) - (4 * a * c );
		 
		 raiz = Math.sqrt(delta);
		
		x1 = (-b + raiz) / (2 * a);
		x2 = (-b - raiz) / (2 * a);
		
		System.out.println(x1);
		System.out.println(x2);
		
		ler.close();
	} 
}  
