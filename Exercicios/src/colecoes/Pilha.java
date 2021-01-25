package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	
	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<String>();
		
		livros.add("Pequeno Principe"); // quando a pilha estiver cheia retona false
		livros.push("Dom Quixote"); //Quando a Pilha estiver cheia lan�a uma exce��o
		livros.push("O Hobbit");
		
		// Nesse caso o ultimo elemento e n�o remove
		System.out.println(livros.peek());// pilha vazia retorna null 
		System.out.println(livros.element());// pilha vazia  lan�a uma exce��o
		
		for(String livro: livros) {
			System.out.println("Livro contido na pilha "+livro);
		}
		
		//mostra o ultimo elemento e remove
		System.out.println(livros.pop());//lan�a uma exce��o pilha vazia
		System.out.println(livros.remove());//lan�a uma exce��o pilha vazia
		System.out.println(livros.poll());// retorna null pilha vazia
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		
		//livros.size();
		//livros.clear();
		//livros.isEmpty();
		//livros.contains(...);
	}

}
