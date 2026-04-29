package zadaca;

public class NevalidenRejtingException extends Exception {
	String idRezervacija;
	String datum;
	    public NevalidenRejtingException(String poraka, String idRezervacija, String datum) {
	        super(poraka);
	        this.idRezervacija = idRezervacija;
	        this.datum = datum;
	    }
	}
	

