package com.example.demo.Repository;

import com.example.demo.Model.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CartItemRepo extends JpaRepository<CartItem,Integer> {
    List<CartItem> findByOrderNumberOrderByItemName(String orderNumber);
}
