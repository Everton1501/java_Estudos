package oo.encapsulamento;

public class PessoaTeste {
	
	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa ("Paulo", -45);
		pessoa.setIdade(130);
		
		System.out.println(pessoa.getIdade());
		System.out.println(pessoa);
		
	}

}
