package Fundamentos.Operadores;

public class DesafioLogicos {
    public static void main(String[] args) {
		
    	
    	boolean trabalho1 = false;
    	boolean trabalho2 = false;
    	
    	boolean tv50 = trabalho1 && trabalho2;
    	boolean tv32 = trabalho1 ^ trabalho2;
    	boolean sorvete = trabalho1 || trabalho2;
    	boolean maisSaudavel = !sorvete;  //Operador un�rio
    
    	System.out.println( "A familia foi tomar sorvete ? "+ sorvete);
    	System.out.println("Comprou a TV de 50\" ? " + tv50);
    	
    	System.out.println("Comprou a TV de 32\" ? "+ tv32);
    	System.out.println("Mais sa�davel ? "+ maisSaudavel);
    	
    	
	}
}
