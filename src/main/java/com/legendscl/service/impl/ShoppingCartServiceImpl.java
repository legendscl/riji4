package com.legendscl.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.legendscl.entity.ShoppingCart;
import com.legendscl.mapper.ShoppingCartMapper;
import com.legendscl.service.ShoppingCartService;
import org.springframework.stereotype.Service;

@Service
public class ShoppingCartServiceImpl extends ServiceImpl<ShoppingCartMapper, ShoppingCart> implements ShoppingCartService {

}
