package biblioteca;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class GestorBBDD extends Conector {

	Libro libro = new Libro();

	public static ArrayList<Libro> sacarLibros() {
		ArrayList<Libro> libros = new ArrayList<>();
		try {

			conectar();
			Statement st = conexion.createStatement();

			String sentenciaSelect = "SELECT * FROM libros";

			ResultSet resultado = st.executeQuery(sentenciaSelect);

			while (resultado.next()) {
				Libro libro = new Libro();
				libro.setAutor(resultado.getString("autor"));
				libro.setNumPag(resultado.getInt("num_pag"));
				libro.setId(resultado.getInt("id"));
				libro.setTitulo(resultado.getString("titulo"));

				libros.add(libro);

			}
			conexion.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return libros;

	}

	public static void insertarLibros(Libro libro) {
		Scanner scan = new Scanner(System.in);
		conectar();
		try {
			PreparedStatement preparedSt = conexion
					.prepareStatement("INSERT INTO libros (autor,num_pag,titulo) VALUES (?,?,?)");

			preparedSt.setString(1, libro.getAutor());
			preparedSt.setInt(2, libro.getNumPag());
			preparedSt.setString(3, libro.getTitulo());
			preparedSt.execute();

			conexion.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void eliminarLibros(int id) {
		Scanner scan = new Scanner(System.in);
		conectar();
		try {

			PreparedStatement preparedSt = conexion.prepareStatement("DELETE FROM libros WHERE id = ?");
			preparedSt.setInt(1, id);
			preparedSt.execute();

			conexion.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void modificarLibro(Libro libro) {
		conectar();
		try {
			PreparedStatement preparedSt = conexion
					.prepareStatement("UPDATE libros SET titulo= ?, autor= ?,num_pag= ? WHERE id = ?");
			preparedSt.setString(1, libro.getTitulo());
			preparedSt.setString(2, libro.getAutor());
			preparedSt.setInt(3, libro.getNumPag());
			preparedSt.setInt(4, libro.getId());
			preparedSt.executeUpdate();

			conexion.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	//

	public static Libro getLibro(int id) {
		Libro libro = new Libro();
		Conector.conectar();

		try {
			Statement st = conexion.createStatement();

			String sentenciaSelect = "SELECT * FROM libros WHERE id =" + id;

			ResultSet resultado = st.executeQuery(sentenciaSelect);

			while (resultado.next()) {
			libro.setAutor(resultado.getString("autor"));
			libro.setNumPag(resultado.getInt("num_pag"));
			libro.setId(resultado.getInt("id"));
			libro.setTitulo(resultado.getString("titulo"));
			}
			conexion.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return libro;

	}
	public static void insertarSocio() {
		Conector.conectar();
		Socio socio = new Socio();
		try {
			PreparedStatement preparedSt = conexion
					.prepareStatement("INSERT INTO libros (nombre,apellido,direccion,poblacion,provincia,dni) VALUES (?,?,?,?,?,?,?)");

			preparedSt.setString(1, (socio.getNombre()));
			preparedSt.setString(2, socio.getApellido());
			preparedSt.setString(3, socio.getDireccion());
			preparedSt.setString(4, socio.getPoblacion());
			preparedSt.setString(5, socio.getProvincia());
			preparedSt.setString(6, socio.getDNI());
			preparedSt.execute();

			conexion.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
