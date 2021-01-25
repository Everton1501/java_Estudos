package Classe;

public class Data {
//----------------------------------------------------------------------------------
	// VARI�VEIS DE INST�NCIA
	int dia;
	int mes;
	int ano;
	
	Data () {
		//dia = 01;
		//mes = 01;
		//ano = 1970;
		this(1, 1, 1970);//O THIS AQUI EST� COMO M�TODO, ENT�O O CONSTRUTOR Data()
		//IRAR CHAMAR O M�TODO this(1 , 1. 1970); -> QUE IRAR EXECUTAR A DATA
	}
//---------------------------------------------------------------------------------	
	/*COMO AS VARI�VEIS DE PARAMETROS TEM O MESMO NOME DAS VARI�VEIS DE INST�NCIA
	 * PARA ACESSAR E DETERMINAR A VARI�VEL DE INST�NCIA DEVE SE USAR O 
	 * (this."+ O NOME DA VARI�VEL") CONFORME EXEMPLIFICADO ABAIXO: 
	 */
	Data (int dia, int mes, int ano){//VARIAVEIS DE PAR�METRO
		//this(); ----> NESSE CASO N�O PODERIA TER, PQ SE N�O TERIA UM LOOPING INFINITO
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;	
	}
	
//---------------------------------------------------------------------------------	
	//NESSE CASO N�O PRECISA PQ OS METODOS J� S�O EXECUTADAS A PARTIR DE UMA INST�NCIA,
	//ENT�O N�O � NECESS�RIO, USAR O THIS PARA MOSTRAR QUAL EXECUTAR, PQ POR PADR�O J�
	//SER� EXECUTADO A CORRETA, MAS N�O IMPEDE O USO
	String obterDataFormatada() {
		return String.format("%d/%d/%d", this.dia, mes, ano);
	}
	
	void imprimirDataFormatada() {
		System.out.printf(this.obterDataFormatada());
	}
//---------------------------------------------------------------------------------	
	
	
	
	
	
	
	
	
	
}
