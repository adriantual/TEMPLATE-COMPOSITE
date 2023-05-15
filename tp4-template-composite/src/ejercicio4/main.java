package ejercicio4;

import java.time.LocalDate;

public class main {

	public static void main(String[] args) {

		Calculador calculador1 = new CalculadorNoJubilado(LocalDate.now().getMonth().getValue());
		Calculador calculador2 = new CalculadorNoJubilado(LocalDate.now().getMonth().getValue() - 1);
		Calculador calculador3 = new CalculadorJubilado(LocalDate.now().getMonth().getValue());
		Calculador calculador4 = new CalculadorJubilado(LocalDate.now().getMonth().getValue() - 1);

		double resultado1 = calculador1.calcularPrecio(100);
		double resultado2 = calculador2.calcularPrecio(100);
		double resultado3 = calculador3.calcularPrecio(100);
		double resultado4 = calculador4.calcularPrecio(100);

		System.out.println(" " + resultado3);
		System.out.println(" " + resultado4);
		System.out.println(" " + resultado1);
		System.out.println(" " + resultado2);

	}

}
