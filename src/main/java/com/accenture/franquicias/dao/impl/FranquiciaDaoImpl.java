package com.accenture.franquicias.dao.impl;

import com.accenture.franquicias.dao.IFranquiciaDao;
import com.accenture.franquicias.dao.repository.IFranquiciaRepository;
import com.accenture.franquicias.models.entity.Franquicia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FranquiciaDaoImpl implements IFranquiciaDao {
    @Autowired
    private IFranquiciaRepository franquiciaRepository;

    public List<Franquicia> getAll() {
        return franquiciaRepository.findAll();
    };
    public Franquicia getById(Integer idFranquicia) {
        return franquiciaRepository.findById(idFranquicia); //.orElse(null);
    }

    @Override
    public Franquicia updateById(Integer id) {
        return null;
    }

    @Override
    public Franquicia createOne(Franquicia franquicia) {
        return franquiciaRepository.save(franquicia);
    }

    @Override
    public void delete(Integer idFranquicia) {

    }

    ;
    public Object updateOne(Franquicia franquicia) {
        // Si existe lo actualiza, sino lo crea.
        return franquiciaRepository.save(franquicia);
    };
}
