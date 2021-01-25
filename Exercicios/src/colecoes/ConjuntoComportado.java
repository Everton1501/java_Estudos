package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
	
	public static void main(String[] args) {
		
		
		//CARACTERISTICA HOMOG�NEA E ORDENADO EM ORDEM ALFAB�TICA
		SortedSet<String> listaAprovados = new TreeSet<>();
		listaAprovados.add("Ana");
		listaAprovados.add("Jo�o");
		listaAprovados.add("Isabela");
		listaAprovados.add("Maria");
		listaAprovados.add("Paulo");
		listaAprovados.add("Adriana");
		
		for(String candidato : listaAprovados) {
			System.out.println(candidato);
		}
		
		//CARACTERISTICA HOMOG�NEA E N�O ORDENADO
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
