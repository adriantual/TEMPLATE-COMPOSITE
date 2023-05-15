package ejercicio3.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ejercicio3.PaqueteSeguros;
import ejercicio3.SeguroAutomovil;
import ejercicio3.SeguroHogar;
import ejercicio3.SeguroMedico;
import ejercicio3.SeguroVida;

class SeguroTest {

	@Test
	void test() {
		SeguroAutomovil seguroAutomovil = new SeguroAutomovil(10);
		SeguroHogar seguroHogar = new SeguroHogar(10);
		SeguroMedico seguroMedico = new SeguroMedico(10);
		SeguroVida seguroVida = new SeguroVida(10);
		PaqueteSeguros paquete1 = new PaqueteSeguros();

		paquete1.agregarSeguro(seguroVida);
		paquete1.agregarSeguro(seguroMedico);
		paquete1.agregarSeguro(seguroAutomovil);
		paquete1.agregarSeguro(seguroHogar);

		assertEquals(38.00, paquete1.montoTotal());
	}

	@Test
	void test1() {
		SeguroAutomovil seguroAutomovil = new SeguroAutomovil(10);
		SeguroHogar seguroHogar = new SeguroHogar(10);
		SeguroMedico seguroMedico = new SeguroMedico(10);
		SeguroVida seguroVida = new SeguroVida(10);
		PaqueteSeguros paquete1 = new PaqueteSeguros();

		paquete1.agregarSeguro(seguroVida);
		paquete1.agregarSeguro(seguroMedico);
		paquete1.agregarSeguro(seguroAutomovil);
		paquete1.agregarSeguro(seguroHogar);

		PaqueteSeguros paquete2 = new PaqueteSeguros();

		paquete2.agregarSeguro(seguroVida);
		paquete2.agregarSeguro(paquete1);

		assertEquals(9.5, paquete2.montoTotal());

	}

}
