package AtributoStatic;

public class CarModel {
    private String modeloAuto;
    private static String marcaAuto = "Mercedez Benz";


    public CarModel(String modeloAuto) {
        this.modeloAuto = modeloAuto;

    }

    public String getModeloAuto() {
        return modeloAuto;
    }

    public void setModeloAuto(String modeloAuto) {
        this.modeloAuto = modeloAuto;
    }

    public String getMarcaAuto(){
        return CarModel.marcaAuto;
    }

    public void setMarcaAuto(String marcaAuto){
        CarModel.marcaAuto = marcaAuto;
    }

    public void monstrarInformacion(){
        System.out.println("Modelo Auto: " + modeloAuto + " Marca de Auto: " + marcaAuto);
    }
}