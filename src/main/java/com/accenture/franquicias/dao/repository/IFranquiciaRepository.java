package com.accenture.franquicias.dao.repository;

import com.accenture.franquicias.models.entity.Franquicia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFranquiciaRepository extends JpaRepository<Franquicia, Integer> {
}
