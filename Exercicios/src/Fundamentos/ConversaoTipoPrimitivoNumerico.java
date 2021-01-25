package Fundamentos;

public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {
		
		double a = 1;     // Convers�o impl�cita
		System.out.println(a);
		
		float b = (float) 1.0; //Convers�o expl�cita (CAST)
		System.out.println(b);
		/* mesmo a convers�o expl�cita do float se o valor for um n�mero n�o comportado pelo
		 * tipo float, o programa irar travar para o n�mero suportado e ocorrer� perca de informa��o
		*/
		
		int c = 340;
		byte d = (byte) c;  // Convers�o expl�cita (CAST)
		System.out.println(d);
		/* Nesse caso teve perca de informa��o o byte n�o suporta o n�mero 340, por isso ele deu o valor
		 * de 84, como o limite � 127, depois do 127 ele voltou para o inicio -128, at� chegar no 84
		 */
		
		double e = 1.999999;
		int f = (int) e; // Convers�o expl�cita (CAST)
		System.out.println(f);
	}
}
