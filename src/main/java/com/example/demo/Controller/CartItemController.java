package com.example.demo.Controller;

import com.example.demo.Model.CartItem;
import com.example.demo.Service.CartItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v2")
public class CartItemController
{
    @Autowired
    CartItemService cartItemService;
    @PostMapping("/cartTable")
    public ResponseEntity<CartItem> createItem(@RequestBody CartItem cartItem)
    {
        return new ResponseEntity<>(cartItemService.addItem(cartItem), HttpStatus.CREATED);
    }

    @GetMapping("/cartTable/{orderNumber}")
    public List<CartItem> getItemByOrderNumber(@PathVariable String orderNumber)
    {
        return cartItemService.getItemsByOrderNumber(orderNumber);
    }
}
