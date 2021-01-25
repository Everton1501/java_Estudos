package Classe;

public class DataTeste {

	public static void main(String[] args) {
		
		Data d1 = new Data();
		d1.dia = 25;
		d1.mes = 12;
		d1.ano = 2020;
		
		var d2 = new Data();
		d2.dia = 20;
		d2.mes = 05;
		d2.ano = 2021;
		
		System.out.printf("%d/%d/%d", d1.dia, d1.mes, d1.ano);
		System.out.println();
		System.out.printf("%d/%d/%d", d2.dia, d2.mes, d2.ano);
		
		System.out.println();
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		String dataformatada = d1.obterDataFormatada();
		System.out.println(dataformatada);
		
		d2.imprimirDataFormatada();
		System.out.println();
		
		
		Data d3 = new Data();
		
		Data d4 = new Data(20, 05, 2022);
		
		System.out.printf("%d/%d/%d" , d3.dia, d3.mes, d3.ano);
		System.out.println();
		System.out.printf("%d/%d/%d" , d4.dia, d4.mes, d4.ano);
		
		
		
		
	}
}
