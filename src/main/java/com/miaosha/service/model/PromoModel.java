package com.miaosha.service.model;

import lombok.Getter;
import lombok.Setter;
import org.joda.time.DateTime;

import java.math.BigDecimal;

@Getter
@Setter
public class PromoModel {
    private Integer id;

    //秒杀活动状态 1表示未开始 2表示进行中 3表示已结束
    private Integer status;
    //秒杀活动名称
    private String promoName;

    //秒杀活动开始时间
    private DateTime startDate;

    //秒杀活动结束时间
    private DateTime endDate;

    //秒杀活动适用的商品
    private Integer itemId;

    //秒杀活动的商品价格
    private BigDecimal promoItemPrice;

}
