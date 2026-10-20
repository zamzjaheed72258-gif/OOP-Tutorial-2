package uk.ac.westminster.productsapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class Address {
    // பிரைவேட் மாறிகள் (Encapsulated fields)
    private String street;
    private String city;
    private String postcode;

    // வெற்று கன்ஸ்ட்ரக்டர்
    public Address() {}

    // முழு கன்ஸ்ட்ரக்டர்
    public Address(String street, String city, String postcode) {
        this.street = street;
        this.city = city;
        this.postcode = postcode;
    }

    // கெட்டர்கள் (Getters)
    public String getStreet() {
        return street; }
    public String getCity() {
        return city; }
    public String getPostcode() {
        return postcode; }

    @SpringBootApplication
    public static class AppInitializer {

        public static void main(String[] args) {
            SpringApplication.run(AppInitializer.class, args);
        }
    }
}
