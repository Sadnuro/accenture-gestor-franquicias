package com.accenture.franquicias.services;

import com.accenture.franquicias.models.dto.ProductoCreateDto;
import com.accenture.franquicias.models.dto.ProductoGetForSucursalDto;
import com.accenture.franquicias.models.dto.ProductoUpdateDto;
import com.accenture.franquicias.models.dto.SucursalGetForFranquiciaDto;
import com.accenture.franquicias.models.entity.Producto;

import java.util.List;

public interface IProductoService {
    List<Producto> getAll();
    Producto getById(Integer idProducto);
    List<ProductoGetForSucursalDto> getByIdSucursal (Integer idSucursal);
    Producto update(ProductoUpdateDto productoDto);
    Producto createOne(ProductoCreateDto productoDto);
    void delete(Integer idProducto);
}
