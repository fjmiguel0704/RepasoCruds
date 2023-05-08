package ejercicio2;

public class Almacen {
	private int codigo=0;
	private String descripcion="";
	private double precioCompra=0;
	private double precioVenta=0;
	private int stock=0;

	public Almacen() {
	}

	public Almacen(int codigo, String descripcion, double precioCompra, double precioVenta, int stock) {
		super();
		if (codigo > 0) {
			this.codigo = codigo;
		}
		if (!descripcion.isEmpty()) {
			this.descripcion = descripcion;
		}
		if (precioCompra > 0) {
			this.precioCompra = precioCompra;
		}
		if (precioVenta > 0) {
			this.precioVenta = precioVenta;
		}
		if (stock >= 0) {
			this.stock = stock;
		}
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecioCompra() {
		return precioCompra;
	}

	public void setPrecioCompra(double precioCompra) {
		this.precioCompra = precioCompra;
	}

	public double getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		String result;
		result = "Código artículo: " + codigo + "\n" + "Descripción: " + descripcion + "\n" + "Precio de Compra: "
				+ precioCompra + "\n" + "Precio de Venta: " + precioVenta + "\n" + "Stock: " + stock;
		return result;
	}
}
