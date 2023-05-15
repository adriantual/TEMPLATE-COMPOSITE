package ejercicio5.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ejercicio5.Importada;
import ejercicio5.Nacional;
import ejercicio5.Remeras;

class RemerasTest {

	@Test
	void test() {
		Remeras unaRemera = new Importada(100);

		assertEquals(133.00, unaRemera.precioVenta());

	}

	@Test
	void test1() {
		Remeras unaRemera = new Nacional(100);

		assertEquals(96.5, unaRemera.precioVenta());

	}

}
