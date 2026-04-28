package zadaca;

public class Frizider extends Ured {
	@Override
	String tipNaEnergija() {
		return "Elektricna energija \n";
	}
	@Override
	float potrosuvacka() {
		return (float) 44.3;
	}

	@Override
	boolean ePameten() {
		return false;
	}
	@Override
	float cena() {
		
		return 3900;
	}

}
