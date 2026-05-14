package RelacionesEntreClases;

public class House {
    private Room room;//composicion
    private Door door;//composicion
    private Owner owner;//asociacion

    public House (Room room, Door door, Owner owner){
        this.room = room;
        this.door = door;
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "House{" +
                "room=" + room +
                ", door=" + door +
                ", owner=" + owner +
                '}';
    }
}


/**
 * Aca realizamos una abstraccion para pensar en los atributos que hemos realizado
 utilizando clases como atributos de otra clase para relacionarlas

 *Analicemos la relacion entre atributos para ver si la relacione es fuerte o debil

 - Composicion: Si la clase padre se destruye la clase hija deja de existir.
                            (Relacion Fuerte)

 - Asocioacion: Si la Clase padre se destruye la clase Hija puede seguir existiendo sin
                priblema como dueno de otra Casa sin problemas.

                            (Relacion Debil)

 */