package zadaca;

public class main {
	public static void main(String[] args) {
		
		try {
			Naracka n = new Naracka("0483", "Angel", "27.08.2019", 3500, 1);
			switch (n.status) {
			case(1):
				System.out.println(n.idNaracka + " " + n.klient + " "  + n.iznos + " " + n.datum + " kreirana");
			break;
			case(2):
				System.out.println(n.idNaracka + " "  + n.klient + " "  + n.iznos + " "  + n.datum + "ispratena");
			break;
			case(3):
				System.out.println(n.idNaracka + " "  + n.klient  + " " + n.iznos + " "  + n.datum + "dostavena");
			break;
			case(4):
				System.out.println(n.idNaracka + " "  + n.klient + " "  + n.iznos  + " "  + n.datum + "otkazana");
			break;
			}
		}catch (StatusNaNarackaException e){
			System.out.println("Greska vo naracka: " + e.getMessage());
		}
	}
}
