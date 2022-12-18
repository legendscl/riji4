package com.legendscl.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.legendscl.dto.SetmealDto;
import com.legendscl.entity.Setmeal;

import java.util.List;

public interface SetmealService extends IService<Setmeal> {
    public void saveWithDish(SetmealDto setmealDto);
    public void removeWithDish(List<Long> ids);
}
