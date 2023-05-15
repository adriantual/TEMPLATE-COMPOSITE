package ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class PaqueteSeguros extends Seguro {
	private static double montoDescuento = 0.95;
	private List<Seguro> seguros;

	public PaqueteSeguros() {
		super(0.0);
		this.seguros = new ArrayList<Seguro>();
	}

	@Override
	public double montoTotal() {
		double total = 0;
		for (Seguro unSeguro : seguros) {
			total = total + descuento(unSeguro.precio);
		}
		return total;
	}

	private double descuento(double precio) {
		double total = precio * montoDescuento;

		return total;
	}

	public void agregarSeguro(Seguro unSeguro) {
		this.seguros.add(unSeguro);
	}

}
