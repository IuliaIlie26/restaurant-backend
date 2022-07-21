package com.ibm.restaurant.livrator;


import com.ibm.restaurant.application.tables.LivratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("http://localhost:8080/api/v1/table/1")

public class LivratorControl
{
    @Autowired
    private LivratorService livratorService;

    @GetMapping
    public void createLivrator(@RequestBody LivratorDTO livrator)
    {

    }

    @PutMapping
    public void updateLivrator(@RequestBody LivratorDTO livrator)
    {

    }

    @PostMapping
    public void sendLivrator(@RequestBody LivratorDTO livrator)
    {

    }

    @DeleteMapping
    public void deleteLivrator(@RequestBody LivratorDTO livrator)
    {

    }


}
