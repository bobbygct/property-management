package com.mycompany.propertymanagement.controller;


import com.mycompany.propertymanagement.model.PropertyDTO;
import com.mycompany.propertymanagement.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PropertyController {

    @Autowired
    private PropertyService propertyService;

    @GetMapping("/hello")
    public String sayHello(){

        return "Hello";
    }

    @PostMapping("/helloProp")
    public PropertyController addProp(@RequestBody PropertyDTO propertyDTO){

        propertyService.saveProp(propertyDTO);
        return null;
    }
}
