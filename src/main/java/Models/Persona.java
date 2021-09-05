package Models;

import java.util.Date;

public class Persona {
	private final String rut, nombre, apellido, telefono;
	private final Date fecha_ingreso;

	public Persona(String rut, String nombre, String apellido, String telefono, Date fecha_ingreso) {
		super();
		this.rut = rut;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.fecha_ingreso = fecha_ingreso;
	}

	public String getRut() {
		return rut;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public String getTelefono() {
		return telefono;
	}

	public Date getFecha_ingreso() {
		return fecha_ingreso;
	}

}
