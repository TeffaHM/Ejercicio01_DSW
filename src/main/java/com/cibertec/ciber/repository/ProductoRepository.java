package com.cibertec.ciber.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cibertec.ciber.entity.Producto;


public interface ProductoRepository extends JpaRepository<Producto, Integer> {

}
