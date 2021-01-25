package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	
	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<String>();
		
		livros.add("Pequeno Principe"); // quando a pilha estiver cheia retona false
		livros.push("Dom Quixote"); //Quando a Pilha estiver cheia lança uma exceção
		livros.push("O Hobbit");
		
		// Nesse caso o ultimo elemento e não remove
		System.out.println(livros.peek());// pilha vazia retorna null 
		System.out.println(livros.element());// pilha vazia  lança uma exceção
		
		for(String livro: livros) {
			System.out.println("Livro contido na pilha "+livro);
		}
		
		//mostra o ultimo elemento e remove
		System.out.println(livros.pop());//lança uma exceção pilha vazia
		System.out.println(livros.remove());//lança uma exceção pilha vazia
		System.out.println(livros.poll());// retorna null pilha vazia
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		
		//livros.size();
		//livros.clear();
		//livros.isEmpty();
		//livros.contains(...);
	}

}
