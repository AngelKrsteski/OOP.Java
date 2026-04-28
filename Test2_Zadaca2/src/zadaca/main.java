package zadaca;

import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		ArrayList <Ured> listaUredi = new ArrayList <Ured>();
		listaUredi.add(new TV());
		listaUredi.add(new Frizider());
		listaUredi.add(new Laptop());
		for(Ured u : listaUredi) {
			System.out.println("Info za uredot: " + u);
			System.out.println(u.tipNaEnergija());
			System.out.println(u.ePameten());
			System.out.println(u.potrosuvacka());
			System.out.println(u.cena());
			System.out.println();
			
		}
	}

}
