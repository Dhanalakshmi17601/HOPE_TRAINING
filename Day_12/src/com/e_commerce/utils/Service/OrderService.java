package src.com.e_commerce.utils.Service;

import src.com.e_commerce.utils.model.Order;

public class OrderService {
    public void placeOrder(Order order)
    {
        System.out.println("User Name:"+order.user.Name);
        System.out.println("Product Name:"+order.product.Name);
        System.out.println("Ordr Quantity:"+order.Quantity);
        double totalPrice=order.product.Price*order.Quantity;
        System.out.println("Total Price:"+totalPrice);
    }

    
}
