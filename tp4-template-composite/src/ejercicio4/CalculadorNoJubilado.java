package ejercicio4;

import static java.time.LocalDate.now;
import static java.time.Month.of;

public class CalculadorNoJubilado extends Calculador {
	private static double promocion = 0.15;
	private static double sinPromocion = 0.21;

	public CalculadorNoJubilado(int mesEnPromocion) {
		super(mesEnPromocion);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected double descuento() {
		if (of(mesEnPromocion).equals(now().getMonth())) {
			return promocion;
		}
		return sinPromocion;
	}

}
