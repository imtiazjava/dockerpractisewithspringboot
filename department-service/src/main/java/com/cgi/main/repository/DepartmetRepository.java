package com.cgi.main.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.cgi.main.model.Department;

@Repository
public interface DepartmetRepository extends MongoRepository<Department,Integer>{

}
