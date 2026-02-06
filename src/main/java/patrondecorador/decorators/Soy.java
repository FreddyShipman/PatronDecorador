package patrondecorador.decorators;

import patrondecorador.Beverage;

/**
 * Lo que hace es envolver un objeto de tipo Beverage para añadirle el sabor a soya. 
 * Al extender de BeverageDecorator, puedo usar super() para obtener la información 
 * del café que está "adentro" y simplemente sumarle lo mío, que seria 
 * la descripción "+Soya" y los $2.00 pesos adicionales que cuesta este condimento.
 */
public class Soy extends BeverageDecorator {
    public Soy(Beverage source) {
        // Le pasamos el objeto a envolver al constructor del padre
        super(source);
    }

    @Override
    public String getDescription() {
        // Tomamos lo que ya traía el pedido y le pegamos el nuevo ingrediente
        return super.getDescription() + " + Soya";
    }

    @Override
    public double getCost() {
        // Sumamos el costo de la soya al acumulado que traiga la cadena de objetos
        return super.getCost() + 2.00;
    }
}