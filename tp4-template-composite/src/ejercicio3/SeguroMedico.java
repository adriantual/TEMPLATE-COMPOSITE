package ejercicio3;

public class SeguroMedico extends Seguro {

	public SeguroMedico(double precio) {
		super(precio);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double montoTotal() {

		return this.precio;
	}

}
