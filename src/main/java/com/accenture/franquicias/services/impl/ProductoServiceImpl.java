package com.accenture.franquicias.services.impl;

import com.accenture.franquicias.controllers.exceptions.ResourceNotFoundException;
import com.accenture.franquicias.dao.IProductoDao;
import com.accenture.franquicias.models.dto.ProductoCreateDto;
import com.accenture.franquicias.models.dto.ProductoFranquiciaSucursalGetDto;
import com.accenture.franquicias.models.dto.ProductoGetForSucursalDto;
import com.accenture.franquicias.models.dto.ProductoUpdateDto;
import com.accenture.franquicias.models.entity.Producto;
import com.accenture.franquicias.models.mapper.ProductoMapper;
import com.accenture.franquicias.services.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductoServiceImpl implements IProductoService {
    @Autowired
    IProductoDao productoDao;

    @Override
    public List<Producto> getAll() {
        return productoDao.getAll();
    }

    @Override
    public Producto getById(Integer idProducto) {
        return productoDao.getById(idProducto)
                .orElseThrow(() -> new ResourceNotFoundException("Producto no encontrado con ID: " + idProducto));
    }

    @Override
    public List<ProductoGetForSucursalDto> getByIdSucursal(Integer idSucursal) {
        List<Producto> productos = productoDao.getByIdSucursal(idSucursal).orElse(new ArrayList<>());
        return ProductoMapper.INSTANCE.toGetForSucursalDTOList(productos);
    }

    @Override
    public List<ProductoFranquiciaSucursalGetDto> obtenerProductosMaxStock(Integer idFranquicia) {
        return productoDao.obtenerProductosMaxStock(idFranquicia).orElse(new ArrayList<>());
    }

    @Override
    public Producto update(ProductoUpdateDto productoDto) {
        Producto currentProducto =  productoDao.getById(productoDto.getIdProducto())
                .orElseThrow(() -> new ResourceNotFoundException("No se puede actualizar. Producto no encontrado."));
        if (productoDto.getNombreProducto() != null && !productoDto.getNombreProducto().trim().isEmpty()){
            currentProducto.setNombreProducto(productoDto.getNombreProducto());
        }
        if (productoDto.getStock() != null && productoDto.getStock()>=0){
            currentProducto.setStock(productoDto.getStock());
        }
        currentProducto.setFechaModificacion(LocalDateTime.now());
        return productoDao.update(currentProducto);
    }

    @Override
    public Producto createOne(ProductoCreateDto productoDto) {
        return productoDao.createOne(ProductoMapper.INSTANCE.fromCreateDTO(productoDto));
    }

    @Override
    public void delete(Integer idProducto) {
        Producto producto = getById(idProducto);
        productoDao.delete(producto);
    }
}
