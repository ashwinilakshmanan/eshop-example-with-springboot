package in.upcode.eshop.services;

import model.Product;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
    private List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(1, "Shoes", 10),
            new Product(2, "Books", 100),
            new Product(3, "Electronics", 200)
    ));

    //get all products
    public List<Product> getAllProducts() {
        return products;
    }

    //get products by id
    public Product getProduct(int id) {
        return products.stream().filter(t -> t.getId() == id).findFirst().get();
    }

    //add products
    public void addProduct(Product product){
        products.add(product);
    }

    //update products
    public void updateProduct(int id, Product product){
        for(int i=0;i<products.size();i++){
            Product prod=products.get(i);
            if(prod.getId()==id){
                products.set(i,product);
                return;
            }
        }
    }

    //delete products
    public  void deleteProduct(int id){
        products.removeIf(item->item.getId()==id);
    }



}
