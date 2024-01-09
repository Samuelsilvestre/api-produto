package br.com.product.api.model;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.time.ZoneId;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table
@Data
public class HareHouseModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private BigInteger id;

    @Column(name = "idproduct", nullable = false)
    private BigInteger idProduct;

    @Column(name = "quantity", nullable = false)
    private BigInteger quantity;
    
    private LocalDateTime date = LocalDateTime.now(ZoneId.of("UTC"));
}
