package com.ecom.app.dto;

import com.ecom.app.model.Product;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class CartItemsResponse {
    private Product product;
    private Integer quantity;
    private BigDecimal price;
}
