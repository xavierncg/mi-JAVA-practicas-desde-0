package ProyectoFinal;
//  Creamos la Clase.
public class BankAccount {
    private String titularDeLaCuenta;
    private double balance;

//  Creamos el metodo constructor de la Clase.
    public BankAccount(String titularDeLaCuenta, double balance){
        this.titularDeLaCuenta = titularDeLaCuenta;
        this.balance = balance;
    }

//  Creamos los metodos getter y setter.
    public String getTitularDeLaCuenta(){
        return titularDeLaCuenta;
    }
    public double getBalance(){
        return balance;
    }
    public void setTitularDeLaCuenta(String titularDeLaCuenta){
        this.titularDeLaCuenta = titularDeLaCuenta;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }

//  Creamos los Methodos de la clase.
    public void depositarDinero(double depositarMonto){
        if(depositarMonto <= 0){
            System.out.println("No se pueden realizar depósitos menores o igual a 0");
            return;
        }
        balance += depositarMonto;
        System.out.println("Depositado con éxito");
    }

    public void retirarDinero(double retirarMonto){
        if (retirarMonto < balance){
            System.out.println("Saldo Insuficiente");
            return;
        }
        balance -= retirarMonto;
        System.out.println("Retiro Exitoso");
    }

    public void monstrarInfo(){
        System.out.println("Titular de la Cuenta: " + titularDeLaCuenta);
        System.out.println("Saldo Actual: " + getBalance());

    }
}
