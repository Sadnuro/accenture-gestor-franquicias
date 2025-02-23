package com.accenture.franquicias.services.impl;

import com.accenture.franquicias.dao.IFranquiciaDao;
import com.accenture.franquicias.models.dto.FranquiciaCreateDto;
import com.accenture.franquicias.models.entity.Franquicia;
import com.accenture.franquicias.services.IFranquiciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class FranquiciaServiceImpl implements IFranquiciaService {
    @Autowired
    private IFranquiciaDao franquiciaDao;

    @Override
    public Franquicia getById(Integer idFranquicia) {
        return franquiciaDao.getById(idFranquicia);
    }

    @Override
    public List<Franquicia> getAll() {
        return franquiciaDao.getAll();
    }

    @Override
    public Franquicia update(Franquicia franquicia) {
        return franquiciaDao.update(franquicia);
    }

    @Override
    public Franquicia createOne(FranquiciaCreateDto franquicia) {
        Franquicia newFranquicia = new Franquicia();
        newFranquicia.setNombreFranquicia(franquicia.getNombreFranquicia());
        newFranquicia.setFechaCreacion(new Date());
        return franquiciaDao.update(newFranquicia);
    }

    @Override
    public Franquicia delete(Integer idFranquicia) {
        return franquiciaDao.delete(idFranquicia);
    }
}
