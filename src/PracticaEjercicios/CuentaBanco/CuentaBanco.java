package PracticaEjercicios.CuentaBanco;

public class CuentaBanco {
    private int numeroCuenta;
    private String titular;
    private double saldoDisponible;

    public CuentaBanco(int numeroCuenta, String titular, double saldoDisponible){
        this.numeroCuenta = numeroCuenta;
        this. titular = titular;
        this.saldoDisponible = saldoDisponible;

    }

    public int getNumeroCuenta(){
        return numeroCuenta;
    }

    public String getTitular(){
        return titular;
    }

    public double getSaldoDisponible(){
        return saldoDisponible;
    }

    public void setNumeroCuenta(int numeroCuenta){
        this.numeroCuenta = numeroCuenta;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

    public void setSaldoDisponible(double saldoDisponible){
        this.saldoDisponible = saldoDisponible;
    }

    public void monstrarInformacion(){
        System.out.println("Titular: " + titular);
        System.out.println("Numero de cuenta: " + numeroCuenta);
        System.out.println("Saldo disponible: " + saldoDisponible);
    }

    public void depositarDinero(double dinero){
        if(dinero < 0){
            System.out.println("No se pueden realizar depositos negativos");
            return;
        }
        setSaldoDisponible(saldoDisponible + dinero);
        System.out.println("Saldo depositado: " + saldoDisponible);
    }

    public void retirarDinero(double retirarDinero){
        if( retirarDinero > saldoDisponible){
            System.out.println("Saldo Insuficiente");
            return;
        }
        setSaldoDisponible(saldoDisponible - retirarDinero);
        System.out.println("Saldo retirado: " + retirarDinero);
    }


}
