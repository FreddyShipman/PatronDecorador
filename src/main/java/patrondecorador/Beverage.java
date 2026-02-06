package patrondecorador;

/**
 * Esta es la base de todo el sistema. La definí como una interfaz 
 * porque es como el contrato básico. 
 * Cualquier cosa que queramos vender en Starbuzz, ya sea un café solo 
 * o un café con mil condimentos, tiene que ser capaz de decirnos 
 * qué es y cuánto cuesta.
 */
public interface Beverage {
    String getDescription();
    double getCost();
}