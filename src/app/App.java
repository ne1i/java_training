package app;

import mylib.Adder;

public class App {
	public static void main(String[] args) {
		Adder adder = new Adder();
		try {
			var name = adder.operatorName();
			System.out.println(name);
		} catch (Exception e) {
			System.err.println("Naaah, we fuckd up fr : " + e.toString());
		}
		for (int i = 1; i <= 10; ++i) {
			adder.ajouterNombre(i);
		}
		System.out.println(adder.afficherTotal());
		System.out.println(adder.renvoieNombres());
	}
}
