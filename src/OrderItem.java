public class OrderItem {

    private String pizzaType;
    private String size;
    private int quantity;
    private double price;

    public OrderItem() {
    }

    public OrderItem(String pizzaType, String size, int quantity, double price) {
        this.pizzaType = pizzaType;
        this.size = size;
        this.quantity = quantity;
        this.price = price;
    }

    public String getPizzaType() {
        return pizzaType;
    }

    public void setPizzaType(String pizzaType) {
        this.pizzaType = pizzaType;
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