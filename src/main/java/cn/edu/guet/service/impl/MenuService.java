package cn.edu.guet.service.impl;

import cn.edu.guet.mapper.MenuMapper;
import cn.edu.guet.model.Menu;
import cn.edu.guet.service.IMenuService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MenuService implements IMenuService {

    @Autowired
    MenuMapper menuMapper;

    @Override
    public List<Menu> getAllMenu() {
        return menuMapper.getAllMenu();
    }
}
