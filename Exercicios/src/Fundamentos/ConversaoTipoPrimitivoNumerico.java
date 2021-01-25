package Fundamentos;

public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {
		
		double a = 1;     // Conversão implícita
		System.out.println(a);
		
		float b = (float) 1.0; //Conversão explícita (CAST)
		System.out.println(b);
		/* mesmo a conversão explícita do float se o valor for um número não comportado pelo
		 * tipo float, o programa irar travar para o número suportado e ocorrerá perca de informação
		*/
		
		int c = 340;
		byte d = (byte) c;  // Conversão explícita (CAST)
		System.out.println(d);
		/* Nesse caso teve perca de informação o byte não suporta o número 340, por isso ele deu o valor
		 * de 84, como o limite é 127, depois do 127 ele voltou para o inicio -128, até chegar no 84
		 */
		
		double e = 1.999999;
		int f = (int) e; // Conversão explícita (CAST)
		System.out.println(f);
	}
}
