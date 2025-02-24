package com.accenture.franquicias.services;

import com.accenture.franquicias.models.dto.SucursalCreateDto;
import com.accenture.franquicias.models.dto.SucursalGetForFranquiciaDto;
import com.accenture.franquicias.models.dto.SucursalUpdateDto;
import com.accenture.franquicias.models.entity.Sucursal;

import java.util.List;

public interface ISucursalService {
    List<Sucursal> getAll();
    Sucursal getById(Integer idSucursal);
    List<SucursalGetForFranquiciaDto> getByIdFranquicia(Integer idFranquicia);
    List<Sucursal>getWithProducts(Integer idSucursal);
    Sucursal update(SucursalUpdateDto sucursalDto);
    Sucursal createOne(SucursalCreateDto sucursalDto);
    void delete(Integer idSucursal);
}
