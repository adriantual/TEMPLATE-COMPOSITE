package ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class MandoMedio extends Empleado {
	private List<Empleado> empleadosACargo;

	public MandoMedio(double salario) {
		super(salario);
		this.empleadosACargo = new ArrayList<Empleado>();
	}

	public void agregarEmpleado(Empleado unEmpleado) {
		this.empleadosACargo.add(unEmpleado);
	}

	@Override
	public double montoSalario() {
		double total = this.salario;
		for (Empleado unEmpleado : empleadosACargo) {
			total = total + unEmpleado.montoSalario();

		}
		return total;
	}

}
