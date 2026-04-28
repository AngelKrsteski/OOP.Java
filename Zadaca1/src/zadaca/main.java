package zadaca;

public class main {
	public static void main (String[] args) {
		Tastatura key1 = new Tastatura();
		key1.setModel("Corsair");
		key1.setBrend("NBK223");
		key1.setbrNaKopcinja1(33);
		key1.setBezzicna(true);
		System.out.println();
		if(key1.isBezzicna()) {
			System.out.println(key1.toString() + "bezicna ]");
		}else {
		System.out.println(key1.toString() + "zicana ]");}
	}
}
