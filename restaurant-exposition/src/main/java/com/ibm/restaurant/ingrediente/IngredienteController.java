package com.ibm.restaurant.ingrediente;

import com.ibm.restaurant.application.tables.IngredienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/ingrediente")
public class IngredienteController {

    @Autowired
    private IngredienteService ingredienteService;

}
