package com.ibm.restaurant;

import com.ibm.restaurant.domain.Menu;
import org.springframework.stereotype.Service;

@Service
public class MenuMapperService {

    public Menu mapToDomain(MenuDto menuDto){

        return new Menu();
    }
}
