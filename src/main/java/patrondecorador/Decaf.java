package patrondecorador;

/**
 * Esta clase representa el café descafeinado del menú. 
 * Al igual que el Dark Roast, es un componente porque es 
 * uno de los productos base que podemos vender solo o decorar 
 * después.
 */
public class Decaf implements Beverage {
    
    @Override
    public String getDescription() {
        return "Decaf";
    }

    @Override
    public double getCost() {
        // Precio base para el descafeinado
        return 30.00;
    }
}