package lesson2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("lesson2")
public class AppConfig {
    @Autowired

    @Bean
    public ProductRepository productRepository(){
        return new ProductRepository();
    }

    @Bean
    public Cart cart(){
        return new Cart(productRepository());
    }

}
