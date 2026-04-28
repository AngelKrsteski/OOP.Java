package zadaca;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<Korisnik> lista = new ArrayList<>();

        
        lista.add(new Korisnik("Krste", "krste@gmail.com", "1", 19, true));
        lista.add(new Korisnik("Petar", "p@gmail.com", "2", 15, true));
        lista.add(new Korisnik("Ana", "a@gmail.com", "3", 25, false));
        lista.add(new Korisnik("Maja", "m@gmail.com", "4", 30, true));

        System.out.println(" Site korisnici");
        for (Korisnik k : lista) {
          
            System.out.print(k.toString());
            
            
            System.out.print(" | Hash: " + k.hashCode());
            
            
            System.out.println(" | Akcii: " + (k.imaPristapDoAkcii() ? "yes" : "no"));
        }

        System.out.println("\n Korisnici koi imaat pristap do akcii");
        for (Korisnik k : lista) {
            if (k.imaPristapDoAkcii()) {
                System.out.println(k.getUsername());
            }
        }
    }
}