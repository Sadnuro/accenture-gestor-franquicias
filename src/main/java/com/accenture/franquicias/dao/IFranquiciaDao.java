package com.accenture.franquicias.dao;

import com.accenture.franquicias.models.dto.FranquiciaUpdateDto;
import com.accenture.franquicias.models.entity.Franquicia;

import java.util.List;

public interface IFranquiciaDao {
    List<Franquicia> getAll();
    Franquicia getById(Integer Id);
    Franquicia update(Franquicia franquicia);
    Franquicia createOne(Franquicia franquicia);
    Franquicia delete(Integer idFranquicia);
}
