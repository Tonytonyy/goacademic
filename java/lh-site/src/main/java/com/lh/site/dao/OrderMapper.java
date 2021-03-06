package com.lh.site.dao;

import org.apache.ibatis.annotations.Param;

import com.lh.site.entity.Order;

public interface OrderMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);
    
    Order getOrderByParams(@Param("courseId") Long courseId,@Param("studentInfoId") Long studentInfoId);
}