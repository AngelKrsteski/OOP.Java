package zadaca;

public class main {
	public static void main(String[] args) {
	    Avtomobil car = new Avtomobil();
	    Motor bike = new Motor();
	    Avtobus bus = new Avtobus();

	    System.out.println("--- DETALI ZA VOZILATA ---");

	    System.out.println("AVTOMOBIL:");
	    System.out.println("Broj na sedista: " + car.brSedista());
	    System.out.println("Broj na trkala: " + car.brTrkala());
	    System.out.println("Maksimalna brzina: " + car.maxBrzina() + " km/h");
	    System.out.println("Potrosuvacka: " + car.potrosuvacka() + " L/100km");
	    System.out.println();

	    System.out.println("MOTOR:");
	    System.out.println("Broj na sedista: " + bike.brSedista());
	    System.out.println("Broj na trkala: " + bike.brTrkala());
	    System.out.println("Maksimalna brzina: " + bike.maxBrzina() + " km/h");
	    System.out.println("Potrosuvacka: " + bike.potrosuvacka() + " L/100km");
	    System.out.println();

	    System.out.println("AVTOBUS:");
	    System.out.println("Broj na sedista: " + bus.brSedista());
	    System.out.println("Broj na trkala: " + bus.brTrkala());
	    System.out.println("Maksimalna brzina: " + bus.maxBrzina() + " km/h");
	    System.out.println("Potrosuvacka: " + bus.potrosuvacka() + " L/100km");
	}
}
