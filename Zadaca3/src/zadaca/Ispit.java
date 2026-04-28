package zadaca;

public class Ispit {
	private String ime_na_ispit;
	private int poeni;
	private int ocenka;
	
	public String getIme_na_ispit () {
		return ime_na_ispit;
	}
	public void setIme_na_ispit(String Ime_na_ispit) {
		this.ime_na_ispit = Ime_na_ispit;
	}
	public int getPoeni () {
		return poeni;
	}
	public void setPoeni(int Poeni) {
		this.poeni = Poeni;
	}
	public int getOcenka () {
		return ocenka;
	}
	public void setOcenka(int Ocenka) {
		this.ocenka = Ocenka;
	}
	public Ispit(String ime, int poeni, int ocenka) throws IspitnaOcenkaException {
        if (ocenka < 5 || ocenka > 10) {
            
            throw new IspitnaOcenkaException("Vnesena e nesoodvetna ocenka!", ime);
        }
        
        this.ime_na_ispit = ime;
        this.poeni = poeni;
        this.ocenka = ocenka;
    }
}
