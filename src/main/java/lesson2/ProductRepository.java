package lesson2;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class ProductRepository {
    private List<Product> products;

  public List<Product> getProductsList(){
      return Collections.unmodifiableList(products);
  }

  public Product getProduct(int id){
      for (Product p: products) {
          if (p.getId() == id) {
              return p;
          }
          }
      System.out.println("Incorrect ID");
      return null;
      }



  @PostConstruct
    public void init(){
      products = new ArrayList<Product>();
      products.add(new Product(1,"Bread", 20.8));
      products.add(new Product(2,"Oil", 100.5));
      products.add(new Product(3,"Chicken", 320.2));
      products.add(new Product(4,"Milk", 70.3));
      products.add(new Product(5,"Bananas", 103.4));
  }

}
