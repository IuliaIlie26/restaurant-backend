package com.ibm.restaurant.comenzi;
import com.ibm.restaurant.application.tables.ComenziService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

public class ComenziController
{
    @Autowired
    private ComenziService comenziService;

    @GetMapping
    public void createComenzi(@RequestBody ComenziDTO comanda)
    {

    }

    @PutMapping
    public void updateComenzi(@RequestBody ComenziDTO comanda)
    {

    }

    @PostMapping
    public void sendComenzi(@RequestBody ComenziDTO comanda)
    {

    }

    @DeleteMapping
    public void deleteComenzi(@RequestBody ComenziDTO comanda)
    {

    }
}