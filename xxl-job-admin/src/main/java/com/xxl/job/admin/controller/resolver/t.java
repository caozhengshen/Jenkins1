package com.xxl.job.admin.controller.resolver;

import groovy.util.logging.Slf4j;
import io.micrometer.core.instrument.util.JsonUtils;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Slf4j
public class t {
    public static void main(String[] args) {
        /*String t="7b226964223a20312c2022757365726e616d65223a202261646d696e222c202270617373776f7264223a20226531306164633339343962613539616262653536653035376632306638383365222c2022726f6c65223a20312c20227065726d697373696f6e223a20317d";
        String json=new String(new BigInteger(t, 16).toByteArray());
        System.out.println(json);*/
        List<Integer> ls=new ArrayList<>();
        ls.add(1);
        ls.add(2);
        Map<Integer,Integer> map=new HashMap<>();
        map.put(1,2);
        map.put(2,3);
        System.out.println(map);
        System.out.println(ls);

    }
}
