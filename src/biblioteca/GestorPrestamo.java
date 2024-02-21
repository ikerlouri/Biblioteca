package biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class GestorPrestamo {

	public static void run() {
		Scanner scan = new Scanner(System.in);
		Menu.mostrarMenuPrestamo();
		int opcion = Integer.parseInt(scan.nextLine());
		int id;
	

		switch (opcion) {
		case Menu.INSERTAR_PRESTAMO:
			String tituloLibro = Formulario.getTituloLibro();
			String DNI = Formulario.getDNI();
			
			
			break;

		}
	}

}