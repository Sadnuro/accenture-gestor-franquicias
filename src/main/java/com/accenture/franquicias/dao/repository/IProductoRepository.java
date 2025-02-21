package com.accenture.franquicias.dao.repository;

import com.accenture.franquicias.models.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductoRepository extends JpaRepository<Producto, Integer> {
}
