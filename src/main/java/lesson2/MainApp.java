package lesson2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        ProductRepository productRepository = context.getBean("productRepository", ProductRepository.class);

        Cart cart = context.getBean("cart", Cart.class);


        System.out.println("Для начала введите /start");
        Scanner sc = new Scanner(System.in);
        String cmd = sc.nextLine();
        System.out.println(cmd);
       if(cmd.equals("/start")) {
           System.out.println("Введите команду на добавление или удаление, например, /add 2 или /remove 1.");
           while (!(cmd.equals("q"))) {
               String[] cmdAddRemove = sc.nextLine().split(" ");
               if (cmdAddRemove[0].equals("/add")) {
                   cart.addProduct(Integer.parseInt(cmdAddRemove[1]));
                   System.out.println(cart.getCartList());
               }
               if (cmdAddRemove[0].equals("/remove")) {
                   cart.removeProduct(Integer.parseInt(cmdAddRemove[1]));
                   System.out.println(cart.getCartList());
               }
               System.out.println(" Для выхода введите q, для продолжения нажмите enter");
               cmd = sc.nextLine();
           }
       }
        context.close();

    }
}
