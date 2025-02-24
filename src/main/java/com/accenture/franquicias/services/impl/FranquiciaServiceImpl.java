package com.accenture.franquicias.services.impl;

import com.accenture.franquicias.controllers.exceptions.ResourceNotFoundException;
import com.accenture.franquicias.dao.IFranquiciaDao;
import com.accenture.franquicias.models.dto.FranquiciaCreateDto;
import com.accenture.franquicias.models.dto.FranquiciaUpdateDto;
import com.accenture.franquicias.models.entity.Franquicia;
import com.accenture.franquicias.services.IFranquiciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class FranquiciaServiceImpl implements IFranquiciaService {
    @Autowired
    private IFranquiciaDao franquiciaDao;

    @Override
    public Franquicia getById(Integer idFranquicia) {
        return franquiciaDao.getById(idFranquicia)
                .orElseThrow(() -> new ResourceNotFoundException("Franquicia no encontrada con ID: " + idFranquicia));
    }
    @Override
    public List<Franquicia> getAll() {
        return franquiciaDao.getAll();
    }

    @Override
    public Franquicia update(FranquiciaUpdateDto franquiciaDto) {
        Franquicia currentFranquicia = franquiciaDao.getById(franquiciaDto.getIdFranquicia())
                .orElseThrow(() -> new ResourceNotFoundException("No se puede actualizar. Franquicia no encontrada."));
        currentFranquicia.setFechaModificacion(LocalDateTime.now());
        currentFranquicia.setNombreFranquicia(franquiciaDto.getNombreFranquicia());
        return franquiciaDao.update(currentFranquicia);
    }

    @Override
    public Franquicia createOne(FranquiciaCreateDto franquiciaDto) {
        Franquicia newFranquicia = new Franquicia();
        newFranquicia.setNombreFranquicia(franquiciaDto.getNombreFranquicia());
        newFranquicia.setFechaCreacion(LocalDateTime.now());
        return franquiciaDao.createOne(newFranquicia);
    }

    @Override
    public void delete(Integer idFranquicia) {
        Franquicia franquicia = franquiciaDao.getById(idFranquicia)
                .orElseThrow(() -> new ResourceNotFoundException("No se puede eliminar. Franquicia no encontrada."));
        franquiciaDao.delete(idFranquicia);
    }
}
