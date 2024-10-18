package com.restapi.apirest.controllers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import com.restapi.apirest.models.Producto;
import com.restapi.apirest.services.ProductoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/products")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping
    public List<Producto> getAllProducts(){
        return productoService.getAllProducts();
    }

    @GetMapping("/{id}")
    public Producto getProductById(@PathVariable Long id){
        return productoService.getProductById(id);
    } 
    
    @PostMapping
    public Producto createProduct(@RequestBody Producto producto){
        return productoService.createProduct(producto);
    }

    @PutMapping("/{id}")
    public Producto updateProduct(@PathVariable Long id, @RequestBody Producto product){
        return productoService.updateProduct(id, product);
    }

    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable Long id){
        productoService.deleteProduct(id);
        return "El producto con ID: " + id + " ha sido eliminado";
    }
}