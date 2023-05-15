package ejercicio1.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ejercicio1.Director;
import ejercicio1.EmpleadoRegular;
import ejercicio1.Gerente;
import ejercicio1.LiderDeProyecto;
import ejercicio1.MandoMedio;

class EmpleadoTest {

	@Test
	void test() {
		EmpleadoRegular empleadoRegular1 = new EmpleadoRegular(100);
		EmpleadoRegular empleadoRegular2 = new EmpleadoRegular(100);
		EmpleadoRegular empleadoRegular3 = new EmpleadoRegular(100);
		EmpleadoRegular empleadoRegular4 = new EmpleadoRegular(100);

		LiderDeProyecto liderDeProyecto1 = new LiderDeProyecto(200);
		LiderDeProyecto liderDeProyecto2 = new LiderDeProyecto(200);

		MandoMedio mandosMedios1 = new MandoMedio(300);
		MandoMedio mandosMedios2 = new MandoMedio(300);

		Gerente gerente1 = new Gerente(400);
		Gerente gerente2 = new Gerente(400);

		Director director = new Director(500);

		liderDeProyecto1.agregarEmpleado(empleadoRegular1);
		liderDeProyecto1.agregarEmpleado(empleadoRegular2);
		liderDeProyecto2.agregarEmpleado(empleadoRegular3);
		liderDeProyecto2.agregarEmpleado(empleadoRegular4);

		mandosMedios1.agregarEmpleado(liderDeProyecto1);
		mandosMedios2.agregarEmpleado(liderDeProyecto2);

		gerente1.agregarEmpleado(mandosMedios1);
		gerente2.agregarEmpleado(mandosMedios2);

		director.agregarEmpleado(gerente1);
		director.agregarEmpleado(gerente2);

		assertEquals(2700.00, director.montoSalario());
	}

	@Test
	void test1() {

		EmpleadoRegular empleadoRegular = new EmpleadoRegular(100);

		LiderDeProyecto liderDeProyecto = new LiderDeProyecto(200);

		MandoMedio mandosMedios = new MandoMedio(300);

		Gerente gerente = new Gerente(500);

		Director director = new Director(400);

		liderDeProyecto.agregarEmpleado(empleadoRegular);
		mandosMedios.agregarEmpleado(liderDeProyecto);
		gerente.agregarEmpleado(mandosMedios);
		director.agregarEmpleado(gerente);

		assertEquals(1500.00, director.montoSalario());
	}

}
