package inici;

import java.util.ArrayList;

import Teclat.Teclat;
import altres.Poder;

public class Poders {

	ArrayList<Poder> llista = new ArrayList();

	static void menu() {

		int eixir = -1;
		while (eixir != 0) {
			int opcio = Teclat.lligOpcio("PODERS", "Crear", "Consultar", "Eliminar");

			switch (opcio) {
			case 1:
				crear();
				break;

			case 2:
				consultar();
				break;

			case 3:
				eliminar();
				break;

			case 0:
				eixir = 0;

				break;
			}

		}

	}

	static void crear() {

	}

	static void consultar() {

	}

	static void eliminar() {

	}

}
