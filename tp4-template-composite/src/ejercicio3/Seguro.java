package ejercicio3;

public abstract class Seguro {
	protected double precio;

	public Seguro(double precio) {
		super();
		this.precio = precio;
	}

	public abstract double montoTotal();
}
