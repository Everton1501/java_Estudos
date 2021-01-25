package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();
		
		// Ofeer e Add --> Adicionam elementos na fila
		
		//Diferença é o comportamento que ocorre quando a fila está cheia!
		
		fila.add("Maria");//Retorna falso quando a fila está cheia
		fila.offer("João");// Lança uma exceção
		fila.add("Ana");
		fila.offer("Bia");
		fila.add("Lia");
		fila.offer("Bianca");
		fila.offer("Daniela");
		
		// Peek e Element --> Obter o próximo elemento da fila (Sem Remover)
		
		//Diferença é o comportamento que ocorre quando a fila está vazia!
		
		System.out.println(fila.peek());// retorna null quando a fila está vazia
		System.out.println(fila.peek());
		System.out.println(fila.element());// lança uma exceção
		System.out.println(fila.element());
				
		for(String fil: fila) {
			System.out.println("Está pessoa está na fila "+ fil);
		}
		
		//-------------------------------------------------------------------------------
		// Peek e Element --> Obter o próximo elemento da fila e remove
		
		//Diferença é o comportamento que ocorre quando a fila está vazia!
		
		/* Poll ele obtém o próximo elemento removendo da fila, e pode ser chamado quantas vezes
		 * quiser que quando não tiver mais elemento ele vai retornar null
		*/
		System.out.println(fila.poll()); //retorna null
		System.out.println(fila.remove()); //lança um exceção
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		
		
		//System.out.println(fila.size()); //tamanho da fila
		//fila.clear(); --> limpa a fila
		//fila.isEmpty(); --> para saber se a fila está vazia
		//fila.contains(...);
		
		
		
		
	}

}
