package ejercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String nombreAlumno;
		double notMedAlumno;
		int opc;

		Alumno alumnos[] = new Alumno[30];

		Scanner read = new Scanner(System.in);

		for (int i = 0; i < alumnos.length; i++) {
			alumnos[i] = new Alumno();
		}

		do {
			MetodosCrud.mostrarMenu();
			System.out.println();
			System.out.println("Introduce una opción: ");
			opc = read.nextInt();
			read.nextLine();

			switch (opc) {
			case 1:
				MetodosCrud.listado(alumnos);
				break;
			case 2:
				System.out.println("Nombre del alumno: ");
				nombreAlumno = read.next();
				System.out.println("Nota media del alumno: ");
				notMedAlumno = read.nextDouble();
				read.nextLine();
				MetodosCrud.añadirAlumno(nombreAlumno, notMedAlumno, alumnos);
				break;
			case 3:
				System.out.println("Nombre del alumno a modificar: ");
				nombreAlumno = read.next();
				System.out.println("Nueva nota: ");
				notMedAlumno = read.nextDouble();
				read.nextLine();
				MetodosCrud.modificarAlumno(nombreAlumno, notMedAlumno, alumnos);
				break;
			case 4:
				System.out.println("Nombre del alumno a eliminar: ");
				nombreAlumno = read.next();
				MetodosCrud.eliminarAlumno(nombreAlumno, alumnos);
				break;
			case 5:
				System.out.println("Saliendo...");
				break;
			default:
				System.out.println("Opción incorrecta");
			}
		} while (opc != 5);

	}

}