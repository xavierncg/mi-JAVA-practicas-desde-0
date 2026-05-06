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


}
