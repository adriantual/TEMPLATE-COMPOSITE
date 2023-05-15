package ejercicio3;

public class SeguroAutomovil extends Seguro {

	public SeguroAutomovil(double precio) {
		super(precio);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double montoTotal() {
		return this.precio;
	}

}
