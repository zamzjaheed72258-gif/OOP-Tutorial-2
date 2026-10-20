package uk.ac.westminster.productsapi;

public class Customer {
    // பிரைவேட் மாறிகள்
    private Long id;
    private String name;
    private String email;
    private Address address; // நாம் உருவாக்கிய Address கிளாஸ் டைப்!

    // வெற்று கன்ஸ்ட்ரக்டர்
    public Customer() {}

    // முழு கன்ஸ்ட்ரக்டர்
    public Customer(Long id, String name, String email, Address address) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
    }

    // கெட்டர்கள் (Getters)
    public Long getId() {
        return id; }
    public String getName() {
        return name; }
    public String getEmail() {
        return email; }
    public Address getAddress() {
        return address; }
}
