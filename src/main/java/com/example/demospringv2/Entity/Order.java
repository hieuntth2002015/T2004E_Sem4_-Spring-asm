package com.example.demospringv2.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "orders")
public class Order {

    @Id
    private int id;
    private double totalPrice;
    private String shipName;
    private String ShipAddress;
    private String shipPhone;
    private LocalDate createdAt;
    private LocalDate updatedAt;

    // Order Thuộc về người dùng nào
    private int customerId;

    @OneToMany(mappedBy = "order")
    private Set<OrderDetail> orderDetails;
}
