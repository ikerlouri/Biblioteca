package biblioteca;

import java.util.Scanner;

public class Formulario {

	static Scanner scan = new Scanner(System.in);

	public static Libro pedirLibro() {
		Libro libro = new Libro();
		System.out.println("Nombre del autor:");
		libro.setAutor(scan.nextLine());
		System.out.println("Numero de paginas:");
		libro.setNumPag(Integer.parseInt(scan.nextLine()));
		System.out.println("Titulo del libro:");
		libro.setTitulo(scan.nextLine());
		return libro;
	}

	public static int pedirIdLibro() {

		System.out.println("Cual es el id del libro que quieres eliminar?");

		int id = Integer.parseInt(scan.nextLine());

		return id;

	}

	public static Libro modificarDatosLibro(Libro libro) {

		System.out.println("Nombre del autor:");
		libro.setAutor(scan.nextLine());
		System.out.println("Numero de paginas:");
		libro.setNumPag(Integer.parseInt(scan.nextLine()));
		System.out.println("Titulo del libro:");
		libro.setTitulo(scan.nextLine());
		return libro;

	}

	public static String getTituloLibro() {
		System.out.println("Como se titula el libro que has cogido prestado?");
		String titulo = scan.nextLine();

		return titulo;

	}
	public static String getDNI() {
		String DNI;
		System.out.println("Introduce tu DNI:");
		DNI = scan.nextLine();
		return DNI;
		
	}
}
