package com.accenture.franquicias.dao.repository;

import com.accenture.franquicias.models.entity.Producto;
import com.accenture.franquicias.models.entity.Sucursal;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface IProductoRepository extends JpaRepository<Producto, Integer> {
    Optional<List<Producto>> findByIdSucursal(Integer idSucursal);
}
