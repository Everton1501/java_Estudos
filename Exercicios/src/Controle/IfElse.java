package Controle;

import javax.swing.JOptionPane;

public class IfElse {

	public static void main(String[] args) {
		
		String valor = JOptionPane.showInputDialog(
				"Informe o valor: ");
		int numero = Integer.parseInt(valor);
		
		//usando o IF e o ELSE o c�digo fica menor em casos simples de apenas 2 casos
		if(numero % 2 == 0) {
			System.out.println(numero + " � PAR ");
		}else {
			System.out.println(numero + " � IMPAR");
		}
		
		//utilizando apenas o if, precisa digitar a formula da op��o falsa.
		if(numero % 2 == 0) {
			System.out.println(numero + " � PAR");
		}
		
		if(numero % 2 == 1) {
			System.out.println(numero + " � IMPAR");
		}
		
		
	}
	
}
