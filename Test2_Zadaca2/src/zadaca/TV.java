package zadaca;

public class TV extends Ured{
	@Override
	String tipNaEnergija() {
		return "Elektricna energija \n";
	}
	@Override
	float potrosuvacka() {
		return (float) 5.6;
	}

	@Override
	boolean ePameten() {
		return true;
	}
	@Override
	float cena() {
		
		return 2300;
	}

}
