package Fundamentos;

public class Nota��oPonto {

	public static void main(String[] args) {
       
		
		/*Exemplo 1... Nesse exemplo a String � separada e todas as a��es o valor da String deve ser
		 * dadas como por exemplo. s = s.replace ("X", "Senhora") 
		 */
		
		String s = "Bom dia X !!!";
		s = s.replace("X", "Senhora");
		s = s.toUpperCase();
		s= s.concat("!!!");
		
		System.out.println(s);
		
		/*Exemplo 2... Nesse exemplo todas a��es .replace, .toUpperCase(), entre outras podem ser
		* podem ser armazenadas dentro da pr�pria String, e pode ter quebras de linhas, tanto antes 
		* do . , como tamb�m depois do ponto.
		*/
		
		String x = "Ol� X"
				.replace("X", "Everton")
				.toUpperCase();
		
		System.out.println(x);
		
		/*Exemplo 3... as a��es mais o texto s�o escritos no pr�prio systema de sa�da System.out 
		 */
		
		System.out.println("Ol� X".replace("X", "Everton").toUpperCase());
		
		

	}
}
