package com.legendscl.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.legendscl.entity.User;
import com.legendscl.mapper.UserMapper;
import com.legendscl.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
