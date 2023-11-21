package com.spring.blueprints.basic_crud;

import org.springframework.web.bind.annotation.*;

import io.swagger.v3.oas.annotations.Operation;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/myentities")
public class MyEntityController {

    @Autowired
    private MyEntityRepository repository;
    
    private static final Logger logger = LoggerFactory.getLogger(MyEntityController.class);


    @PostMapping
    public MyEntity createMyEntity(@RequestBody MyEntity myEntity) {
    	logger.info("Received entity: {}", myEntity);
        return repository.save(myEntity);
    }

    @GetMapping
    public List<MyEntity> getAllMyEntities() {
        return repository.findAll();
    }
    
    @GetMapping("/myendpoint")
    @Operation(summary = "Get My Endpoint", description = "More details about this endpoint")
    public String getMyEndpoint() {
        return "Hello";
    }
}
