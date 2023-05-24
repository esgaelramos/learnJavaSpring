package com.gira.giramarket.persistance.crud;

import org.springframework.data.repository.CrudRepository;

import com.gira.giramarket.persistance.entity.Producto;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {
    
}
