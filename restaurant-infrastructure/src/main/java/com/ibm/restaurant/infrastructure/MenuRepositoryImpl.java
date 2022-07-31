package com.ibm.restaurant.infrastructure;

import com.ibm.restaurant.domain.IMenuRepository;
import com.ibm.restaurant.domain.Menu;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Set;

@Repository
public class MenuRepositoryImpl implements IMenuRepository {
    private Set<Menu>dbSet=new HashSet<>();

    @Override
    public void createMenu(Menu menu) {
        dbSet.add(menu);
        for(Menu menu1:dbSet){
            System.out.println("Menu: "+menu1.toString());
        }
    }
}
