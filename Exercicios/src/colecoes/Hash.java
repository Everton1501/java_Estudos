package colecoes;

import java.util.HashSet;

public class Hash {

	public static void main(String[] args) {
		
		HashSet<Usuario> usuarios = new HashSet<Usuario>();
		
		usuarios.add(new Usuario("Ana"));
		usuarios.add(new Usuario("Bia"));
		usuarios.add(new Usuario("Lia"));
		
		boolean resultado = usuarios.contains(new Usuario("Bia"));
		System.out.println(resultado);
		
		
		/*OBS: SE RETIRAR DO USUARIO O HASHCODE, O PROGRAMA ATUAL DA FALSO, ELE LÁ EM USUÁRIO
		 * QUE ESTÁ PERMITINDO O PROGRAMA FAZER A PESQUISA
		 */
	}
	
}
