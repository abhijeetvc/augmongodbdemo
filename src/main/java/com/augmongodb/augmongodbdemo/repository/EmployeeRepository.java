package com.augmongodb.augmongodbdemo.repository;

import com.augmongodb.augmongodbdemo.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepository extends MongoRepository<Employee,String> {
}
