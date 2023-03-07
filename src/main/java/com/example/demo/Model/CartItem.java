package com.example.demo.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Table(name="cartItem2")
public class CartItem
{
    String itemName;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Integer id;
     Double Price;
     Integer Quantity;
     String orderNumber;
}
