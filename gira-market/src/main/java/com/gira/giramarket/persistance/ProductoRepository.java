package com.gira.giramarket.persistance;

import java.util.List;

import com.gira.giramarket.persistance.crud.ProductoCrudRepository;
import com.gira.giramarket.persistance.entity.Producto;

public class ProductoRepository {

    private ProductoCrudRepository productoCrudRepository;

    public List<Producto> getAll() {
        
        // sin casteo no funciona!
        // return productoCrudRepository.findAll();

        // casteada!
        return (List<Producto>) productoCrudRepository.findAll();
    }

    public List<Producto> getByCategoria(int idCategoria) {
        return productoCrudRepository.findByIdCategoriaOrderByNombreAsc(idCategoria);
    }

    public Optional<List<Producto>> getEscasos(int cantidadStock, boolean estado) {
        return productoCrudRepository.findByCantidadStockLessThanAndEstado(cantidadStock, estado);
    }

}
