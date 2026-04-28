package zadaca;

	public class IspitnaOcenkaException extends Exception {
	    private String imeNaIspit;

	    public IspitnaOcenkaException(String poraka, String imeNaIspit) {
	        super(poraka); 
	        this.imeNaIspit = imeNaIspit;
	    }

	    public String getImeNaIspit() {
	        return imeNaIspit;
	    }
	}

