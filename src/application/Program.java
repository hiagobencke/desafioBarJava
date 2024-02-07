package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Bill;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Bill bl = new Bill();

		System.out.print("Sexo: ");
		bl.gender = sc.next().charAt(0);
		System.out.print("Quantidade de cervejas: ");
		bl.beer = sc.nextInt();
		System.out.print("Quantidade de refrigerantes: ");
		bl.softDrink = sc.nextInt();
		System.out.print("Quantidade de espetinhos: ");
		bl.barbecue = sc.nextInt();

		System.out.println();
		System.out.println("RELATORIO:");
		System.out.printf("Consumo = R$ %.2f%n", bl.feeding());
		if (bl.cover() > 0) {
			System.out.printf("Couvert = R$ %.2f%n", bl.cover());
		} else
			System.out.println("Isento de Couvert");
		System.out.printf("Ingresso = R$ %.2f%n", bl.ticket());
		System.out.println();
		System.out.printf("Valor a pagar = R$ %.2f%n", bl.total());

		sc.close();
	}

}
