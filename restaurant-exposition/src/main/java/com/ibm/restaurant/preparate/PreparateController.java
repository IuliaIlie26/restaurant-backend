package com.ibm.restaurant.preparate;

import com.ibm.restaurant.application.tables.PreparateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/preparate")
public class PreparateController {

    @Autowired
    private PreparateService preparateService;






}
