package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
	
	public static void main(String[] args) {
		
		
		//CARACTERISTICA HOMOGÊNEA E ORDENADO EM ORDEM ALFABÉTICA
		SortedSet<String> listaAprovados = new TreeSet<>();
		listaAprovados.add("Ana");
		listaAprovados.add("João");
		listaAprovados.add("Isabela");
		listaAprovados.add("Maria");
		listaAprovados.add("Paulo");
		listaAprovados.add("Adriana");
		
		for(String candidato : listaAprovados) {
			System.out.println(candidato);
		}
		
		//CARACTERISTICA HOMOGÊNEA E NÃO ORDENADO
		Set<Integer> nums = new HashSet<>();
		nums.add(1);
		nums.add(2);
		nums.add(120);
		nums.add(16);
		
		for(int n: nums) {
			System.out.println(n);
		}
		
		
	}

}
