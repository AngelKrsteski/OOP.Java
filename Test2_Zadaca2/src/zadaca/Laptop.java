package zadaca;

public class Laptop extends Ured {

	@Override
	String tipNaEnergija() {
		return "Elektricna energija(baterija) \n";
	}
	@Override
	float potrosuvacka() {
		return (float) 3.5;
	}

	@Override
	boolean ePameten() {
		return true;
	}
	@Override
	float cena() {
		
		return 1500;
	}

}
