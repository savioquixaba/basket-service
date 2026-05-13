package dev.java.ecommerce.basketservice.service;

import dev.java.ecommerce.basketservice.client.PlatziStoreClient;
import dev.java.ecommerce.basketservice.client.response.PlatziProductResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ProductsService {

    private final PlatziStoreClient platziStoreClient;

    @Cacheable(value = "product", key = "#id")
    public PlatziProductResponse getProductById(Long id){
        return platziStoreClient.getProductById(id);
    }

    @Cacheable(value = "products")
    public List<PlatziProductResponse> getAllProducts(){
        return platziStoreClient.getAllProducts();
    }

}
