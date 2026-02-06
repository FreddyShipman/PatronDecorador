package patrondecorador.decorators;

import patrondecorador.Beverage;

/**
 * Esta clase es el Decorador Base y es la que hace que esto funcione. 
 * Lo más importante aquí es la variable 'wrappee', que es donde se guarda el café 
 * (o el decorador anterior) que se esta envolviendo. 
 * Implementa 'Beverage' para que el resto del sistema siga pensando que es una bebida común, 
 * pero su único trabajo es delegar cuando le preguntan el costo o la descripción, 
 * simplemente lo pasa al objeto que tiene adentro.
 */
public class BeverageDecorator implements Beverage {
    private Beverage wrappee; // El objeto que estamos decorando o envolviendo

    public BeverageDecorator(Beverage beverage) {
        // Guardamos la referencia para poder autorizar el trabajo después
        this.wrappee = beverage;
    }

    @Override
    public String getDescription() {
        // Le pregunta al objeto interno su descripción
        return wrappee.getDescription();
    }

    @Override
    public double getCost() {
        // Le pregunta al objeto interno su costo
        return wrappee.getCost();
    }
}