package br.com.product.api.service;
import java.util.List;
import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import br.com.product.api.dto.ProductDto;
import br.com.product.api.model.ProductModel;
import br.com.product.api.repository.ProductRepository;
import jakarta.transaction.Transactional;

@Service
public class ProductService {
    
    private ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;

    }
    
    @Transactional
    public Optional<ProductDto> save(ProductDto product) {
        ProductModel model = new ProductModel();
        ModelMapper mapper = new ModelMapper();

        mapper.map(product, model);
        repository.save(model);

        ProductDto response = mapper.map(model, ProductDto.class);
        return Optional.of(response);
    }

    public List<ProductDto> getAll() {
        List<ProductModel> model = repository.findAll();
        List<ProductDto> response = new ArrayList<>();
        ModelMapper mapper = new ModelMapper();

        model.forEach(record -> {
            ProductDto resultMapper = mapper.map(record, ProductDto.class);
            response.add(resultMapper);

        });

        return response;
    }
}


