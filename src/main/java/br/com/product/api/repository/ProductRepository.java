package br.com.product.api.repository;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.product.api.model.ProductModel;

@Repository
public interface ProductRepository extends JpaRepository<ProductModel, BigInteger> {
    
}
