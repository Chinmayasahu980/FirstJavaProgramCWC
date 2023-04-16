package interface4585;

public class flipkart implements shopping{
    @Override
    public void add_item()
    {
        System.out.println("realme x7pro");
    }
    @Override
    public void view_cart()
    {
        System.out.println("1 item carted");
    }
    @Override
    public void place_order()
    {
        System.out.println("payment option");
    }
    @Override
    public void cancel_order()
    {
        System.out.println("cancel ypur last order");
    }

}
