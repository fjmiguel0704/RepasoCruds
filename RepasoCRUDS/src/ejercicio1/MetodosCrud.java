package ejercicio1;

public class MetodosCrud {

	static public void mostrarMenu() {
		System.out.println("ALUMNOS/AS");
		System.out.println("===================");
		System.out.println("1. Listado.");
		System.out.println("2. Nuevo Alumno.");
		System.out.println("3. Modificar.");
		System.out.println("4. Borrar.");
		System.out.println("5. Salir.");
	}

	static public void listado(Alumno alumnos[]) {
		for (int i = 0; i < alumnos.length; i++) {
			if (!alumnos[i].getNombre().equals("")) {
				System.out.println(alumnos[i].toString());
			}
		}
	}

	static public void añadirAlumno(String nombre, double notaMedia, Alumno alumnos[]) {
		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i].getNombre().equals("")) {
				alumnos[i].setNombre(nombre);
				alumnos[i].setNotaMedia(notaMedia);
				break;
			}
		}
	}

	static public void modificarAlumno(String nombre, double notaMedia, Alumno alumnos[]) {
		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i].getNombre().equals(nombre)) {
				alumnos[i].setNotaMedia(notaMedia);
			}
		}
	}

	static public void eliminarAlumno(String nombre, Alumno alumnos[]) {
		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i].getNombre().equals(nombre)) {
				alumnos[i].setNombre("");
				alumnos[i].setNotaMedia(0);
			}
		}
	}
}
