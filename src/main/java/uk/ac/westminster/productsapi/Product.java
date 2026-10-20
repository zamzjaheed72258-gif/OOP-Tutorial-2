package uk.ac.westminster.productsapi;

public class Product {

    private Long id;
    private String name;
    private double price;


    public Product() {}


    public Product(Long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // கெட்டர்கள் (Getters) - இதைப் பார்த்துதான் ஸ்பிரிங் பூட் JSON உருவாக்கும்
    public Long getId() {
        return id; }
    public String getName() {
        return name; }
    public double getPrice() {
        return price; }
}
