package org.qpyong.demo.dubbo;

import org.qpyong.demo.dubbo.api.GoodsService;
import org.qpyong.demo.model.Goods;
import org.springframework.stereotype.Service;

import java.util.*;

@Service("goodsService")
public class GoodsRemoteService implements GoodsService {
    Map<Long, Goods> goodsMap = new HashMap<Long, Goods>();

    public GoodsRemoteService() {
        for (int i = 0; i < 10; i++) {
            goodsMap.put(new Integer(i).longValue(), createGoods(i));
        }
    }

    private Goods createGoods(long goodId) {
        Goods goods = new Goods();
        goods.setId(goodId);
        goods.setName("爱他美奶粉" + goodId);
        goods.setExpiryDate(24);
        goods.setOpgCode("G00" + goodId);
        goods.setProductDate(Calendar.getInstance().getTime());
        return goods;
    }


    public Goods getGoods(long l) {
        return goodsMap.get(l);
    }

    public List<Goods> getAllGoods() {
        Iterator<Goods> it = goodsMap.values().iterator();
        List<Goods> list = new ArrayList<Goods>();
        while (it.hasNext()) {
            list.add(it.next());
        }
        return list;
    }
}
