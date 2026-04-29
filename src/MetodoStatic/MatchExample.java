package MetodoStatic;

public class MatchExample {

    public static int add(int number1, int number2){
        return number1 + number2;                               //Nos permite acceder directamente de la clase.
    }                                                          //Se comparte por todas las instancias.


    public static int subtract(int number1, int number2){
        return number1 - number2;                               //Solo accedemos a su metodo mediante
	                                                            //Creacion de una instancia y pertenece a la instancia.
    }
}
