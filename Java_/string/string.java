public class string { public static void main(String[] args) {
	String txt = new String("hei hei hoow");
	char[] nome = {'k','a','i','r','o',};
	char[] arraycar = new char[12];
	String tex1 = new String();
	String tex2 = new String(nome);
	String tex3 = new String(txt);
	String tex4 = new String(nome, 3, 2);
	System.out.printf ("tex1 = %s%ntex2 = %s%ntex3 = %s%ntex4 = %s%n",tex1,tex2,tex3,tex4);
	System.out.printf("%n comprimento da string:%d",txt.length());
	System.out.printf("%n mostrar os caracteres da string em reverso com charat:");
	for(int cont = txt.length() - 1;cont >= 0; cont --){ 
		System.out.printf("%c", txt.charAt(cont));}
	txt.getChars(0, 12, arraycar, 0);
	System.out.printf("%n O array de caracteres criado é:");
	for (char caractere: arraycar){ 
		System.out.print( caractere); } } }
