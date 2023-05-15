package ejercicio3;

public class SeguroHogar extends Seguro {

	public SeguroHogar(double precio) {
		super(precio);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double montoTotal() {
		return this.precio;
	}

}
