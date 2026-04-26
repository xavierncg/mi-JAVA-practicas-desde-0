package HouseExample;

public class House {
    // 1-Atributos o Caracteristicas van de primero en la clase

    private int puertas;
    private int ventanas;
    private double tamano;

    public House(){

    }

    // 2-Creamos el methodo constructor para inicializar la clase.
    public House(int puertas, int ventanas, double tamano) {
        this.puertas = puertas;
        this.ventanas = ventanas;
        this.tamano = tamano;
    }


     // 3-En este espacio deberia ir el metodo getter y setter

    public int getPuertas(){
        return puertas;
    }

    public void setPuertas(int puertas){
        this.puertas = puertas;
    }

    public int getVentanas(){
        return ventanas;
    }

    public void setVentanas(int ventanas){
        this.ventanas = ventanas;
    }

    public double getTamano(){
        return tamano;
    }

    public void setTamano(double tamano){
        this.tamano = tamano;
    }


	/** Aca se implementa los methodos o Funcion o comportamiento e la clase.
	 * Nomrmalmente los metodos son publicos
	 */

	public void abrirPuerta() {
        System.out.println("La puerta esta abierta");

    }

    public double calcularArea() {
        return tamano * tamano;
    }
}
