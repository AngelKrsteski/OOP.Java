package zadaca;

public class Rezervacija {
	private String idRezervacija;
	private String imeNaGostin;
	private String datum;
	private int brojNaNojki;
	private int rejting;
	
	public String getIdRezervacija() {
		return idRezervacija;
	}
	public String getImeNaGostin() {
		return imeNaGostin;
	}
	public String getDatum() {
		return datum;
	}
	public int getBrojNaNojki() {
		return brojNaNojki;
	}
	public int getRejting() {
		return rejting;
	}
	public void setIdRezervacija (String IdRezervacija) {
		this.idRezervacija = IdRezervacija;
	}
	public void setImeNaGostin (String ImeNaGostin) {
		this.imeNaGostin = ImeNaGostin;
	}
	public void setDatum (String Datum) {
		this.datum =  Datum;
	}
	public void setBrojNaNojki (int BrojNaNojki) {
		this.brojNaNojki = BrojNaNojki;
	}
	public void setRejting(int Rejting) throws NevalidenRejtingException {
	    if (Rejting < 1 || Rejting > 5) {
	        throw new NevalidenRejtingException("Nevaliden rating!", this.idRezervacija, this.datum);
	    }
	    this.rejting = Rejting;
	}
	public String toString() {
		return idRezervacija + " Ime na gostin: " + imeNaGostin + " " + datum + " " + brojNaNojki + " " + rejting;
	}
	
}
