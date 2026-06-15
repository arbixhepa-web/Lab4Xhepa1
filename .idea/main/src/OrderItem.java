package main;
public class OrderItem {
    private String pizzaName;
    private String size;
    private int quantity;
    private double price;
    public OrderItem() {
    }
    public OrderItem(
            String pizzaName,
            String size,
            int quantity,
            double price) {
        this.pizzaName = pizzaName;
        this.size = size;
        this.quantity = quantity;
        this.price = price;
    }
    public String getPizzaName() {
        return pizzaName;
    }
    public void setPizzaName(String pizzaName) {
        this.pizzaName = pizzaName;
    }
    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}