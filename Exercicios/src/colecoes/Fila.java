package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();
		
		// Ofeer e Add --> Adicionam elementos na fila
		
		//Diferen�a � o comportamento que ocorre quando a fila est� cheia!
		
		fila.add("Maria");//Retorna falso quando a fila est� cheia
		fila.offer("Jo�o");// Lan�a uma exce��o
		fila.add("Ana");
		fila.offer("Bia");
		fila.add("Lia");
		fila.offer("Bianca");
		fila.offer("Daniela");
		
		// Peek e Element --> Obter o pr�ximo elemento da fila (Sem Remover)
		
		//Diferen�a � o comportamento que ocorre quando a fila est� vazia!
		
		System.out.println(fila.peek());// retorna null quando a fila est� vazia
		System.out.println(fila.peek());
		System.out.println(fila.element());// lan�a uma exce��o
		System.out.println(fila.element());
				
		for(String fil: fila) {
			System.out.println("Est� pessoa est� na fila "+ fil);
		}
		
		//-------------------------------------------------------------------------------
		// Peek e Element --> Obter o pr�ximo elemento da fila e remove
		
		//Diferen�a � o comportamento que ocorre quando a fila est� vazia!
		
		/* Poll ele obt�m o pr�ximo elemento removendo da fila, e pode ser chamado quantas vezes
		 * quiser que quando n�o tiver mais elemento ele vai retornar null
		*/
		System.out.println(fila.poll()); //retorna null
		System.out.println(fila.remove()); //lan�a um exce��o
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		
		
		//System.out.println(fila.size()); //tamanho da fila
		//fila.clear(); --> limpa a fila
		//fila.isEmpty(); --> para saber se a fila est� vazia
		//fila.contains(...);
		
		
		
		
	}

}
