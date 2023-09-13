public class Orden {
	private String cliente;
	private int cantidadProductos;

	public Orden(String cliente, int cantidadProductos) {
		this.cliente = cliente;
		this.cantidadProductos = cantidadProductos;
	}
	
	public String getCliente() {
		return cliente;
	}
	
	public int getCantidadProductos() {
		return cantidadProductos;
	}
	
	public String toString() {
		return cliente + ": " + cantidadProductos + " productos.";
	}
}
