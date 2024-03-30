public class CTernario {
	
	public static void main(String[] args){
		int a;
		String b;
		a=12;
		//OperadorCondicionalTernario
		b = (a == 5)? "é igual ":" é diferente";//ex:1.
		System.out.println("resultado :"+b);

		b = (a == 12)?"é igual":"é diferente";//ex:2.
		System.out.println("resultado :"+b);
		
		b=(a>12) ?"atrasado":(a<12) ?"adiantado":"na hora";//ex:3.
		System.out.println("resultado :"+b);
	}
}

