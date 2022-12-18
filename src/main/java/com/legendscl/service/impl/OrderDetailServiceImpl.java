package com.legendscl.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.legendscl.entity.OrderDetail;
import com.legendscl.mapper.OrderDetailMapper;
import com.legendscl.service.OrderDetailService;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper, OrderDetail> implements OrderDetailService {

}