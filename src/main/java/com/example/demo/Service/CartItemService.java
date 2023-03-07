package com.example.demo.Service;

import com.example.demo.Model.CartItem;

import java.util.List;

public interface CartItemService
{
    List<CartItem> getItemsByOrderNumber(String orderNumber);
    CartItem addItem(CartItem cartItem);
}
