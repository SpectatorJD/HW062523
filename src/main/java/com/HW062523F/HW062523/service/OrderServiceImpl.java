package com.HW062523F.HW062523.service;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderServiceImpl implements OrderService{
    private final Cart cart;
    public OrderServiceImpl(Cart cart) {
        this.cart = cart;
    }

    @Override
    public void addItems(List<Integer> ItemIds){
        cart.addItems(ItemIds) ;

    }
    @Override
    public List<Integer> getItems(){
        return cart.getItems();
    }
}
