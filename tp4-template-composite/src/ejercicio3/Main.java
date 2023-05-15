package ejercicio3;

public class Main {

	public static void main(String[] args) {

		SeguroAutomovil seguroAutomovil = new SeguroAutomovil(10);
		SeguroHogar seguroHogar = new SeguroHogar(10);
		SeguroMedico seguroMedico = new SeguroMedico(10);
		SeguroVida seguroVida = new SeguroVida(10);
		PaqueteSeguros paquete1 = new PaqueteSeguros();

		paquete1.agregarSeguro(seguroVida);
		paquete1.agregarSeguro(seguroMedico);
		paquete1.agregarSeguro(seguroAutomovil);
		paquete1.agregarSeguro(seguroHogar);

		PaqueteSeguros paquete2 = new PaqueteSeguros();

		paquete2.agregarSeguro(seguroVida);
		paquete2.agregarSeguro(paquete1);

		System.out.println("El total del paquete es: " + paquete2.montoTotal());
	}

}
