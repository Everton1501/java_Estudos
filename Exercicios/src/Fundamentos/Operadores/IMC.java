package Fundamentos.Operadores;

import javax.swing.JOptionPane;

public class IMC {

        public static void main(String[] args) {
		
        String valor1 = JOptionPane.showInputDialog("Digite o seu peso: ");
        String valor2 = JOptionPane.showInputDialog("Digite o sua altura: ").replace(",", ".");
        
        double massa = Double.parseDouble(valor1);
        double altura = Double.parseDouble(valor2);
        
        
        double a = Math.pow(altura, 2);
        
        double imc = massa / a;
        
        System.out.printf("Seu indice de massa corporal � %.2f ", imc);
        
        
        
        	
		}	
}
