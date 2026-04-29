package zadaca;
import java.util.ArrayList;

public class Hotel {
	private String ime;
	private String lokacija;
	private String idHotel;
	 ArrayList<Rezervacija> rezervacii = new ArrayList<Rezervacija>();
	 
    public String getIme() {
        return ime;
    }
    public void setIme(String Ime) {
        this.ime = Ime;
    }

    public String getLokacija() {
        return lokacija;
    }
    public void setLokacija(String Lokacija) {
        this.lokacija = Lokacija;
    }

    public String getIdHotel() {
        return idHotel;
    }
    public void setIdHotel(String IdHotel) {
        this.idHotel = IdHotel;
    }

  
    public double prosecenRejting() {
        if (rezervacii.isEmpty()) {
            return 0.0;
        }
        double suma = 0;
        for (Rezervacija r : rezervacii) {
            suma += r.getRejting(); 
        }
        return suma / rezervacii.size();
    }
}

