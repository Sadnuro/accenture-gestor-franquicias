package com.accenture.franquicias.dao.repository;

import com.accenture.franquicias.models.entity.Sucursal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISucursalRepository extends JpaRepository<Sucursal, Integer> {
}
