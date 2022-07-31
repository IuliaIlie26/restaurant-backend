package com.ibm.restaurant.application.tables;

import com.ibm.restaurant.domain.IMenuRepository;
import com.ibm.restaurant.domain.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MenuService {

    @Autowired
    private IMenuRepository iMenuRepository;
    public void create(Menu menu){
        iMenuRepository.createMenu(menu);
    }
}
