package ejercicio4.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import ejercicio4.Calculador;
import ejercicio4.CalculadorJubilado;
import ejercicio4.CalculadorNoJubilado;

class CalculadorTest {

	@Test
	void testJubiladoConPromocion() {

		Calculador calculador = new CalculadorJubilado(LocalDate.now().getMonth().getValue());

		double resultado = calculador.calcularPrecio(100);
		assertEquals(100.00, resultado);
	}

	@Test
	void testJubiladoSinPromocion() {

		Calculador calculador = new CalculadorJubilado(LocalDate.now().getMonth().getValue() - 1);

		double resultado = calculador.calcularPrecio(100);
		assertEquals(110.00, resultado);
	}

	@Test
	void testNoJubiladoConPromocion() {

		Calculador calculador = new CalculadorNoJubilado(LocalDate.now().getMonth().getValue());

		double resultado = calculador.calcularPrecio(100);
		assertEquals(115.00, resultado);
	}

	@Test
	void testNoJubiladoSinPromocion() {

		Calculador calculador = new CalculadorNoJubilado(LocalDate.now().getMonth().getValue() - 1);

		double resultado = calculador.calcularPrecio(100);

		assertEquals(121.00, resultado);
	}

}
