package ejercicio2;

public class Spike extends Item {

	public Spike(String nombre, int tiempo) {
		super(nombre, tiempo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int tiempoRequerido() {

		return this.tiempo;
	}

}
