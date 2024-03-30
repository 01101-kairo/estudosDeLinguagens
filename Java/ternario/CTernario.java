public class CTernario {
	
	public static void main(String[] args){
		int a;
		String b;
		a=12;
		/* OperadorCondicionalTernario
    ex:1. */
		b = (a == 5)? " é igual ":" é diferente";
		System.out.println("resultado :"+b);
    //ex:2.
		b = (a == 12)?" é igual":" é diferente";
		System.out.println("resultado :"+b);
    //ex:3.
		b=(a>12) ?" atrasado":(a<12) ?" adiantado":" na hora";
		System.out.println("resultado :"+b);
	}
}
