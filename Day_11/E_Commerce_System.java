import java.lang.Math;

class Product{
    String name;
    int stock;
    double price;

    Product(String n,int s, double p)
    {
        this.name=n;
        this.stock=s;
        this.price=p;
    }

}
class Users{
    String name;
    String Address;

    Users(String name,String Add)
    {
        this.name=name;
        this.Address=Add;
    }

}

class Order{
    Product product;
    String orderid;
    int quantity;
    Order(Product product,String orderid,int quant)
    {
        this.product=product;
        this.orderid=orderid;
        this.quantity=quant;
    }

}

class OutOfStockException extends Exception{
    public OutOfStockException(String msg)
    {
        super(msg);
    }

}
class PaymentFailedException extends Exception{
    public PaymentFailedException(String msg){
        super(msg);

    }
}
class OrderFailedException extends Exception{
    public OrderFailedException(String msg)
    {
        super(msg);
    }
}

class OrderService{
    void PlaceOrder(Order O) throws OutOfStockException,PaymentFailedException,OrderFailedException
    {
        if(O.product.stock<=0)
        {
            throw new OutOfStockException("Prduct is out of stock");
        }
        if(Math.random()<0.4)
        {
            throw new PaymentFailedException("Payment Failed");
        }
        if(Math.random()<0.2)
        {
            throw new OrderFailedException("Order Processing Failed");
        }

        System.out.println("Order placed successfully");
    }


}


public class E_Commerce_System {
    public static void main(String[] args)
    {
        Product p=new Product("lap",10,10000);
        System.out.println(p.stock);
        Users U=new Users("Dhana","Chennai");
        System.out.println(U.name);

        Order O=new Order(p,"AB123",11);
        OrderService service=new OrderService();
        try {
            service.PlaceOrder(O);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
