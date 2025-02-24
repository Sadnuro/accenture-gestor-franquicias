package com.accenture.franquicias.dao.impl;

import com.accenture.franquicias.dao.ISucursalDao;
import com.accenture.franquicias.dao.repository.ISucursalRepository;
import com.accenture.franquicias.models.entity.Sucursal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class SucursalDaoImpl implements ISucursalDao {
    @Autowired
    ISucursalRepository sucursalRepository;

    @Override
    public List<Sucursal> getAll() {
        return sucursalRepository.findAll();
    }

    @Override
    public Optional<Sucursal> getById(Integer id) {
        return sucursalRepository.findById(id);
    }

    @Override
    public Sucursal update(Sucursal sucursal) {
        return sucursalRepository.save(sucursal);
    }

    @Override
    public Sucursal createOne(Sucursal sucursal) {
        return sucursalRepository.save(sucursal);
    }

    @Override
    public void delete(Integer idSucursal) {
//        sucursalRepository.delete();
    }
}
