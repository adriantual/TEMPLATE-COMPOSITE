package ejercicio2;

public class Main {

	public static void main(String[] args) {
		Spike spike = new Spike("analisis", 15);
		Tarea tarea = new Tarea("tarea", 10);
		HistoriaDeUsuario miHistoria = new HistoriaDeUsuario("historia de usuario");

		miHistoria.agregarItem(tarea);
		miHistoria.agregarItem(spike);

		System.out.println("El tiempo necesario es: " + miHistoria.tiempoRequerido() + " "+ "minutos");

	}

}
