package zadaca;

public class main {
    public static void main(String[] args) {

        Klient k = new Klient("Angel", "Angelov", "ID123");

        try {

            Naracka n1 = new Naracka("0483", "Angel", "27.08.2019", 3000, 3); 
            Naracka n2 = new Naracka("0484", "Angel", "28.08.2019", 4000, 3); 
            Naracka n3 = new Naracka("0485", "Angel", "29.08.2019", 5000, 1); 
            Naracka n4 = new Naracka("0486", "Angel", "30.08.2019", 2000, 4); 

            k.naracki.add(n1);
            k.naracki.add(n2);
            k.naracki.add(n3);
            k.naracki.add(n4);

            System.out.println("Prosecen iznos na realizirani naracki: " + k.prosecenIznosNaRealizirani());

        } catch (StatusNaNarackaException e) {
            System.out.println("Greska vo naracka: " + e.getMessage() + " [ID: " + e.idNaracka + "]");
        }
    }
}