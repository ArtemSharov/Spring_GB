package lesson2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
@Scope(scopeName = "prototype")
public class Cart{
    private ProductRepository productRepository;
    private List<Product> cart;


    public void addProduct(int id){
        cart.add(productRepository.getProduct(id));
    }

    public void removeProduct(int id){
        for (Product p: cart) {
            if(p.getId() == id){
                cart.remove(p);
                return;
            }
        }
        System.out.println("Incorrect ID");

    }

@Autowired
public Cart(ProductRepository productRepository) {
        this.productRepository = productRepository;
    cart = new ArrayList<Product>();
    }

    public List<Product> getCartList(){
        return cart;
    }
}
