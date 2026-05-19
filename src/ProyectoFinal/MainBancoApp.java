package ProyectoFinal;

public class MainBancoApp {
    public static void main(String[] args) {

        BankAccount cuentaBancaria = new BankAccount("Ana",700000.0);
        BankApp menu = new BankApp(cuentaBancaria);
        menu.iniciarMenu();
    }
}
