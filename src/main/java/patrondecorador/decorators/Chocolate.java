package patrondecorador.decorators;

import patrondecorador.Beverage;

/**
 * Lo que hice fue heredar de 'BeverageDecorator' 
 * para aprovechar la estructura que ya se tenia. 
 * Su función es envolver la bebida que reciba y añadirle el comportamiento 
 * de chocolate: le pega "+Chocolate" a la descripción y le suma $5.00 al costo total. 
 */
public class Chocolate extends BeverageDecorator {
    public Chocolate(Beverage source) {
        // Le pasamos la bebida al constructor del padre para que la guarde
        super(source);
    }

    @Override
    public String getDescription() {
        // Tomamos la descripción acumulada y le concatenamos el nuevo ingrediente
        return super.getDescription() + " + Chocolate";
    }

    @Override
    public double getCost() {
        // Tomamos el costo acumulado y le sumamos el precio del chocolate
        return super.getCost() + 5.00;
    }
}