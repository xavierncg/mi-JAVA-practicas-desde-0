package ProyectoFinal;

import java.util.Scanner;

public class BankApp {

    private BankAccount bankAccount;
    private Scanner scanner = new Scanner(System.in);

    public BankApp(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public void iniciarMenu() {
        int opcion;
        do {
            System.out.println("==Iniciando Menu Banco==");
            System.out.println("1. Depositar Dinero ");
            System.out.println("2. Retirar Dinero ");
            System.out.println("3. Mostrar Saldo  ");
            System.out.println("4. Salir ");


            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    bankAccount.depositarDinero(scanner.nextDouble());
                    break;
                case 2:
                    bankAccount.retirarDinero(scanner.nextDouble());
                    break;
                case 3:
                    bankAccount.monstrarInfo();
                    break;
                case 4:
                    System.out.println("Operacion Finalizada");
                    break;
            }

            System.out.println("");

        } while (opcion != 4);
    scanner.close();
    }
}
