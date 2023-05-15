package ejercicio4;

import static java.time.LocalDate.now;
import static java.time.Month.of;

public class CalculadorJubilado extends Calculador {
	private static double promocion = 0.1;
	private static double sinPromocion = 0;

	public CalculadorJubilado(int mesEnPromocion) {
		super(mesEnPromocion);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected double descuento() {
		if (!of(mesEnPromocion).equals(now().getMonth())) {
			return promocion;

		}
		return sinPromocion;
	}

}