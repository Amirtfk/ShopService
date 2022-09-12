import Model.Product;

import java.util.HashMap;
import java.util.Map;

public  class ProductRepo {

    private Map<Integer, Product> products = new HashMap<>();

    public Product getProduct(Integer id){
        return products.get(id);
    }
}