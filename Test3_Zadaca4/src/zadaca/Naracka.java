package zadaca;

public class Naracka {
    public String idNaracka;
    public String klient;
    public String datum;
    public double iznos;
    public int status;

    public Naracka(String idNaracka, String klient, String datum, double iznos, int status) throws StatusNaNarackaException {
        this.idNaracka = idNaracka;
        this.klient = klient;
        this.datum = datum;
        this.iznos = iznos;

        if (status >= 1 && status <= 4) {
            this.status = status;
        } else {
   
            throw new StatusNaNarackaException("Nevaliden status!", idNaracka, datum);
        }
    }
}
