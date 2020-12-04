package com.miaosha.service;

import com.miaosha.service.model.ItemModel;

import java.util.List;

public interface ItemService {
    //创建商品
    ItemModel createItem(ItemModel itemModel);

    //商品列表浏览
    List<ItemModel>listItem();

    //商品详情浏览
    ItemModel getItemById(Integer id);

}
