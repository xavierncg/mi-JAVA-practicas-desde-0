package HouseExample;

public class HouseMain {
	public static void main(String[] args) {
		House miCasa = new House();
		miCasa.setPuertas(2);
		miCasa.setVentanas(4);
		miCasa.setTamano(10);

		House myHouse = new House(4, 6,20);

		System.out.println("La cantidad de puertas de mi casa es: " + myHouse.getPuertas());
		miCasa.abrirPuerta();
		double terreno = miCasa.calcularArea();

		System.out.println("El tamano de mi casa es: " + terreno);
	}

}

