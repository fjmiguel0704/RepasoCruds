package ejercicio1;

public class Alumno {
	private String nombre = "";
	private double notaMedia = 0;

	public Alumno() {

	}

	public Alumno(String nombre, double notaMedia) {
		super();
		if (!nombre.isEmpty()) {
			this.nombre = nombre;
		}
		if (notaMedia >= 0) {
			this.notaMedia = notaMedia;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getNotaMedia() {
		return notaMedia;
	}

	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}

	@Override
	public String toString() {
		String result;
		result = "Alumno: " + nombre + ": " + notaMedia;
		return result;
	}

}
