package ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class HistoriaDeUsuario extends Item {
	private List<Item> itemsTrabajo;

	public HistoriaDeUsuario(String nombre) {
		super(nombre, 0);
		this.itemsTrabajo = new ArrayList<Item>();
	}

	public void agregarItem(Item unItem) {
		this.itemsTrabajo.add(unItem);
	}

	@Override
	public int tiempoRequerido() {
		int total = this.tiempo;
		for (Item unItem : itemsTrabajo) {
			total += unItem.tiempoRequerido();
		}
		return total;
	}

}
