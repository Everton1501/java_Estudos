package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	
	public static void main(String[] args) {
		
		Map<Integer, String> usuarios = new HashMap<Integer, String>();
		usuarios.put(1, "Ana");//Adiciona e altera
		usuarios.put(3, "Bia");
		usuarios.put(2, "Lia");
		usuarios.put(4, "João");
		
		System.out.println(usuarios.size()); //tamanho do map
		System.out.println(usuarios.isEmpty());// true or false se o map está vazio
		
		System.out.println(usuarios.keySet());//mostra as chaves
		System.out.println(usuarios.values());// mostra os valores
		System.out.println(usuarios.entrySet());// mostra as chaves e os valores
		
		System.out.println(usuarios.containsKey(3));//retorna true or false se tem a chave
		System.out.println(usuarios.containsValue("Ana"));//retorna true or false se tem o valor
		
		System.out.println(usuarios.get(4));//mostra o valor
		
		//MOSTRA TODAS AS CHAVES
		for(int chave: usuarios.keySet()) {
			System.out.print(chave + " ");
		}
		
		System.out.println();
		
		//MOSTRA TODOS OS VALORES
		for(String valor: usuarios.values()) {
			System.out.print("[" + valor + "]");
		}
		
		System.out.println();
		
		//MOSTRA TANTO OS VALORES COMO AS CHAVES
		for(Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.print(registro.getKey() + " ==> ");
			System.out.println(registro.getValue());
		}
		System.out.println(usuarios.remove(1));//remove
		System.out.println(usuarios.remove(2, "Pedro"));//NÃO REMOVEU POR CAUSA DO VALOR ERRADO
		System.out.print(usuarios.entrySet());//Ana foi removido
	}

}
