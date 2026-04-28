package zadaca;

public class main {

	public static void main(String[] args) {
		Covek coek = new Covek();
		Covek coek2 = new Covek();
		coek.setName("Daarko");
		coek2.setName("Marko");
		coek.setAge(533);
		coek2.setAge(333);
		System.out.println(coek.comp(coek,coek2));
	}

}
