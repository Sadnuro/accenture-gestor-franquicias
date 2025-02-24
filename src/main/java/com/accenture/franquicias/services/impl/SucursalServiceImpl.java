package com.accenture.franquicias.services.impl;

import com.accenture.franquicias.controllers.exceptions.ResourceNotFoundException;
import com.accenture.franquicias.dao.ISucursalDao;
import com.accenture.franquicias.models.dto.SucursalCreateDto;
import com.accenture.franquicias.models.dto.SucursalUpdateDto;
import com.accenture.franquicias.models.entity.Sucursal;
import com.accenture.franquicias.models.mapper.SucursalMapper;
import com.accenture.franquicias.services.ISucursalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class SucursalServiceImpl implements ISucursalService {
    @Autowired
    ISucursalDao sucursalDao;

    @Override
    public List<Sucursal> getAll() {
        return sucursalDao.getAll();
    }

    @Override
    public Sucursal getById(Integer idSucursal) {
        return sucursalDao.getById(idSucursal)
                .orElseThrow(() -> new ResourceNotFoundException("Sucursal no encontrada con ID: " + idSucursal));
    }

    @Override
    public List<Sucursal> getWithProducts(Integer idSucursal) {
        return null;
    }

    @Override
    public Sucursal update(SucursalUpdateDto sucursalDto) {
        Sucursal currentSucursal =  sucursalDao.getById(sucursalDto.getIdSucursal())
                .orElseThrow(() -> new ResourceNotFoundException("No se puede actualizar. Sucursal no encontrada."));
        currentSucursal.setFechaModificacion(LocalDateTime.now());
        currentSucursal.setNombreSucursal(sucursalDto.getNombreSucursal());
        return sucursalDao.update(currentSucursal);
    }

    @Override
    public Sucursal createOne(SucursalCreateDto sucursalDto) {
        Sucursal newSucursal = SucursalMapper.INSTANCE.fromCreateDTO(sucursalDto);
        newSucursal.setFechaCreacion(LocalDateTime.now());
//        System.out.println("Entity to Create: " + newSucursal.getIdSucursal());
//        System.out.println("newSucursal.getIdSucursal(): " + newSucursal.getIdSucursal());
//        System.out.println("Entity to Create: " + newSucursal.getNombreSucursal());
//        System.out.println("Entity to Create: " + newSucursal.get());
//        System.out.println("Entity to Create: " + newSucursal.getIdSucursal());
        return sucursalDao.createOne(newSucursal);
    }

    @Override
    public void delete(Integer idSucursal) {
        Sucursal sucursal = sucursalDao.getById(idSucursal)
                .orElseThrow(() -> new ResourceNotFoundException("No se puede eliminar. Sucursal no encontrada."));

        // Eliminar productos
        // Eliminar sucursal.
        sucursalDao.delete(sucursal.getIdSucursal());
    }

}
