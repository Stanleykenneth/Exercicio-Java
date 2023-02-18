package ExercicioEstrutura;

import javax.swing.JOptionPane;

/*Faça um programa que a calcule e mostre a área de um trapézio.
  Sabe-se que: A = (base maior + base meno)* altura / 2.
  OBS: Lembre-se a base maior e a base menor devem ser números maiores que zero.*/
public class Exercicio17 {
	
	public static void main(String[] args) {
		
		double baseMaior;
		double baseMenor;
		double altura;
		double area;
		
		baseMaior = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor da base Maior:"));
		JOptionPane.showMessageDialog(null, "O valor da base Maior é: " + baseMaior);
		
		baseMenor = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor da base Menor:"));
		JOptionPane.showMessageDialog(null, "O valor da base Maior é: " + baseMenor);
		
		altura = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor da altura:"));
		JOptionPane.showMessageDialog(null, "O valor da base Maior é: " + altura);
		
		
		if(baseMaior > 0 & baseMenor > 0) {
			
			area = ((baseMaior + baseMenor) * altura ) / 2;
			JOptionPane.showMessageDialog(null, "A área do trapézio é: " + area);
			
			
		} else {
			JOptionPane.showMessageDialog(null, "Impossível de calcular a área do trapézio!");
		}
	}
}
