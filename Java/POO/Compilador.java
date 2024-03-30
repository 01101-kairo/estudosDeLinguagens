package POO;

public class Compilador {

	public static void main(String[] args) {
		Data d1 = new Data(1, "maio", 2006);
		Data d2 = new Data(1, "maio", 2007);
		Data d3 = new Data(1, "maio", 2008);

		d1.getString();
		d2.getString();
		d3.getString();

	}
}
