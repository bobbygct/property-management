package com.mycompany.propertymanagement.controller;

import com.mycompany.propertymanagement.model.CalculatorDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class CalculatorController {

    @GetMapping("/add")
    public Double add(@RequestParam("add1") Double num1, @RequestParam("add2")Double num2){

        return num1+num2;
    }

    @GetMapping("/sub/{add1}/{add2}")
    public Double multiply(@PathVariable("add1") Double num1, @PathVariable("add2")Double num2){

        return num1-num2;
    }
    @PostMapping("/mul")
    public ResponseEntity multiply(@RequestBody CalculatorDTO cdto){

        Double res = cdto.getNum1()*cdto.getNum2()*cdto.getNum3();
        ResponseEntity<Double> responseEntity = new ResponseEntity<Double>(res, HttpStatus.CREATED);
      return responseEntity;
    }
}
