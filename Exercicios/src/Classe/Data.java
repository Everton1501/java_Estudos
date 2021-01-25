package Classe;

public class Data {
//----------------------------------------------------------------------------------
	// VARIÁVEIS DE INSTÂNCIA
	int dia;
	int mes;
	int ano;
	
	Data () {
		//dia = 01;
		//mes = 01;
		//ano = 1970;
		this(1, 1, 1970);//O THIS AQUI ESTÁ COMO MÉTODO, ENTÃO O CONSTRUTOR Data()
		//IRAR CHAMAR O MÉTODO this(1 , 1. 1970); -> QUE IRAR EXECUTAR A DATA
	}
//---------------------------------------------------------------------------------	
	/*COMO AS VARIÁVEIS DE PARAMETROS TEM O MESMO NOME DAS VARIÁVEIS DE INSTÂNCIA
	 * PARA ACESSAR E DETERMINAR A VARIÁVEL DE INSTÂNCIA DEVE SE USAR O 
	 * (this."+ O NOME DA VARIÁVEL") CONFORME EXEMPLIFICADO ABAIXO: 
	 */
	Data (int dia, int mes, int ano){//VARIAVEIS DE PARÂMETRO
		//this(); ----> NESSE CASO NÃO PODERIA TER, PQ SE NÃO TERIA UM LOOPING INFINITO
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;	
	}
	
//---------------------------------------------------------------------------------	
	//NESSE CASO NÃO PRECISA PQ OS METODOS JÁ SÃO EXECUTADAS A PARTIR DE UMA INSTÂNCIA,
	//ENTÃO NÃO É NECESSÁRIO, USAR O THIS PARA MOSTRAR QUAL EXECUTAR, PQ POR PADRÃO JÁ
	//SERÁ EXECUTADO A CORRETA, MAS NÃO IMPEDE O USO
	String obterDataFormatada() {
		return String.format("%d/%d/%d", this.dia, mes, ano);
	}
	
	void imprimirDataFormatada() {
		System.out.printf(this.obterDataFormatada());
	}
//---------------------------------------------------------------------------------	
	
	
	
	
	
	
	
	
	
}
