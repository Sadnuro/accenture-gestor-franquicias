package com.accenture.franquicias.services;

import com.accenture.franquicias.models.entity.Franquicia;

import java.util.List;
import java.util.Optional;

public interface IFranquiciaService {
        List<Franquicia> getAll();
        Franquicia getById(Integer idFranquicia);
        Franquicia update(Franquicia franquicia);
        Franquicia createOne(Franquicia franquicia);
        Franquicia delete(Integer idFranquicia);
}
