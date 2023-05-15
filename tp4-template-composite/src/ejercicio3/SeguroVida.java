package ejercicio3;

public class SeguroVida extends Seguro {

	public SeguroVida(double precio) {
		super(precio);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double montoTotal() {
		return this.precio;
	}

}
