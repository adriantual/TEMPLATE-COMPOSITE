package ejercicio5;

public class main {

	public static void main(String[] args) {
		Remeras unaRemera = new Importada(100);

		System.out.println(" " + unaRemera.precioVenta());

		Remeras unaRemera1 = new Nacional(100);

		System.out.println(" " + unaRemera1.precioVenta());
	}

}
