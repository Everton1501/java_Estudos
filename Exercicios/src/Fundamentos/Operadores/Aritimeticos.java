package Fundamentos.Operadores;

public class Aritimeticos {
	
	 public static void main(String[] args) {
		 
		 
		 System.out.println(2 + 3);
		 
		 var  x= 34.56;
		 double y = 2.2;
		 
		 System.out.println(x + y);
		 System.out.println(x - y);
		 System.out.println(x * y);
		 System.out.println(x / y);
		
		 int a = 8;
		 int b = 3;   
		 
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b); // resposta a perca de informação pois a resposta tem números flutuates 
		System.out.println(a / (double)b); // o (CAST) soluciona a falta de informação atribuindo o tipo double
		System.out.println(a / (float)b); // o tipo float tb aceita casas decimais, entretanto a resposta é mais pobre q o double
		
		System.out.println(a % b);
		System.out.println(8 % 2);
		
		System.out.println( x + y - a * b);

	 }
}