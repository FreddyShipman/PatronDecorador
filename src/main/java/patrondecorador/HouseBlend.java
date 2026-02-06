package patrondecorador;

/** 
 * El House Blend es un componente, lo que significa que es una 
 * pieza sobre la cual vamos a ir poniendo los ingredientes extra. 
 * El precio base es de $38.00.
 */
public class HouseBlend implements Beverage {
    @Override
    public String getDescription() {
        return "House Blend";
    }

    @Override
    public double getCost() {
        // Costo base
        return 38.00;
    }
}