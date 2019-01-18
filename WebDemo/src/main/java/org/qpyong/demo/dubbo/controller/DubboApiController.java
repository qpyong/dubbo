package org.qpyong.demo.dubbo.controller;

import com.alibaba.dubbo.common.json.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.qpyong.demo.dubbo.api.GoodsService;
import org.qpyong.demo.model.Goods;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class DubboApiController {

    public DubboApiController() {
        System.out.println("控制器初始化");
    }

    @Resource
    private GoodsService goodsService;

    @RequestMapping("/goods/{goodsId}")
    @ResponseBody
    public Goods getGoods(@PathVariable(name = "goodsId", required = true) String goodId) {
        return goodsService.getGoods(Long.parseLong(goodId));
    }

    @RequestMapping("/goods")
    @ResponseBody
    public List<Goods> getGoodsList(@RequestParam(name = "goodsId", required = true) String goodId) {
        List<Goods> list = goodsService.getAllGoods();
        return list;
    }

}
