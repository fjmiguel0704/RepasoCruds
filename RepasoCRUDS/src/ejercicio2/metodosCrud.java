package ejercicio2;

import java.util.Arrays;

import javax.naming.PartialResultException;

public class metodosCrud {

	static public void mostrarMenu() {
		System.out.println("MENÚ");
		System.out.println("===============");
		System.out.println("1. Listado");
		System.out.println("2. Alta");
		System.out.println("3. Baja");
		System.out.println("4. Modificación");
		System.out.println("5. Entrada de mercancía");
		System.out.println("6. Salida de mercancía");
		System.out.println("7. Salir");
	}

	static public void listado(Almacen articulos[]) {
		for (int i = 0; i < articulos.length; i++) {
			System.out.println(articulos[i].toString());
		}
	}

	static public void alta(Almacen articulos[], int codigo, String descripcion, double precioCompra,
			double precioVenta, int stock) {
		articulos = Arrays.copyOf(articulos, articulos.length + 1);
		articulos[articulos.length - 1] = new Almacen();

		for (int i = 0; i < articulos.length; i++) {
			if (articulos[i].getCodigo() == 0) {
				articulos[i].setCodigo(codigo);
				articulos[i].setDescripcion(descripcion);
				articulos[i].setPrecioCompra(precioCompra);
				articulos[i].setPrecioVenta(precioVenta);
				articulos[i].setStock(stock);
			}
		}
	}

	static public void baja(Almacen articulos[], int codigo) {
		for (int i = 0; i < articulos.length; i++) {
			if (articulos[i].getCodigo() == codigo) {
				System.arraycopy(articulos, i + 1, articulos, i, articulos.length - i - 1);
				articulos = Arrays.copyOf(articulos, articulos.length - 1);
			}
		}
	}

	static public void modificacion(Almacen articulos[], int codigo, String descripcion, double precioCompra,
			double precioVenta, int stock) {
		for (int i = 0; i < articulos.length; i++) {
			if (articulos[i].getCodigo() == codigo) {
				articulos[i].setCodigo(codigo);
				articulos[i].setDescripcion(descripcion);
				articulos[i].setPrecioCompra(precioCompra);
				articulos[i].setPrecioVenta(precioVenta);
				articulos[i].setStock(stock);
			}
		}
	}

	static public void entradaMercancia(Almacen articulos[], int codigo, int stock) {
		for (int i = 0; i < articulos.length; i++) {
			if (articulos[i].getCodigo() == codigo) {
				int stockActual = articulos[i].getStock();
				articulos[i].setStock(stockActual + stock);
			}
		}
	}

	static public void salidaMercancia(Almacen articulos[], int codigo, int stock) {
		for (int i = 0; i < articulos.length; i++) {
			if (articulos[i].getCodigo() == codigo) {
				int stockActual = articulos[i].getStock();
				articulos[i].setStock(stockActual - stock);
			}
		}
	}
}