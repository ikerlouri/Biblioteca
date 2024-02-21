package biblioteca;

import java.util.ArrayList;

public class Visor {


	public static void visualizarLibros(ArrayList<Libro> libros) {
		
		for (Libro libro : libros) {
			System.out.println(libro.toString());
		}
	}
public static void visualizarLibro(Libro libro) {
		
			System.out.println(libro.toString());
		}
	}

