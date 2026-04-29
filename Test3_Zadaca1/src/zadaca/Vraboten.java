package zadaca;

import java.util.Objects;

public class Vraboten {
	private String ime;
	private String prezime;
	private String embg;
	private double plata;
	private boolean VraotenNaNeopredeleno;
	
	Vraboten(String ime, String prezime, String embg, double plata, boolean VraotenNaNeopredeleno ){
		 this.ime = ime;
		 this.prezime = prezime;
		 this.embg = embg;
		 if(plata >= 20000 || plata <= 100000) {
	    		this.plata = plata;
	    	}
		 this.VraotenNaNeopredeleno = VraotenNaNeopredeleno;
	}
	
	public String getIme() {
        return ime;
    }
    public void setIme(String Ime) {
        this.ime = Ime;
    }

    public String getPrezime() {
        return prezime;
    }
    public void setPrezime(String Prezime) {
        this.prezime = Prezime;
    }

    public String getEmbg() {
        return embg;
    }
    public void setEmbg(String Embg) {
        this.embg = Embg;
    }

    public double getPlata() {
        return plata;
    }
    public void setPlata(double Plata) {
    	if(plata >= 20000 && plata <= 100000) {
    		this.plata = Plata;
    	}
    }

    public boolean isVraotenNaNeopredeleno() {
        return VraotenNaNeopredeleno;
    }
    public void setVraotenNaNeopredeleno(boolean VraotenNaNeopredeleno) {
        this.VraotenNaNeopredeleno = VraotenNaNeopredeleno;
    }
   
    @Override
	public int hashCode() {
	    return Objects.hash(embg, ime);
	}
    public boolean imaBonus() {
    	if (VraotenNaNeopredeleno == true && plata >= 70000) {
    		return true;
    	}
    	return false;
    }
    public String toString() {
    	return "Vraboten: " + ime + " " + prezime + " [" + embg + "] " + " Plata: " + plata + " Dogovor: " + (VraotenNaNeopredeleno ? "neopredeleno" : "opredeleno") + " Bonus: " + (imaBonus() ? " yes" : " no");
    }
}
