package src.com.e_commerce.utils.model;

public class Order {
    public User user;
    public Product product;
    public int Quantity;
    public Order(User u,Product p,int q)
    {
        this.user=u;
        this.product=p;
        this.Quantity=q;
    }
    
}
