package biblioteca;

import java.sql.Date;

public class Prestamo {

	private int id_libro;
	private int id_socio;
	private Date fecha;
	private boolean devuelto;
	
	
	public int getId_libro() {
		return id_libro;
	}
	public void setId_libro(int id_libro) {
		this.id_libro = id_libro;
	}
	public int getId_socio() {
		return id_socio;
	}
	public void setId_socio(int id_socio) {
		this.id_socio = id_socio;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public boolean isDevuelto() {
		return devuelto;
	}
	public void setDevuelto(boolean devuelto) {
		this.devuelto = devuelto;
	}

	@Override
	public String toString() {
		return "Prestamo [id_libro=" + id_libro + ", id_socio=" + id_socio + ", fecha=" + fecha + ", devuelto="
				+ devuelto + "]";
	}
	
}
