package ClassWrapper;

public class ElContextoDeVariables {
    public static void main(String[] args) {

        int number = 10;
        Integer  number2 = new Integer(10);
        System.out.println(number==number2);            //Esto vive dentro unicamente dentro
        System.out.println(number2.equals(number));     //De este contexto dentro de {}

        if(true){

            number = 15; //Podemos acceder a las variables del contexto superior ya que
            number2 = 15;// Este conectexto esta dentro del contexto superior.
        }

    }

    public void numero(){

        double numero = 4.5;         //Variable local, porque vive solo
        System.out.println(numero); //Aqui dentro de este Scope o Bloque de codigo/

    }
}
