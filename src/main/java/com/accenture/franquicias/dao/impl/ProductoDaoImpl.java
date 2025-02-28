package com.accenture.franquicias.dao.impl;

import com.accenture.franquicias.dao.IProductoDao;
import com.accenture.franquicias.dao.repository.IProductoRepository;
import com.accenture.franquicias.models.dto.ProductoFranquiciaSucursalGetDto;
import com.accenture.franquicias.models.dto.ProductoGetForSucursalDto;
import com.accenture.franquicias.models.entity.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductoDaoImpl implements IProductoDao {
    @Autowired
    IProductoRepository productoRepository;

    @Override
    public List<Producto> getAll() {
        return productoRepository.findAll();
    }

    @Override
    public Optional<Producto> getById(Integer idProducto) {
        return productoRepository.findById(idProducto);
    }

    @Override
    public Optional<List<ProductoFranquiciaSucursalGetDto>> obtenerProductosMaxStock(Integer idFranquicia) {
        return Optional.ofNullable(productoRepository.findMaxStockProductsByFranquicia(idFranquicia));
    }

    @Override
    public Optional<List<Producto>> getByIdSucursal(Integer idSucursal) {
        return productoRepository.findByIdSucursal(idSucursal);
    }

    @Override
    public Producto update(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public Producto createOne(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public void delete(Producto producto) {
        productoRepository.delete(producto);
    }
}
