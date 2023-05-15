package ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class LiderDeProyecto extends Empleado {

	private List<Empleado> empleadosACargo;

	public LiderDeProyecto(double salario) {
		super(salario);
		this.empleadosACargo = new ArrayList<Empleado>();
	}

	@Override
	public double montoSalario() {
		double total = this.salario;
		for (Empleado unEmpleado : empleadosACargo) {
			total = total + unEmpleado.montoSalario();

		}
		return total;
	}

	public void agregarEmpleado(Empleado unEmpleado) {
		this.empleadosACargo.add(unEmpleado);
	}

}
