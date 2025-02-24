package com.accenture.franquicias.dao.repository;

import com.accenture.franquicias.models.entity.Sucursal;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ISucursalRepository extends JpaRepository<Sucursal, Integer> {
    Optional<List<Sucursal>> findByIdFranquicia(Integer idFranquicia);
}
