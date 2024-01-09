package br.com.product.api.repository;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.product.api.model.WareHouseModel;

@Repository
public interface WareHouseRepository extends JpaRepository<WareHouseModel, BigInteger> {
    
}
