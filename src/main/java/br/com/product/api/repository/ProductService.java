package br.com.product.api.repository;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import br.com.product.api.dto.ProductDto;
import br.com.product.api.model.ProductModel;
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
}
