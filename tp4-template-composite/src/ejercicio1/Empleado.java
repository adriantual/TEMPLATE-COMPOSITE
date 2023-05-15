package ejercicio1;

public abstract class Empleado {
	protected double salario;

	public Empleado(double salario) {
		super();
		this.salario = salario;
	}

	public abstract double montoSalario();

}
