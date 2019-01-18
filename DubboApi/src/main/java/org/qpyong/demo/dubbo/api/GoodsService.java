package org.qpyong.demo.dubbo.api;

import org.qpyong.demo.model.Goods;

import java.util.List;

public interface GoodsService {

    /**
     * 根据产品id
     *
     * @return  商品对象
     */
    Goods getGoods(long goodId);


    /**
     * 获取所有商品列表
     *
     * @return 商品列表
     */
    List<Goods> getAllGoods();




}
