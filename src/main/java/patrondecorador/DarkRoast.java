package patrondecorador;

/**
 * Esta es una de las bebidas básicas del menú (un componente).
 * La hice siguiendo el primer alcance. Es un café solo,
 * sin nada extra todavía, por eso el costo es el precio base de $45.00.
 */
public class DarkRoast implements Beverage {
    
    @Override
    public String getDescription() {
        return "Dark Roast";
    }

    @Override
    public double getCost() {
        // El precio base según el menú
        return 45.00;
    }
}