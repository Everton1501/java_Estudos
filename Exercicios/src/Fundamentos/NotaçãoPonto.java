package Fundamentos;

public class NotaçãoPonto {

	public static void main(String[] args) {
       
		
		/*Exemplo 1... Nesse exemplo a String é separada e todas as ações o valor da String deve ser
		 * dadas como por exemplo. s = s.replace ("X", "Senhora") 
		 */
		
		String s = "Bom dia X !!!";
		s = s.replace("X", "Senhora");
		s = s.toUpperCase();
		s= s.concat("!!!");
		
		System.out.println(s);
		
		/*Exemplo 2... Nesse exemplo todas ações .replace, .toUpperCase(), entre outras podem ser
		* podem ser armazenadas dentro da própria String, e pode ter quebras de linhas, tanto antes 
		* do . , como também depois do ponto.
		*/
		
		String x = "Olá X"
				.replace("X", "Everton")
				.toUpperCase();
		
		System.out.println(x);
		
		/*Exemplo 3... as ações mais o texto são escritos no próprio systema de saída System.out 
		 */
		
		System.out.println("Olá X".replace("X", "Everton").toUpperCase());
		
		

	}
}
