package zadaca;
import java.util.ArrayList;
public class main {

	public static void main(String[] args) {
		ArrayList <Vraboten> vraboteni = new ArrayList <Vraboten>();
		vraboteni.add( new Vraboten("Riste", "Petkoski", "234556009", 32000, false));
		vraboteni.add(new Vraboten("Marija", "Stojanovska", "150399545", 75000, true));
		vraboteni.add(new Vraboten("Darko", "Tasevski", "280799141", 38500, false));
		vraboteni.add(new Vraboten("Elena", "Popovska", "041298847", 512000, true));
		for (Vraboten v : vraboteni) {
	        if (v.imaBonus()) {
	            System.out.println(v.toString());
	        }
	    }
	}
}


