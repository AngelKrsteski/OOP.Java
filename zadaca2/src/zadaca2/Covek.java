package zadaca2;

public class Covek implements ICovekComparator {
    private int godini;
    private String ime;
    
    public int getGodini() {
    	return godini;
    }
    public void setGodini(int Godini) {
    	this.godini = Godini;
    }
    public String getIme() {
    	return ime;
    }
    public void setIme(String Ime) {
    	this.ime = Ime;
    }

    @Override
    public int comp(Covek c1, Covek c2) {
        if (c1.getGodini() < c2.getGodini()) {
            return -1; 
        } else if (c1.getGodini() == c2.getGodini()) {
            return 0; 
        } else {
            return 1;  
        }
    }
}


