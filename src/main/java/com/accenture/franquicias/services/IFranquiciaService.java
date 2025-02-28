package com.accenture.franquicias.services;

import com.accenture.franquicias.models.dto.FranquiciaCreateDto;
import com.accenture.franquicias.models.dto.FranquiciaUpdateDto;
import com.accenture.franquicias.models.entity.Franquicia;

import java.util.List;
import java.util.Optional;

public interface IFranquiciaService {
        List<Franquicia> getAll();
        Franquicia getById(Integer idFranquicia);
        Franquicia update(FranquiciaUpdateDto franquicia);
        Franquicia createOne(FranquiciaCreateDto franquicia);
        void delete(Integer idFranquicia);
}

