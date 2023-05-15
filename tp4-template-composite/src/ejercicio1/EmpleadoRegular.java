package ejercicio1;

public class EmpleadoRegular extends Empleado {

	public EmpleadoRegular(double salario) {
		super(salario);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double montoSalario() {

		return salario;
	}

}
