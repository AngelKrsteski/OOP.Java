package zadaca;

import java.util.ArrayList;

public class Student {
	private String ime;
	private String prezime;
	private int index;
	private ArrayList <Ispit> ispiti = new ArrayList<Ispit>();
	
	public String getIme () {
		return ime;
	}
	public String getPrezime () {
		return prezime;
	}
	public int getIndex () {
		return index;
	}
	public void setIme(String Ime) {
		this.ime = Ime;
	}
	public void setPrezime(String Prezime) {
		this.prezime = Prezime;
	}
	public void setIndex(int Index) {
		this.index = Index;
	}
	
	public ArrayList <Ispit> getIspiti(){
		return ispiti;	
	}
	public void dodajIspit(Ispit i) {
		ispiti.add(i);
		
	}
	
}
