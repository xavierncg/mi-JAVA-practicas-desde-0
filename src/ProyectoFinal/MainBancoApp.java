package ProyectoFinal;

public class MainBancoApp {
    public static void main(String[] args) {

        BankAccount cuentaBancaria = new BankAccount("Ana",700.000);
        BankApp menu = new BankApp(cuentaBancaria);
        menu.iniciarMenu();
    }
}
