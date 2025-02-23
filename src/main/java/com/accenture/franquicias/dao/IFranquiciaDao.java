package com.accenture.franquicias.dao;

import com.accenture.franquicias.models.dto.FranquiciaUpdateDto;
import com.accenture.franquicias.models.entity.Franquicia;

import java.util.List;
import java.util.Optional;

public interface IFranquiciaDao {
    List<Franquicia> getAll();
    Optional<Franquicia> getById(Integer Id);
    Franquicia update(Franquicia franquicia);
    Franquicia createOne(Franquicia franquicia);
    void delete(Integer idFranquicia);
}
