	package zadaca1;
	
	public class main {
		public static void main (String[] args) {
			Avtomobil car1 = new Avtomobil();
			car1.setBrend("Peugeot");
			car1.setModel("308");
			car1.settipNaGorivo("dizel");
			car1.setBoja("Crvena");
			System.out.println(car1.toString());
		}
	}
