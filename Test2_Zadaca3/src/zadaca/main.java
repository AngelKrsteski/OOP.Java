package zadaca;

public class main {

	public static void main(String[] args) {
		Rezervacija r = new Rezervacija();
		r.setBrojNaNojki(4);
		r.setDatum("28.08.2026");
		r.setIdRezervacija("44000");
		r.setImeNaGostin("Bogdan");
		try {
		r.setRejting(3);
		System.out.println(r.toString());
		} catch (NevalidenRejtingException e) {
			System.out.println(e.getMessage());
		}
		
		

	}

}
