package com.accenture.franquicias.dao;

import com.accenture.franquicias.models.entity.Franquicia;

import java.util.List;

public interface IFranquiciaDao {
    List<Franquicia> getAll();
    Franquicia getById(Integer Id);
    Franquicia updateById(Integer id);
    Franquicia createOne(Franquicia franquicia);
    void delete(Integer idFranquicia);
}
