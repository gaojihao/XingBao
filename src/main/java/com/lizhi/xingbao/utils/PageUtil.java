package com.lizhi.xingbao.utils;

import org.springframework.data.domain.Page;
import java.util.*;

public class PageUtil extends cn.hutool.core.util.PageUtil {

    /**
     * List 分页
     * @param page
     * @param size
     * @param list
     * @return
     */
    public static List toPage(int page, int size , List list) {
        int fromIndex = page * size;
        int toIndex = page * size + size;

        if(fromIndex > list.size()){
            return new ArrayList();
        } else if(toIndex >= list.size()) {
            return list.subList(fromIndex,list.size());
        } else {
            return list.subList(fromIndex,toIndex);
        }
    }

    /**
     * Page 数据处理，预防redis反序列化报错
     * @param page
     * @return
     */
    public static Map toPage(Page page) {
        Map<String,Object> map = new LinkedHashMap<>(2);
        map.put("data",page.getContent());
        map.put("totalCount",page.getTotalElements());
        return map;
    }

    /**
     * @param object
     * @param totalElements
     * @return
     */
    public static Map toPage(Object object, int totalElements) {
        Map<String,Object> map = new LinkedHashMap<>(2);
        map.put("data",object);
        map.put("totalCount",totalElements);

        return map;
    }

}
