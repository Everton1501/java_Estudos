package colecoes;

import java.util.ArrayList;

public class Lista {
	
	public static void main(String[] args) {
		
		ArrayList<Usuario> lista = new ArrayList<Usuario>();
		
		Usuario u1 = new Usuario("Ana");
		lista.add(u1);
		lista.add(new Usuario("Maria"));
		lista.add(new Usuario("João"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("José"));
		
		lista.remove(2);
		lista.remove(new Usuario("José"));
		
		// A ORDEM DE INSERÇÃO FOI MANTIDA 
		for(Usuario u: lista){
			System.out.println(u);
		}
		
		System.out.println("Tem? "+ lista.contains(new Usuario("Lia")));
		
		System.out.println("O nome inserido no 3° espaço é "+lista.get(3).nome);
		// (.get) acessa pelo índice, não tem essa opção no SET
		
		
		
		
	}
}
