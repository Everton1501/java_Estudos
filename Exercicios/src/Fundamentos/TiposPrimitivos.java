package Fundamentos;



public class TiposPrimitivos {
	public static void main(String[] args) {
		//Informa��es de um funcion�rio
		
		//Tipos num�ricos Inteiros
		
		byte anosDeEmpresa = 23;    //por padr�o coolocar a primeira palavra minusculas, e as outras palavaras a 1� Letra maiuscula.
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L;
		
		//Tipos num�ricos Reais
		
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		//Tipos booleano
		
		boolean estaDeFerias = false;  // false ou true
		
		//Tipo Caractere
		
		char status = 'A';  // Ativo
			
		//Dias de Empresa
		
		System.out.println(anosDeEmpresa * 365);
		
		//N�mero de Viagens
		
		System.out.println(numeroDeVoos / 2);
		
		//Pontos por Real, ou seja, a cada venda que ele faz quantos pontos ele ganha
		
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + " ganha R$ "+ salario);
		
		System.out.println("F�rias "+ estaDeFerias);
		
		System.out.println("Status " + status);
		
		
		
		
		
	}

}
