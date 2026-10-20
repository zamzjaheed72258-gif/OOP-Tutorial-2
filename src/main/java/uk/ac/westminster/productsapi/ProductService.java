package uk.ac.westminster.productsapi;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service // ஸ்பிரிங் பூட் இந்த கிளாஸை ஒரு 'Service Component' ஆக மாற்றுகிறது
public class ProductService {

    // பல ப்ராடக்ட்டுகளைச் சேமிக்கும் டைனமிக் லிஸ்ட் (ArrayList)
    private List<Product> products = new ArrayList<>();
    private Long nextId = 1L; // தானாக ID உருவாக்குவதற்கான மாறி

    // 1. அனைத்து ப்ராடக்ட்டுகளையும் எடுக்க
    public List<Product> getAllProducts() {
        return products;
    }

    // 2. ID மூலம் ஒரு குறிப்பிட்ட ப்ராடக்ட்டைத் தேட
    public Optional<Product> getProductById(Long id) {
        return products.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst();
    }

    // 3. புதிய ப்ராடக்ட்டைச் சேர்க்க (ID-யை நாமே உருவாக்கித் தருவோம்)
    public Product addProduct(Product p) {
        p.setId(nextId++);
        products.add(p);
        return p;
    }

    // 4. ப்ராடக்ட்டை நீக்க (DELETE)
    public void deleteProduct(Long id) {
        products.removeIf(p -> p.getId().equals(id));
    }

    // 5. பெயர் மூலம் ப்ராடக்ட்டைத் தேட (Stream Filter டாஸ்க்)
    public List<Product> findByName(String name) {
        return products.stream()
                .filter(p -> p.getName().toLowerCase().contains(name.toLowerCase()))
                .toList();
    }
}
