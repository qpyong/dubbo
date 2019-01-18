package org.qpyong.demo.dubbo;

import org.qpyong.demo.dubbo.api.GoodsService;
import org.springframework.stereotype.Service;

import java.util.*;

@Service("goodsService")
public class GoodsRemoteService implements GoodsService {
    Map<Long, String> names = new HashMap<Long, String>();

    public GoodsRemoteService() {
        names.put(1L, "No1");
        names.put(2L, "No2");
        names.put(3L, "No3");
    }

    public List<String> getNames() {
       List<String> list = new ArrayList<String>();
       Iterator<String> it = names.values().iterator();
       while(it.hasNext()){
           list.add(it.next());
       }
       return list;
    }

    public String getName(long id) {
        return names.get(id);
    }
}
