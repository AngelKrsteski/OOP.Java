package zadaca;

public class main {
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		s1.setIme("Angel");
		s1.setPrezime("Krsteski");
		s1.setIndex(1274);
		
		try {
			Ispit i1 = new Ispit("OOP", 90, 10);
			s1.dodajIspit(i1);
			
			
			Ispit i2 = new Ispit("Napredno", 40, 4);
			s1.dodajIspit(i2);
			
		} catch (IspitnaOcenkaException e){
			System.out.println("GRESKA: " + e.getMessage());
            System.out.println("Greskata e pronajdena vo ispitot: " + e.getImeNaIspit());
		}
		System.out.println("Studen: " + s1.getIme() + " ima polozeno:");
        for (Ispit i : s1.getIspiti()) {
            System.out.println("- " + i.getIme_na_ispit() + " so ocenka: " + i.getOcenka());
        }
       
	}
}
