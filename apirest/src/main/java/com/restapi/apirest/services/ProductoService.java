package com.restapi.apirest.services;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.restapi.apirest.Repositories.ProductoRepository;
import com.restapi.apirest.models.Producto;

@Service
public class ProductoService {

     @Autowired
    private ProductoRepository productoRepository;

    public List<Producto> getAllProducts() {
        return productoRepository.findAll();
    }

    public Producto getProductById(Long id) {
        return productoRepository.findById(id)
            .orElseThrow(() -> new IllegalArgumentException("No se encuentra el producto con id: " + id));
    }

    public Producto createProduct(Producto producto) {
        return productoRepository.save(producto);
    }

    public Producto updateProduct(Long id, Producto product) {
        Producto existingProduct = productoRepository.findById(id)
            .orElseThrow(() -> new IllegalArgumentException("No se encuentra el producto con id: " + id));
        
        existingProduct.setName(product.getName());
        existingProduct.setPrice(product.getPrice());

        return productoRepository.save(existingProduct);
    }

    public void deleteProduct(Long id) {
        Producto product = productoRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("No se encontró el producto con el ID: " + id));
        productoRepository.delete(product);
    }
}

    

