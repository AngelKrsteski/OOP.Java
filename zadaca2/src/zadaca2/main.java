package zadaca2;

public class main {
	public static void main (String[] args) {
		Covek c1 = new Covek();
		c1.setIme("Darko");
		c1.setGodini(22);
		Covek c2 = new Covek();
		c2.setIme("Bojan");
		c2.setGodini(22);
		System.out.println(c1.comp(c1 , c2));
	}
}
