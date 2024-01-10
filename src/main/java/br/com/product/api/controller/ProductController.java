package br.com.product.api.controller;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.product.api.dto.ProductDto;
import br.com.product.api.service.ProductService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api")
public class ProductController {
    
    private ProductService service;

    public ProductController(ProductService service) {
        this.service = service;

    }
    
    @PostMapping("/post")
    public ResponseEntity<ProductDto> save(@RequestBody @Valid ProductDto product) {
        Optional<ProductDto> optional = service.save(product);
        if(optional.isPresent()) {
            return new ResponseEntity<>(optional.get(), HttpStatus.CREATED);

        }
        
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    @GetMapping("/get")
    public ResponseEntity<ProductDto> getAll() {
        return ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }
}
