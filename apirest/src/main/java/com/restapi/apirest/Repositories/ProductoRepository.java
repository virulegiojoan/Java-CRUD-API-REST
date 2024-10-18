package com.restapi.apirest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restapi.apirest.models.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long>{

}
