package com.github.ptgoetz.logback.kafka.formatter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SimpleApp {
    public static final Logger LOG = LoggerFactory.getLogger(SimpleApp.class);

    public static void main(String[] args) {
        LOG.debug("Hello {}", "World!");
        LOG.info("Hello {}", "World!");
        List<Map<String,Object>> d=new ArrayList<>();
        Map<String,Object> data=new HashMap<>();
        data.put("aa","111");
        data.put("aa",222);
        d.add(data);
        LOG.info(com.alibaba.fastjson.JSON.toJSONString(d));
        /*try {
            int i=1/0;
        }catch (Exception e){
            LOG.error("", e.getMessage());
        }*/

    }
}
