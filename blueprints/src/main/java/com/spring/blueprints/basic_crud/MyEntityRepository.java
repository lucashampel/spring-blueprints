package com.spring.blueprints.basic_crud;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MyEntityRepository extends JpaRepository<MyEntity, Long> {
    // Define custom query methods if needed
}
