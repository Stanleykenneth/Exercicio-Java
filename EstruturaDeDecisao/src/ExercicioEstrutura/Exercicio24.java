package ExercicioEstrutura;
/*Uma empresa vende o mesmo produto para quatro diferentes estados.
  Cada estado possui uma taxa diferente de imposto
  (MG 7%; SP 12%; RJ 15%; MS 8%). Faça um programa em que o usuário entre com o 
  valor do produto e o programa retorne o preço final do produtio acrescido
  do imposto do estado em que está sendo vendido. Se o estado não for válido, mostar unma mensagewm
  de erro. */

import javax.swing.JOptionPane;

public class Exercicio24 {

	public static void main(String[] args) {
		
		int opcao = 0;
		 int preco;
		 
		 preco = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor do produto: "));
		 JOptionPane.showMessageDialog(null, preco);
		 
		
         while(opcao != 5) {
			
			opcao = Integer.parseInt(JOptionPane.showInputDialog(null, " ----- SELECIONSE SEU ESTADO----- "
																	 + "\n1 - MINAS GERAIS "
																	 + "\n2 - SÃO PAULO "
																	 + "\n3 - RIO DE JANEIRO"
																	 + "\n4 - MATO GROSSO DO SUL"
																	 + "\n5 - Sair"));
			
		  switch (opcao) {
			 case 1:
			    
				 JOptionPane.showMessageDialog(null, "O valor do produto a ser pago é: " + (preco + (preco * 0.7)));
				 
			 break;

			 case 2:
				    
				 JOptionPane.showMessageDialog(null, "O valor do produto a ser pago é: " + (preco + (preco * 1.2)));
				 
			 break;
			 
			 case 3:
				    
				 JOptionPane.showMessageDialog(null, "O valor do produto a ser pago é: " + (preco + (preco * 1.5)));
				 
			 break;
			 
			 case 4:
				    
				 JOptionPane.showMessageDialog(null, "O valor do produto a ser pago é: " + (preco + (preco * 0.8)));
				 
			 break;
			 
			 
			default:
				
				JOptionPane.showMessageDialog(null, "Não tributamos para esse estado!");
			break;
		}
			
         }		
	}

}
