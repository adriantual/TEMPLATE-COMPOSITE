package ejercicio5;

public abstract class Remeras {
	protected double precio;

	public Remeras(double precio) {
		super();
		this.precio = precio;
	}

	public double precioVenta() {
		double total = this.precio + this.recargos() - this.bonificaciones();
		return total;

	}

	protected abstract double recargos();

	protected abstract double bonificaciones();
}
