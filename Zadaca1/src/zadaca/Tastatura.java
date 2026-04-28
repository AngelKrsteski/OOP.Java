package zadaca;

public class Tastatura {
	private String brend;
	private String model;
	private int brNaKopcinja;
	private boolean bezzicna;
	
	public String getBrend() {
		return brend;
	}
	public void setBrend (String Brend) {
		this.brend = Brend;
	}
	public String getModel() {
		return model;
	}
	public void setModel (String Model) {
		this.model = Model;
	}
	public int getbrNaKopcinja1() {
		return brNaKopcinja;
	}
	public void setbrNaKopcinja1 (int brNakopcinja1) {
		this.brNaKopcinja = brNakopcinja1;
	}
	public boolean isBezzicna() {
		return bezzicna;
	}
	public void setBezzicna(boolean Bezzicna) {
		this.bezzicna = Bezzicna;
	}
	public String toString() {
		return "Tastatura: Brend=[" + brend + "], Model=[" + model + "], Broj na kopcinja=[" + brNaKopcinja + "], Bezzicna=[ ";
	}
}
