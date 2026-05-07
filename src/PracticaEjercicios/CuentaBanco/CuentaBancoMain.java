package PracticaEjercicios.CuentaBanco;

public class CuentaBancoMain {
    public static void main(String[] args) {

        CuentaBanco cuenta = new CuentaBanco(2244, "yamir Adrian", 00.00);

        cuenta.monstrarInformacion();
        cuenta.depositarDinero(7000.000);
        System.out.println("Su saldo es: " + cuenta.getSaldoDisponible());

        cuenta.retirarDinero(6000.00);

        System.out.println("Su saldo es: " + cuenta.getSaldoDisponible());
    }
}
