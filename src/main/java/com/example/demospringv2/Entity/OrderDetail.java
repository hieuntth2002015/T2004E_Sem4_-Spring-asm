package com.example.demospringv2.Entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "order_details")
public class OrderDetail {

    @EmbeddedId
    private OrderDetailId id;

    private int quantity;
    private double unitPrice;

    @ManyToOne()
    @JoinColumn(name = "order_id", referencedColumnName = "id", nullable = false)
    @MapsId("orderId")
    private Order order;

    @ManyToOne()
    @JoinColumn(name = "product_id", referencedColumnName = "id", nullable = false)
    @MapsId("productId")
    private Order product;
}
