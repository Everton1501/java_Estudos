package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		
		/*Nesse caso os valores PRIMITIVOS já são transformados em wrappers, então o valor 1.2 foi
		 * salvo em Double, o boolean em Boolean, a String é String mesmo, o número int 1 para Integer
		 * e o char 'x' para Character
		 */
		conjunto.add(1.2);
		conjunto.add(true);
		conjunto.add("Teste");
		conjunto.add(1);
		conjunto.add('x');
		
		System.out.println("O Tamanho é " + conjunto.size());
		
		//NESSE CASO NÃO SERÁ CONTADO POIS SÃO OBJETOS REPETIDOS, E O HASHSET IRAR IGNORAR ELES
		conjunto.add('x');
		conjunto.add("Teste");
		
		System.out.println("O Tamanho é " + conjunto.size());
		
		// NESSE CASO SERÁ COMPUTADO PQ O T DO TESTE ESTÁ MINUSCULO DIFERENTE DO OUTRO
		conjunto.add("teste");
		
		System.out.println("O tamanho é "+ conjunto.size());
		
		System.out.println(conjunto.remove('X'));// NÃO REMOVEU POR CAUSA QUE FOI ADD 'x' minusculo
		System.out.println(conjunto.remove('x'));
		System.out.println(conjunto.remove("teste"));
		
		System.out.println("O tamanho é "+ conjunto.size());
		
		
		System.out.println(conjunto.contains('x'));// RESPOSTA FALSE PQ FOI REMOVIDO.
		System.out.println(conjunto.contains(1));
		System.out.println("Teste");
		
		Set nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		//conjunto.addAll(nums);// .addAll(); -> FAZ A UNIÃO DE 2 CONJUNTOS
		System.out.println(conjunto);
		
		conjunto.retainAll(nums); //.retainAll(); -> PASSA APENAS O ELEMENTO EM COMUM NOS 2 CONJUNTOS
		System.out.println(conjunto);
		
		conjunto.clear();// LIMPA O CONJUNTO E RETORNA VAZIO
		System.out.println(conjunto);
	}

}
