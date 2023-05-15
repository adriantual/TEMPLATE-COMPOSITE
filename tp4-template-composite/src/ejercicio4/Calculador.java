package ejercicio4;

public abstract class Calculador {
	private LogTransaction log;
	protected int mesEnPromocion;

	public Calculador(int mesEnPromocion) {
		super();
		this.log = new LogTransaction();
		this.mesEnPromocion = mesEnPromocion;
	}

	public double calcularPrecio(double precioProducto) {

		double precioTotal = precioProducto;
		precioTotal += precioProducto * this.descuento();
		log.log(CalculadorNoJubilado.class.getName());
		return precioTotal;
	}

	protected abstract double descuento();

}