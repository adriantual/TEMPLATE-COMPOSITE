package ejercicio2;

public class Tarea extends Item {

	public Tarea(String nombre, int tiempo) {
		super(nombre, tiempo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int tiempoRequerido() {
		// TODO Auto-generated method stub
		return this.tiempo;
	}

}
