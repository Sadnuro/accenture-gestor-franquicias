package com.accenture.franquicias.services.impl;

import com.accenture.franquicias.models.entity.Franquicia;
import com.accenture.franquicias.services.IFranquiciaService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FranquiciaServiceImpl implements IFranquiciaService {
    @Override
    public Franquicia getById(Integer Id) {
        return null;
    }

    @Override
    public List<Franquicia> getAll() {
        return null;
    }

    @Override
    public Franquicia updateById(Integer id, Franquicia franquicia) {
        return null;
    }

    @Override
    public Franquicia createOne(Franquicia franquicia) {
        return null;
    }

    @Override
    public void delete(Integer idFranquicia) {

    }
}
