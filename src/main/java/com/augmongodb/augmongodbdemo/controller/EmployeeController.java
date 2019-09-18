package com.augmongodb.augmongodbdemo.controller;

import com.augmongodb.augmongodbdemo.model.Employee;
import com.augmongodb.augmongodbdemo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @PostMapping(value="/savedata")
    public String saveData(@RequestBody Employee employee){
        employeeRepository.save(employee);
        return "Data saved";
    }
}
