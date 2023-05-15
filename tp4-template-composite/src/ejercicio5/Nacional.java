package ejercicio5;

public class Nacional extends Remeras {
	private static double transporte = 0.015;
	private static double venta = 0.15;
	private static double bonificacion = 0.2;

	public Nacional(double precio) {
		super(precio);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected double recargos() {
		double recargoTransporte = this.precio * transporte;
		double recargoPrecioVenta = this.precio * venta;
		double total = recargoTransporte + recargoPrecioVenta;
		return total;
	}

	@Override
	protected double bonificaciones() {
		double total = this.precio * bonificacion;
		return total;
	}

}
