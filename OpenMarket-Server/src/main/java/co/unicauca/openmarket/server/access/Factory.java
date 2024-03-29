package co.unicauca.openmarket.client.access;

import co.unicauca.openmarket.commons.infra.Utilities;

/**
 * Fabrica que se encarga de instanciar ProductRepository o cualquier otro que
 * se cree en el futuro.
 *
 * @author Libardo, Julio
 */
public class Factory {

    private static Factory instance;

    private Factory() {
    }

    /**
     * Clase singleton
     *
     * @return
     */
    public static Factory getInstance() {

        if (instance == null) {
            instance = new Factory();
        }
        return instance;

    }

    /**
     * Método que crea una instancia concreta de la jerarquia IProductRepository
     *
     * @param type cadena que indica qué tipo de clase hija debe instanciar
     * @return una clase hija de la abstracción IProductRepository
     */
    public IProductRepository getRepository(String type) {

        IProductRepository result = null;

        switch (type) {
            case "default":
                result = new ProductRepository();
                break;
                
        }

        return result;

    }
    
    public ICategoryRepository getCatRepository() {
        String type=Utilities.loadProperty("category.repository");
         ICategoryRepository result = null;

        switch (type) {
            case "default":
                result = new CategoryRepository();
            break;

    }

        return result;

    }
    public IProductRepository getProdRepository() {
        String type=Utilities.loadProperty("product.repository");
         IProductRepository result = null;

        switch (type) {
            case "default":
                result = new ProductRepository();
            break;

    }

        return result;

    }
}
