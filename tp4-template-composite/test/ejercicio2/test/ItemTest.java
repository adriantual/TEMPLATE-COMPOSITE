package ejercicio2.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ejercicio2.HistoriaDeUsuario;
import ejercicio2.Spike;
import ejercicio2.Tarea;

class ItemTest {

	@Test
	void test() {
		Spike spike = new Spike("analisis", 15);
		Tarea tarea = new Tarea("tarea", 10);
		HistoriaDeUsuario miHistoria = new HistoriaDeUsuario("historia de usuario");

		miHistoria.agregarItem(tarea);
		miHistoria.agregarItem(spike);
		assertEquals(25, miHistoria.tiempoRequerido());

	}

	@Test
	void test1() {
		Spike spike = new Spike("analisis", 15);
		Spike spike2 = new Spike("analisis", 5);

		Tarea tarea = new Tarea("tarea", 10);
		Tarea tarea1 = new Tarea("tarea1", 80);
		HistoriaDeUsuario miHistoria = new HistoriaDeUsuario("historia de usuario");

		miHistoria.agregarItem(tarea);
		miHistoria.agregarItem(spike);
		miHistoria.agregarItem(tarea1);
		miHistoria.agregarItem(spike2);

		assertEquals(110, miHistoria.tiempoRequerido());

	}

}
