package patrondecorador;

/**
 * Esta es la última de las bebidas base de la primera fase. 
 * Su costo base es de $36.00.
 */
public class Espresso implements Beverage {
    @Override
    public String getDescription() {
        // Regresa el nombre tal cual aparece en el menú de Starbuzz 
        return "Expresso";
    }

    @Override
    public double getCost() {
        // Costo base definido
        return 36.00;
    }
}