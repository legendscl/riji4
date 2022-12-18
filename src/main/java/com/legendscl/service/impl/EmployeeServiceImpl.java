package com.legendscl.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.legendscl.entity.Employee;
import com.legendscl.mapper.EmployeeMapper;
import com.legendscl.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {
}
