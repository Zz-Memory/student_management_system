package com.ecut.sms.utils;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * @author ecut
 * @Date 2025/6/25 10:00
 * @description: 分页工具类
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PagingResult<T> implements Iterable<T> {
    private static final long serialVersionUID = 1L;

    private long totalCount;
    private List<T> items = Collections.emptyList();

    public PagingResult(List<T> items,long totalCount){
        this.totalCount = totalCount;
        this.items = items;
    }

    public long getTotalCount(){
        return totalCount;
    }

    public List<T> getItems(){
        return items;
    }

    @Override
    public Iterator<T> iterator() {
        return this.items.iterator();
    }
}
