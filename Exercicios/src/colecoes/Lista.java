package colecoes;

import java.util.ArrayList;

public class Lista {
	
	public static void main(String[] args) {
		
		ArrayList<Usuario> lista = new ArrayList<Usuario>();
		
		Usuario u1 = new Usuario("Ana");
		lista.add(u1);
		lista.add(new Usuario("Maria"));
		lista.add(new Usuario("Jo�o"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Jos�"));
		
		lista.remove(2);
		lista.remove(new Usuario("Jos�"));
		
		// A ORDEM DE INSER��O FOI MANTIDA 
		for(Usuario u: lista){
			System.out.println(u);
		}
		
		System.out.println("Tem? "+ lista.contains(new Usuario("Lia")));
		
		System.out.println("O nome inserido no 3� espa�o � "+lista.get(3).nome);
		// (.get) acessa pelo �ndice, n�o tem essa op��o no SET
		
		
		
		
	}
}
