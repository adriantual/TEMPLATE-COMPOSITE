package ejercicio1;

public class Main {

	public static void main(String[] args) {

		EmpleadoRegular empleadoRegular = new EmpleadoRegular(100);
		LiderDeProyecto liderDeProyecto = new LiderDeProyecto(200);
		MandoMedio mandosMedios = new MandoMedio(300);
		Director director = new Director(400);
		Gerente gerente = new Gerente(500);

		director.agregarEmpleado(gerente);
		gerente.agregarEmpleado(mandosMedios);
		mandosMedios.agregarEmpleado(liderDeProyecto);
		liderDeProyecto.agregarEmpleado(empleadoRegular);

		System.out.println("salario total de los empleados: " + director.montoSalario());
	}

}
