package dev.java.ecommerce.basketservice.controllers;

import dev.java.ecommerce.basketservice.client.response.PlatziProductResponse;
import dev.java.ecommerce.basketservice.service.ProductsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductsService productsService;

    @GetMapping()
    public ResponseEntity<List<PlatziProductResponse>> getAllProducts(){

        return ResponseEntity.ok(productsService.getAllProducts());
    }

    @GetMapping("/{id}")
    public ResponseEntity<PlatziProductResponse> getProductsById(@PathVariable Long id){
        return ResponseEntity.ok(productsService.getProductById(id));
    }
}
