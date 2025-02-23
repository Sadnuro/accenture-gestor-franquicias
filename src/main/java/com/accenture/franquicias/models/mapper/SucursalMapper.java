package com.accenture.franquicias.models.mapper;

import com.accenture.franquicias.models.dto.*;
import com.accenture.franquicias.models.entity.Franquicia;
import com.accenture.franquicias.models.entity.Sucursal;
import jakarta.validation.Valid;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel="spring" )
public interface SucursalMapper {
    SucursalMapper INSTANCE = Mappers.getMapper(SucursalMapper.class);

    Sucursal fromCreateDTO(@Valid SucursalCreateDto dto);
    Sucursal fromUpdateDTO(@Valid SucursalUpdateDto dto);
    SucursalGetDto toGetDTO(Sucursal sucursal);
    List<SucursalGetDto> toGetDTOList(List<Sucursal> sucursal);
}
