public class Pizza {

    private String customerName;
    private String size;
    private String toppings;
    private double price;

    public Pizza() {}

    public Pizza(String customerName, String size, String toppings, double price) {
        this.customerName = customerName;
        this.size = size;
        this.toppings = toppings;
        this.price = price;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getToppings() {
        return toppings;
    }

    public void setToppings(String toppings) {
        this.toppings = toppings;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}