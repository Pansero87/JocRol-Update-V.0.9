package inici;

import altres.Equip;
import altres.Poder;
import personatges.*;

import java.util.Random;

import Teclat.*;

public class JocDeRol {

	public static void main(String[] args) {

//		provesFase1();
//		provesFase2();
//		provaFase4();
//		provaFase5();

		// Menú inicial

		int eixir = -1;
		while (eixir != 0) {
			int opcio = Teclat.lligOpcio("JOC DE ROL", "Configuració", "Jugar");

			switch (opcio) {
			case 1:
				menuConfiguracio();
				break;

			case 2:
				jugar();
				break;

			case 0:
				eixir = 0;
				break;
			}
		}

	}

	// Menú configuració
	static void menuConfiguracio() {

		int eixir = -1;
		while (eixir != 0) {
			int opcio = Teclat.lligOpcio("CONFIGURACIÓ", "Jugadors", "Equips", "Poders");

			switch (opcio) {
			case 1:
				Jugadors.menu();
				break;
			case 2:
				Equips.menu();
				break;
			case 3:
				Poders.menu();
			case 0:
				eixir = 0;
				break;

			}
		}

	}

	static void jugar() {

		int eixir = -1;
		while (eixir != 0) {
			int opcio = Teclat.lligOpcio("JUGAR", "Automatitzat", "Manual");

			switch (opcio) {
			case 1:

				Random jugRandom = new Random();

				boolean guanyador = false;
				while (guanyador == false) {

					int ranomIndex1 = jugRandom.nextInt(Jugadors.llista.size());
					int ranomIndex2 = jugRandom.nextInt(Jugadors.llista.size());

					Jugador jugAleatori1 = Jugadors.llista.get(ranomIndex1);
					Jugador jugAleatori2 = Jugadors.llista.get(ranomIndex2);

					if (!jugAleatori1.getNom().equals(jugAleatori2.getNom())) {

						if (!jugAleatori1.getEquip().getNom().equals(jugAleatori2.getEquip().getNom())) {

							Pantalla.titol(jugAleatori1.getClass().getSimpleName() + " ATACA A "
									+ jugAleatori2.getClass().getSimpleName());

							jugAleatori1.ataca(jugAleatori2);
							System.out.println();
							
						} else {
							System.out.println("Dos jugadors del mateix equipo no s'hataquen entre ells.");
						}

						if (jugAleatori1.getVides() == 0) {
							Jugadors.llista.remove(jugAleatori1);
						}
						if (jugAleatori2.getVides() == 0) {
							Jugadors.llista.remove(jugAleatori2);
						}

						if (Jugadors.llista.size() == 1) {
							guanyador = true;

							System.out.println("El guanyador és : " + Jugadors.llista.indexOf(0));
						}

					} else {
						System.out.println("Un jugador nno es pot atacar a ell mateix.");
					}

				}

				break;
			case 2:

				break;

			case 0:
				eixir = 0;
				break;

			}
		}

	}

	public static void provaFase5() {
		Poder p1, p2;
		Huma h1, h2;
		Alien a1, a2;

		Guerrer g1, g2;

		Jugador jug1, jug2;

		p1 = new Poder("Punyal", 60, 45);
		p2 = new Poder("Rage", 30, 50);

		h1 = new Huma("ZZZ", 20, 0, 120);
		a1 = new Alien("Triple", 50, 50, 200);

		jug1 = new Jugador("XXX", 58, 25, 80);
		jug2 = new Jugador("YYY", 50, 40, 100);

		g1 = new Guerrer("Izan", 60, 40, 200);
		g2 = new Guerrer("Cristian", 62, 40, 200);

//		g1.posa(p1);
//		Guerrer PA:60, PD:40, PV:100
//		Alien PA:50, PD:50 , PV 200

		a1.ataca(g1);
		a1.ataca(g1);
		a1.ataca(g1);
		a1.ataca(g1);

	}

//	public static void provesFase1() {
//		System.out.println("Vaig a crear un Jugador.");
//		Jugador j = new Jugador();
//		System.out.println();

//		System.out.println("Vaig a crear un Huma.");
//		Huma h = new Huma();
//		System.out.println();
//		
//		System.out.println("Vaig a crear un Alien.");
//		Alien a = new Alien();
//		System.out.println();
//		
//		System.out.println("Vaig a crear un Guerrer.");
//		Guerrer g = new Guerrer();
//		System.out.println();
//		
//		
//		
//	}

	public static void provesFase2() {

		Jugador jug1, jug2;
		Huma h1, h2;
		Alien a1, a2;
		Guerrer g1, g2;

		jug1 = new Jugador("XXX", 60, 25, 80);
		jug2 = new Jugador("YYY", 50, 40, 100);

		h1 = new Huma("ZZZ", 120, 0, 120);

		a1 = new Alien("Triple", 50, 40, 21);

		g1 = new Guerrer("Conan", 40, 30, 120);

		Equip e1, e2;
		e1 = new Equip("EAV");
		e2 = new Equip("LAS");
		e1.posa(a1);
		e2.posa(g1);

		a1.ataca(g1);

	}

	public static void provaFase4() {

		Equip e1, e2;

		Jugador j1, j2, j3, j4;
		j1 = new Jugador("Sergiet", 80, 70, 100);
		j2 = new Jugador("Manolet", 80, 70, 100);
		j3 = new Jugador("Izan", 80, 70, 100);

		Huma h1, h2;
		h1 = new Huma("ZZZ", 120, 0, 120);

		e1 = new Equip("EAV");
		e2 = new Equip("LAS");

		e1.posa(h1);
//		e2.posa(j2); // si un jugador no pertany a un equip, al mostrar les dades. ERROR.

//		e1.lleva("Manolet");
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(j1);

	}

}
