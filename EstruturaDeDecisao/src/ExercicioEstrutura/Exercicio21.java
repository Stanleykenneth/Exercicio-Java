package ExercicioEstrutura;

import javax.swing.JOptionPane;

/*Escreva o menu de opções abaixo. Leia a opção do usuário
  e execute a operação escolhida. Escreva uma mensagem de erro se a opção for errada.
  Escolha a opcção:
  1- Soma de dois números
  2- Diferenca entre dois números
  3- Produto entre dois números
  4- Divisão entre dois números(O Denominador não pode ser zero)*/
public class Exercicio21 {

	public static void main(String[] args) {
		
		int opcao = 0;
		
		while(opcao != 6) {
			
			opcao = Integer.parseInt(JOptionPane.showInputDialog(null, " ----- MENU ----- "
																	 + "\n1 - Soma de dois números "
																	 + "\n2 - Diferença entre dois números "
																	 + "\n3 - Produto entre dois números"
																	 + "\n4 - Divisão entre dois números"
																	 + "\n5 - Sair")); 
			
			if(opcao > 6) {
				JOptionPane.showInternalMessageDialog(null, "Opção inválida!");
			}else {
				switch(opcao) {
				
				case 1: 
					int num1, num2, soma;
					
					num1 = Integer.parseInt(JOptionPane.showInputDialog(args,"Didigite um número." ));
					JOptionPane.showMessageDialog(null, num1);
					
					num2 = Integer.parseInt(JOptionPane.showInputDialog(args,"Didigite um número." ));
					JOptionPane.showMessageDialog(null, num2);
					
					soma = num1 + num2;
					JOptionPane.showInternalMessageDialog(null, "A soma dos números é: " + soma);
				break;
				
				case 2:						
					
					int numero1, numero2;
					
					numero1 = Integer.parseInt(JOptionPane.showInputDialog(args,"Didigite um número." ));
					JOptionPane.showMessageDialog(null, numero1);
					
					numero2 = Integer.parseInt(JOptionPane.showInputDialog(args,"Didigite um número." ));
					JOptionPane.showMessageDialog(null, numero2);
					
					if(numero1 > numero2) {
						JOptionPane.showMessageDialog(null, "O Primeiro número digitado é Maior que o Segundo número!");
					} else if(numero2 > numero1) {
						JOptionPane.showInternalMessageDialog(null, "O Segundo número digitado é Maior que o Primeiro número!");
					} else {
						JOptionPane.showMessageDialog(null, "Os números são iguais!");
					}
				break;
				
				case 3:
					int nume1, nume2, produto;
					
					nume1 = Integer.parseInt(JOptionPane.showInputDialog(args,"Didigite um número." ));
					JOptionPane.showMessageDialog(null, nume1);
					
					nume2 = Integer.parseInt(JOptionPane.showInputDialog(args,"Didigite um número." ));
					JOptionPane.showMessageDialog(null, nume2);
					
					produto = nume1 * nume2;
					JOptionPane.showInternalMessageDialog(null, "O produto entre os dois números é : " + produto);					
				break;
				
				case 4:
					int numer1, numer2, resultado;
					
					numer1 = Integer.parseInt(JOptionPane.showInputDialog(args,"Didigite um número." ));
					JOptionPane.showMessageDialog(null, numer1);
					
					numer2 = Integer.parseInt(JOptionPane.showInputDialog(args,"Didigite um número." ));
					JOptionPane.showMessageDialog(null, numer2);
					
					resultado = numer1 / numer2;
					JOptionPane.showInternalMessageDialog(null, "A soma dos números são: " + resultado);	
				break;	
				
				case 5:
					
					int s = JOptionPane.showConfirmDialog(null, "Deseja sair do Sistema?", null, JOptionPane.YES_NO_OPTION);
					if (s == JOptionPane.YES_OPTION) {
						JOptionPane.showMessageDialog(null, "Obrigado por usar nosso sistema!");
						System.exit(0);
					} else {

						JOptionPane.showInternalMessageDialog(null, "Simule seu Imprestimo novamente.");
						break;

					}
				 
				}
			}
			
		}

	}

}
