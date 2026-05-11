package dev.java.ecommerce.basketservice.service;

import dev.java.ecommerce.basketservice.client.PlatziStoreClient;
import dev.java.ecommerce.basketservice.client.response.PlatziProductResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ProductsService {

    private final PlatziStoreClient platziStoreClient;

    public PlatziProductResponse getProductById(Long id){
        return platziStoreClient.getProductById(id);
    }

    public List<PlatziProductResponse> getAllProducts(){
        return platziStoreClient.getAllProducts();
    }

}
