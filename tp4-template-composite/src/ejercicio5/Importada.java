package ejercicio5;

public class Importada extends Remeras {
	private static double aduana = 0.05;
	private static double aderido = 0.03;
	private static double venta = 0.25;

	public Importada(double precio) {
		super(precio);

	}

	@Override
	protected double recargos() {
		double recargoAduana = this.precio * aduana;
		double recargoAderido = this.precio * aderido;
		double recargoParaLaVenta = this.precio * venta;
		double total = recargoAderido + recargoAduana + recargoParaLaVenta;

		return total;
	}

	@Override
	protected double bonificaciones() {
		// TODO Auto-generated method stub
		return 0;
	}

}
