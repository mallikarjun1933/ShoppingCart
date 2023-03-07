package com.example.demo.Service;

import com.example.demo.Model.CartItem;
import com.example.demo.Repository.CartItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ICartItemService implements CartItemService{
    @Autowired
    CartItemRepo cartItemRepo;
    @Override
    public List<CartItem> getItemsByOrderNumber(String orderNumber) {
        return cartItemRepo.findByOrderNumberOrderByItemName(orderNumber);
    }

    @Override
    public CartItem addItem(CartItem cartItem) {
        return cartItemRepo.save(cartItem);
    }
}
