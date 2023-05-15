package ejercicio2;

public abstract class Item {
	protected String nombre;
	protected int tiempo;

	public Item(String nombre, int tiempo) {
		super();
		this.nombre = nombre;
		this.tiempo = tiempo;
	}

	public abstract int tiempoRequerido();
}
