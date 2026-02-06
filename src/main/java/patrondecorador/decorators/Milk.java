package patrondecorador.decorators;

import patrondecorador.Beverage;

/**
 * Este es el decorador para la leche normal, que era uno de los condimentos solicitados.
 * Hereda de 'BeverageDecorator' para poder autorizar el trabajo al objeto 
 * interno y solo sumarle los $3.00 del costo de la leche.
 */
public class Milk extends BeverageDecorator {
    public Milk(Beverage source) {
        // Le pasamos el objeto a envolver al constructor padre
        super(source);
    }

    @Override
    public String getDescription() {
        // Concatenamos "+Leche" a lo que ya traía la bebida
        return super.getDescription() + " + Leche";
    }

    @Override
    public double getCost() {
        // Sumamos el costo extra de la leche al acumulado
        return super.getCost() + 3.00;
    }
}