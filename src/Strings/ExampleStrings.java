package Strings;

public class ExampleStrings {

    public static void main(String[] args){
                //Java cuenta con algo llamado pool String
        String name = "Xavier";                 //En este ejemplo comparamos direccion de memoria (name) y (name2) y por pool String toman el mismo valor
        String name2 = "Xavier";               //Ya que al repetir valores (=Xavier) y (=Xavier) lo que hace es dejar uno de esos valores. o apunta al unico valor que existe
                                              //Por lo tanto ambas variables optienen la misma direccion de memoria porque apuntan solamente a un dato. JAVA no repite datos en la memoria.


        System.out.println(name==name2);

        String name3 = new String("Xavier");  //Mas sin embargo al crear un String con un constructor queda fuera de el pool String.
                                                    //Por lo tanto vamos a tner un Gabriel dentro del Pool String y otro fuera que seria el creado mediante un objeto o instanciado.

        System.out.println(name3==name);  //false

	    name3=name.intern();








        System.out.println(name.toUpperCase());

        System.out.println(name);

        Person person = new Person("Xavier","Caraballo");

        System.out.println(person.toString());
    }
}
