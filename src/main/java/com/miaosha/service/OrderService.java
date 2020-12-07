package com.miaosha.service;

import com.miaosha.error.BusinessException;

public interface OrderService {
    OrderService createOrder(Integer userId,Integer itemId,Integer amount) throws BusinessException;
}
