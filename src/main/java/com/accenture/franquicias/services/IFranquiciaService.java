package com.accenture.franquicias.services;

import com.accenture.franquicias.models.entity.Franquicia;

import java.util.List;

public interface IFranquiciaService {
        List<Franquicia> getAll();
        Franquicia getById(Integer idFranquicia);
        Franquicia updateById(Integer idFranquicia, Franquicia franquicia);
        Franquicia createOne(Franquicia franquicia);
        void delete(Integer idFranquicia)
}
