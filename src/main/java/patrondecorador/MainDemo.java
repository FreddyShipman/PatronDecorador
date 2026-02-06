package patrondecorador;

import patrondecorador.decorators.Chocolate;
import patrondecorador.decorators.Milk;

/**
 * Esta es la clase de prueba donde se simula un pedido real.
 * Ya no creamos objetos simples, sino que envolvemos un objeto dentro de otro.
 * Al final, 'pedidoEspecial' se comporta como una sola bebida, pero por dentro 
 * trae toda la cadena de costos y descripciones.
 */
public class MainDemo {
    public static void main(String[] args) {
        // Aquí resolvemos el problema de la explosión de clases:
        // En lugar de crear una clase "DarkRoastConLecheYDosChocolates", 
        // simplemente armamos el objeto.
        Beverage pedidoEspecial = new Chocolate(
                                    new Chocolate(
                                        new Milk(
                                            new DarkRoast()
                                        )
                                    )
                                );

        // Estos métodos van a disparar una reacción en cadena.
        System.out.println("Tu pedido: " + pedidoEspecial.getDescription());
        System.out.println("Total: $" + pedidoEspecial.getCost());
    }
}