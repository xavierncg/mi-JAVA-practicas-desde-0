package ClassWrapper;

public class ClassWrapper {
    public static void main(String [] Args){

    //Por cada tipo de dato primitivo, vamos a tener su ClassWrapper equivalente.
    //Ejemplo:

        byte edad = 18;  //8bits
        Byte edad2 = 18;

        short numerosMedianos = 150; //16bits
        Short numerosMedianos2 = 150;

        int number = 10;  //32bits
        Integer number2 = 10;

        long numerosGrandes = 8000000000L;  //64 bits
        Long numerosGrandes2 = 8000000000L;

        float decimalesCortos = 10.0f;  //32bits
        Float decimalesCortos2 = 10.0f;

        double decimalesLargos = 30.0;  //64bits
        Double decimalesLargos2 = 30.0;

        char caracter = 'A'; //16bits
        Character caracter2 = 'A';

        boolean activo = true; //1bits
        boolean activo2 = false;
        Boolean activo3 = true;
        Boolean activo4 = true;



        //===============================================================//
        Integer num = 10;
        Integer num2 = 11;

        System.out.println(num.toString());

        //Metodo .equals -> Compara si los numeros son iguales
        System.out.println(num.equals(num2));

        //Metodo .compareTo -> l metodo compareTo() de Integer compara dos valores numéricos y devuelve:
        System.out.println(num.compareTo(num2));

        // 0 Son iguales
        //< 0 -> El primero es menor
        // > 0 -> El primero es mayor

        //===============================================================//
    }
}
