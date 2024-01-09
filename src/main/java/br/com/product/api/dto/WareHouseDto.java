package br.com.product.api.dto;

import java.math.BigInteger;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class WareHouseDto {
    
    @NotNull
    @NotBlank
    @Positive
    private BigInteger idProduct;

    @NotNull
    @NotBlank
    @Positive
    private BigInteger quantity;
}
