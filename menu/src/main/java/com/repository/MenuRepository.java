package com.repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.entity.Menu;

import java.util.List;

public interface MenuRepository extends BaseMapper<Menu> {
    public List<Menu> findAll(int index,int limit);
    public int count();
    public Menu findById(long id);
    public void save(Menu menu);
    public void update(Menu menu);
    public void deleteById(long id);
}
