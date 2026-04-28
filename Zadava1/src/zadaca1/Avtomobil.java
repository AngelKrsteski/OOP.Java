package zadaca1;

public class Avtomobil {

		private String brend;
		private String model;
		private String tipNaGorivo;
		private String boja;
			
		public String getBrend () {
			return brend;
		}
		
		public void  setBrend (String Brend1) {
			 this.brend = Brend1;
		}
		public String getModel () {
			return model;
		}
		
		public void  setModel (String Model) {
			 this.model = Model;
		}
		public String gettipNaGorivo () {
			return tipNaGorivo;
		}
		
		public void settipNaGorivo (String tipNaGorivo1) {
			 this.tipNaGorivo = tipNaGorivo1;
		}
		public String getBoja () {
			return boja;
		}
		
		public void setBoja (String Boja) {
			 this.boja = Boja;
		}
			 	public String toString() {
			 		return "Avtomobil [ " + brend + "], Model: [" +  model + "], Tip na gorivo: [" +  tipNaGorivo + "], Boja [" + boja + "]";
			 	}
		
	}


