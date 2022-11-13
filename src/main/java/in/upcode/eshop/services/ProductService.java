package in.upcode.eshop.services;

import model.Product;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
private List<Product> products= new ArrayList<>(Arrays.asList(
        new Product(1, "Shoes", 10),
        new Product(2, "Books", 100),
        new Product(3, "Electronics", 200)
));

public List<Product>getAllProducts(){
    return products;
}

public Product getProduct(int id){
    return products.stream().filter(t->t.getId()==id).findFirst().get();
}

}
