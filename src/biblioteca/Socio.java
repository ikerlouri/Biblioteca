package biblioteca;

public class Socio {

	private String nombre;
	private String apellido;
	private String direccion;
	private String poblacion;
	private String provincia;
	private String DNI;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getPoblacion() {
		return poblacion;
	}
	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	@Override
	public String toString() {
		return "Socio [nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion + ", poblacion="
				+ poblacion + ", provincia=" + provincia + ", DNI=" + DNI + "]";
	}
	
}
