package zadaca;

public class StatusNaNarackaException extends Exception {
	String idNaracka;
	String datum;
	public StatusNaNarackaException(String poraka, String idNaracka, String datum) {
		super(poraka);
		this.idNaracka = idNaracka;
		this.datum = datum;
	}
}
