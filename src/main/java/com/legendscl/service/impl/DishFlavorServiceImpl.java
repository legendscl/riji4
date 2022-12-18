package com.legendscl.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.legendscl.entity.DishFlavor;
import com.legendscl.mapper.DishFlavorMapper;
import com.legendscl.service.DishFlavorService;
import org.springframework.stereotype.Service;

@Service
public class DishFlavorServiceImpl extends ServiceImpl<DishFlavorMapper, DishFlavor> implements DishFlavorService {
}
