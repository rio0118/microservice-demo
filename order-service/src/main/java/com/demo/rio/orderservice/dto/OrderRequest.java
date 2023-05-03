package com.demo.rio.orderservice.dto;

import com.demo.rio.orderservice.model.OrderLineItems;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderRequest {
    private List<OrderLineItemsDto> orderLineItemsDtoList;
}
