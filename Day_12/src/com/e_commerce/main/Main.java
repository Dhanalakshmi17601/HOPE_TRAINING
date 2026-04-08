package src.com.e_commerce.main;

import src.com.e_commerce.utils.Service.OrderService;
import src.com.e_commerce.utils.model.*;
import src.com.e_commerce.utils.model.Product;
import src.com.e_commerce.utils.model.User;


public class Main {
    public static void main(String[] args) {
        Product p=new Product("laptop",20000);
        User u=new User("dhana","chennai");
        Order o=new Order(u,p,3);
        OrderService service=new OrderService();
        service.placeOrder(o);

    }

}
