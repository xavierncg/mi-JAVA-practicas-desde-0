package RelacionesEntreClases;

public class Calculator {
    public int add(int number1, int number2 ) {
        return number1 + number2;
    }
    public int sub(int number1, int number2){
        return number1 - number2;
    }
    public int multi(int number1, int number2){
        return number1 * number2;
    }
    public int div(int number1, int number2){
        return number1 / number2;
    }
}

/**
 *Aca estaremos trabajando Relacion de Clases
 *
 * Concepto:               =====Dependencia======
 *
 * Se crea como Clase que realizara algo para ser rutilizada.
 * y ser llamada desde otra parte del codigo para resolver algo
 */
