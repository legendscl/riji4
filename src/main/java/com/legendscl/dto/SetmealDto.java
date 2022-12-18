package com.legendscl.dto;


import com.legendscl.entity.Setmeal;
import com.legendscl.entity.SetmealDish;
import lombok.Data;
import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
