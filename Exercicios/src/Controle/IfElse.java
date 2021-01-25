package Controle;

import javax.swing.JOptionPane;

public class IfElse {

	public static void main(String[] args) {
		
		String valor = JOptionPane.showInputDialog(
				"Informe o valor: ");
		int numero = Integer.parseInt(valor);
		
		//usando o IF e o ELSE o código fica menor em casos simples de apenas 2 casos
		if(numero % 2 == 0) {
			System.out.println(numero + " é PAR ");
		}else {
			System.out.println(numero + " é IMPAR");
		}
		
		//utilizando apenas o if, precisa digitar a formula da opção falsa.
		if(numero % 2 == 0) {
			System.out.println(numero + " é PAR");
		}
		
		if(numero % 2 == 1) {
			System.out.println(numero + " é IMPAR");
		}
		
		
	}
	
}
