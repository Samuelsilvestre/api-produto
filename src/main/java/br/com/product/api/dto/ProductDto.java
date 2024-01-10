package br.com.product.api.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class ProductDto {
    
    @NotBlank
    @NotNull
    @Length(max = 50)
    private String name;

     @NotBlank
    @NotNull
    @Length(max = 100)
    private String description;

    @Positive
    private BigDecimal price;

    private boolean status;

    private LocalDateTime date;

}
