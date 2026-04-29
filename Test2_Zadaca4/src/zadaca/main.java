package zadaca;

public class main {
	public static void main (String[] args) {
	    Hotel h = new Hotel();
	    h.setIdHotel("2231");
	    h.setIme("Hilton");
	    h.setLokacija("Barcelona");

	    try {
	       
	        Rezervacija r1 = new Rezervacija();
	        r1.setIdRezervacija("R1");
	        r1.setImeNaGostin("Angel");
	        r1.setDatum("10.05.2026");
	        r1.setRejting(5);
	        h.rezervacii.add(r1);
	        Rezervacija r2 = new Rezervacija();
	        r2.setIdRezervacija("R2");
	        r2.setImeNaGostin("Petar");
	        r2.setDatum("12.05.2026");
	        r2.setRejting(1);
	        h.rezervacii.add(r2);
	        Rezervacija r3 = new Rezervacija();
	        r3.setIdRezervacija("R3");
	        r3.setDatum("15.05.2026");
	        r3.setRejting(3); 
	        h.rezervacii.add(r3);
	        
	        
	    } catch (NevalidenRejtingException e) {
	        System.out.println("Greska vo rezervacijata: " + e.getMessage());
	        System.out.println("Problematicno ID: " + e.idRezervacija);
	    }

	    
	    System.out.println("Prosecen rejting na hotelot - " + h.getIme() + " е: " + h.prosecenRejting());
	    
	}
}