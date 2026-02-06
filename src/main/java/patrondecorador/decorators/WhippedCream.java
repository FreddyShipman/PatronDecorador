package patrondecorador.decorators;

import patrondecorador.Beverage;

/**
 * Esta clase es el decorador para la Crema Batida,
 * uno de los extras que el cliente puede pedir.
 * Si el cliente pide "doble crema", no necesito crear una clase nueva, 
 * solo envuelvo el objeto dos veces y listo.
 */
public class WhippedCream extends BeverageDecorator {
    public WhippedCream(Beverage source) {
        // Le pasamos la bebida al constructor del padre para que la guarde
        super(source);
    }

    @Override
    public String getDescription() {
        // Tomamos la descripción acumulada y le concatenamos el nuevo ingrediente
        return super.getDescription() + " + Crema Batida";
    }

    @Override
    public double getCost() {
        // Sumamos los $4.00 de la crema al costo que ya traía
        return super.getCost() + 4.00;
    }
}