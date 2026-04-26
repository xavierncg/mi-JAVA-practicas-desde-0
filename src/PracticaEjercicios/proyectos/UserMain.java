package PracticaEjercicios.proyectos;

import java.util.Scanner;

public class UserMain {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		User usuer1 = new User("   xavielito  ".trim().toLowerCase(), "123456a//", "user@gmail.com");


		usuer1.mostrarInformacion();

		usuer1.setNameUser("Adrian");
		usuer1.setPasswordHash("123456a");
		usuer1.setEmail("Adrian@gmail.com");
		System.out.println("============================");

		usuer1.mostrarInformacion();

		System.out.println("========================================");

		System.out.println("Por favor ingrese nombre de Usuario: ");
		usuer1.setNameUser(sc.nextLine());

		System.out.println("");

		System.out.println("Por favor ingrese password de Usuario: ");
		usuer1.setPasswordHash(sc.nextLine());

		System.out.println("");
		System.out.println("Por favor ingrese email de Usuario: ");
	}
}
