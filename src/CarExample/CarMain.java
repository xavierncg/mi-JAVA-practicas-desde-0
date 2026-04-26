package CarExample;

public class CarMain {
    public static void main(String[] args) {
        Car camaro = new Car(5,5,2.8,"Amarillo");

        camaro.setColor("Red");

        System.out.println("Mi Auto Camaro de Color: " + camaro.getColor());

        camaro.acelerar();

    }


}
