package CarExample;
 //Creamos la clase
public class Car {
    private int neumaticos;
    private int windows;
    private double motors;
    private int velocidad;
    String color;


    public Car(int neumatics, int windows, double motors, String color) {
        this.neumaticos = neumaticos;
        this.windows = windows;
        this.motors = motors;
        this.color = color;
    }

    public int getNeumaticos(){
        return neumaticos;
    }

    public void setNeumaticos(int neumaticos){
        this.neumaticos = this.neumaticos;
    }

    public int getWindows(){
        return windows;
    }

    public void setWindows(int windows){
        this.windows = windows;
    }

    public double getMotors(){
        return motors;
    }

    public void setMotors(double motors){
        this.motors = motors;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String  color){
        this.color = color;
    }

    //🔹 Metodo (comportamiento)
     void acelerar() {
         velocidad += 10;
         System.out.println("El auto está acelerando. Velocidad actual: " + velocidad);
     }

     void frenar() {
         velocidad -= 5;
         System.out.println("El auto está frenando. Velocidad actual: " + velocidad);
     }

}
