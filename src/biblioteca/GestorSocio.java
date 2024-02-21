package biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class GestorSocio {

	public static void run() {
		Scanner scan = new Scanner(System.in);
		Menu.mostrarMenuLibros();
		int opcion = Integer.parseInt(scan.nextLine());
		int id;
		Libro libro;

		switch (opcion) {
		case Menu.SACAR_SOCIO:
			ArrayList<Libro> libros = GestorBBDD.sacarLibros();
			Visor.visualizarLibros(libros);
			break;
		case Menu.INSERTAR_SOCIO:
			libro = Formulario.pedirLibro();
			GestorBBDD.insertarSocio();
			System.out.println("Insertado correctamente");
			break;
		case Menu.ELIMINAR_SOCIO:
			id = Formulario.pedirIdLibro();

			GestorBBDD.eliminarLibros(id);
			System.out.println("Eliminado correctamente");
			break;
		case Menu.MODIFICAR_SOCIO:
			id = Formulario.pedirIdLibro();
			libro = GestorBBDD.getLibro(id);
			libro = Formulario.modificarDatosLibro(libro);
			GestorBBDD.modificarLibro(libro);
			System.out.println("Socio modificado correctamente");

			break;

		}
	}

}