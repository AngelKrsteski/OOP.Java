package zadaca;
import java.util.Objects;

public class Korisnik {
	private String username;
	private String email;
	private String id;
	private int godini;
	private boolean ePremium;
	public Korisnik(String username, String email, String id, int godini, boolean ePremium) {
        this.username = username;
        this.email = email;
        this.id = id;
        this.ePremium = ePremium;
       
        setGodini(godini);
    }
		public String getUsername() {
			return username;
		}
		public String getEmail() {
			return email;
		}
		public String getId() {
			return id;
		}
		public int getGodini() {
			return godini;
		}
		public boolean getePremium() {
			return ePremium;
		}
		public void setUsername(String Username) {
			this.username = Username;
		}
		public void setEmail(String Email) {
			this.email = Email;
		}
		public void setId(String Id) {
			this.id = Id;
		}
		
		public void setGodini(int Godini) {
			this.godini = Godini;
			if (godini < 13 && godini > 120) {
				System.out.println("Vnesena e pogresna vrednost");
			}
		}
		
		public void setePremium(boolean ePremium) {
			this.ePremium = ePremium;
		}
		public String toString() {
			if(ePremium == true) {
			return "Korisnik: " + username + "(" + email + "), Vozrast: " + godini + " godini, Tip: premium";
			}
			return "Korisnik: " + username + "(" + email + "), Vozrast: " + godini + " godini, Tip: standard";
		}
		@Override
		public int hashCode() {
		    return Objects.hash(id, username);
		}
		public boolean imaPristapDoAkcii() {
			if (ePremium == true && godini >= 18) {
				return true;
			}
			return false;
		}
	
}
