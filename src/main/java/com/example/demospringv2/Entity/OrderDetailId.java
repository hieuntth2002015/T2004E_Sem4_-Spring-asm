package com.example.demospringv2.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

//cần đặt là Embeddable
@Embeddable
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetailId implements Serializable {
    @Column(name = "order_id")
    private int orderId;

    @Column(name = "product_id")
     private int productId;
}
