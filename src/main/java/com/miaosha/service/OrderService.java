package com.miaosha.service;

public interface OrderService {
    OrderService createOrder(Integer userId,Integer itemId,Integer amount);
}
