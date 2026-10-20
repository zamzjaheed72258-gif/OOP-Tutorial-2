package uk.ac.westminster.productsapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/products") // அடிப்படை URL: http://localhost:8080/products
public class ProductController {

    @Autowired // Spring Boot தானாகவே ProductService இன்ஸ்டன்ஸை இங்கு இணைக்கும்
    private ProductService service;

    // 1. அனைத்து ப்ராடக்ட்டுகளையும் எடுக்க (GET)
    @GetMapping
    public List<Product> all() {
        return service.getAllProducts();
    }

    // 2. ID மூலம் ஒரு குறிப்பிட்ட ப்ராடக்ட்டை எடுக்க (GET /products/{id})
    @GetMapping("/{id}")
    public Product one(@PathVariable Long id) {
        return service.getProductById(id).orElse(null);
    }

    // 3. புதிய ப்ராடக்ட்டைச் சேர்க்க (POST)
    @PostMapping
    public Product create(@RequestBody Product p) {
        return service.addProduct(p);
    }

    // 4. ப்ராடக்ட்டை நீக்க (DELETE /products/{id})
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.deleteProduct(id);
    }

    // 5. பெயர் மூலம் தேட (GET /products/search?name=Laptop)
    @GetMapping("/search")
    public List<Product> search(@RequestParam String name) {
        return service.findByName(name);
    }
}
