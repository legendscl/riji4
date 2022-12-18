package com.legendscl.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.legendscl.entity.Dish;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DishMapper extends BaseMapper<Dish> {
}
