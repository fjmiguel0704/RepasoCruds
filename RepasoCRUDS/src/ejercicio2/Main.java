package ejercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int codigoArticulo;
		String descripcionArticulo;
		double precioCompraArticulo;
		double precioVentaArticulo;
		int stockArticulo;
		int opc;
		Almacen articulos[] = new Almacen[0];

		Scanner read = new Scanner(System.in);

		do {
			metodosCrud.mostrarMenu();
			opc = read.nextInt();

			switch (opc) {
			case 1:
				metodosCrud.listado(articulos);
				break;
			case 2:
				System.out.println("Código del artículo: ");
				codigoArticulo = read.nextInt();
				read.nextLine();
				System.out.println("Descipción del artículo: ");
				descripcionArticulo = read.next();
				System.out.println("Precio de compra del artículo: ");
				precioCompraArticulo = read.nextDouble();
				read.nextLine();
				System.out.println("Precio de venta del artículo: ");
				precioVentaArticulo = read.nextDouble();
				read.nextLine();
				System.out.println("Stock del artículo: ");
				stockArticulo = read.nextInt();
				read.nextLine();
				metodosCrud.alta(articulos, codigoArticulo, descripcionArticulo, precioCompraArticulo,
						precioVentaArticulo, stockArticulo);
				break;
			case 3:
				System.out.println("Código del artículo a eliminar: ");
				codigoArticulo = read.nextInt();
				read.nextLine();
				metodosCrud.baja(articulos, codigoArticulo);
				break;
			case 4:
				System.out.println("Código del artículo a modificar: ");
				codigoArticulo = read.nextInt();
				read.nextLine();
				System.out.println("Descipción del artículo a modificar: ");
				descripcionArticulo = read.next();
				System.out.println("Precio de compra del artículo a modificar: ");
				precioCompraArticulo = read.nextDouble();
				read.nextLine();
				System.out.println("Precio de venta del artículo a modificar: ");
				precioVentaArticulo = read.nextDouble();
				read.nextLine();
				System.out.println("Stock del artículo a modificar: ");
				stockArticulo = read.nextInt();
				read.nextLine();
				metodosCrud.modificacion(articulos, codigoArticulo, descripcionArticulo, precioCompraArticulo,
						precioVentaArticulo, stockArticulo);
				break;
			case 5:
				System.out.println("Código del artículo al que incrementar stock: ");
				codigoArticulo = read.nextInt();
				read.nextLine();
				System.out.println("Cantidad de stock a añadir: ");
				stockArticulo = read.nextInt();
				read.nextLine();
				metodosCrud.entradaMercancia(articulos, codigoArticulo, stockArticulo);
			case 6:
				System.out.println("Código del artículo al que decrementar stock: ");
				codigoArticulo = read.nextInt();
				read.nextLine();
				System.out.println("Cantidad de stock a quitar: ");
				stockArticulo = read.nextInt();
				read.nextLine();
				metodosCrud.salidaMercancia(articulos, codigoArticulo, stockArticulo);
				break;
			case 7:
				System.out.println("Saliendo...");
				break;
			default:
				System.out.println("Opción incorrecta");
			}
		} while (opc != 7);

	}

}
