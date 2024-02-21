package biblioteca;

import java.util.Scanner;

public class GestorBiblioteca {

	public static void run() {
		Scanner scan = new Scanner(System.in);

		int opcion;

		do {
			
			Menu.mostrarMenuPrincipal();
			
			opcion = Integer.parseInt(scan.nextLine());

			switch (opcion) {
			case Menu.GESTIONAR_LIBROS:
				GestorLibro.run();
				break;

			case Menu.GESTIONAR_SOCIOS:
				Menu.mostrarMenuSocios();
				break;

			case Menu.GESTIONAR_PRESTAMOS:
				GestorPrestamo.run();
				break;
			case Menu.SALIR:
				System.out.println("Has salido del programa");
				break;
			default:
				System.out.println("Valor no esperado");
				break;
			
			}

		} while (opcion != 0);

	}

}
