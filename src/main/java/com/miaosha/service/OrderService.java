package com.miaosha.service;

import com.miaosha.error.BusinessException;
import com.miaosha.service.model.OrderModel;

public interface OrderService {
    //1 通过前端url上传过来秒杀活动的id，然后下单接口内校验对应id是否属于对应商品且活动已开始
    //2 直接在下单接口内判断应的商品是否存在秒杀活动，若存在进行的秒杀活动则以秒杀价格下单
    OrderModel createOrder(Integer userId, Integer itemId,Integer promoId, Integer amount) throws BusinessException;
}
