package AtributoStatic;

public class MainCarModel {
    public static void main(String[] args) {

        CarModel auto1 = new CarModel("A10");


        System.out.println("Modelo Auto: " + auto1.getModeloAuto()
                .toUpperCase().replace('A','O'));

        auto1.setMarcaAuto("Ferrari");

        System.out.println("Modelo Auto1: " + auto1.getModeloAuto());

        auto1.monstrarInformacion();

        System.out.println("Modelo Auto: " + auto1.getMarcaAuto());
    }


}
