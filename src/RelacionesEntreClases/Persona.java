package RelacionesEntreClases;

public class Persona {
    public void caculareSum(Calculator calculator){
        int result = calculator.add(5,3);
        System.out.println("suma = " + result);

        int result2 = calculator.div(5,5);
        System.out.println("div = " + result);
    }
}

/**
 *Aca estaremos trabajando Relacion de Clases
 *
 * Concepto:               =====Dependencia======
 *
 * Una clase usa otra para hacer algo
 *
 * No la Guarda
 * No pertenece a ella  ===Solo la necesita un momento para realizar algo como funcion===
 */
