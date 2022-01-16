package com.example.demo.product;
;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@RequestMapping(path="api/v1/product")
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController (ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> getProducts () {
        return productService.getProducts();
    }

    @PostMapping
    public void addProduct (@RequestBody Product product) {
        productService.addProduct(product);
    }

    @PutMapping
    public void saveProduct (@RequestBody Product product) {
        productService.saveProduct(product);
    }

    @DeleteMapping(path = "{productId}")
    public void deleteProduct(@PathVariable("productId") Long id) {
        productService.deleteProduct(id);
    }

}
