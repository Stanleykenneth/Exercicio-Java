package ExercicioEstrutura;

import javax.swing.JOptionPane;

/*Dados três valores, A, B, C; verificar se eles podem ser valores
  de lados de um triângulo e se forem, se um triângulo escaleno, 
  equilátero ou isóscele, considerando os seguintes conceitos:
  
  . O comprimento de cada lado de um triângulo é menor 
    do que a soma dos outros dois lados.
  
  . Chama-se equilátero o triângulo que têm lados iguais.
  
  . Denominam-se isóseles o triângulo que têm o comprimento de dois lados iguais.
  
  . Recebe o nome de escaleno o triângulo que têm três lados diferentes*/
public class Exercicio20 {
	
	public static void main(String[] args) {
		
		int A;
		int B;
		int C;
		
		A = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor de A do triângulo:"));
		JOptionPane.showMessageDialog(null, "A  do triângulo é:" + A);
		
		B = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor de B do triângulo:"));
		JOptionPane.showMessageDialog(null, "B do triângulo é:" + B);
		
		C = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor de C do triângulo:"));
		JOptionPane.showMessageDialog(null, "C do triângulo é:" + C);
		
		if(A < (B + C )){
			JOptionPane.showMessageDialog(null, "É um triângulo!");
		} else if( A == B & C == A ) {
			JOptionPane.showMessageDialog(null, "É um triângulo Equilátero!");
		} else if ((A != B)& (B == C)) {
			JOptionPane.showInternalMessageDialog(null, "É um triângulo Isóseles!");
		} else if((A != B) & (B != C) & (A != C)) {
			JOptionPane.showMessageDialog(null, "É um triângulo Escaleno!");
		} else {
			JOptionPane.showMessageDialog(null, "Não é um triângulo!");
		}			
	}
}
