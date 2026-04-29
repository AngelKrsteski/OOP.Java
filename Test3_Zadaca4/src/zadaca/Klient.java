package zadaca;

import java.util.ArrayList;

public class Klient {
    private String ime;
    private String prezime;
    private String idKlient;
    
    ArrayList<Naracka> naracki = new ArrayList<Naracka>();

    Klient(String ime, String prezime, String idKlient) {
        this.ime = ime;
        this.prezime = prezime;
        this.idKlient = idKlient;
    }
    public double prosecenIznosNaRealizirani() {
        double suma = 0;
        int brojac = 0;
        for (Naracka n : naracki) {
            if (n.status == 3) {
                suma += n.iznos;
                brojac++;
            }
        }

        if (brojac == 0) {
            return 0.0;
        }
        return suma / brojac;
    }
}