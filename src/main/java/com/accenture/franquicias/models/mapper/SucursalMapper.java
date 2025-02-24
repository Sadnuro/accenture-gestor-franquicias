package com.accenture.franquicias.models.mapper;

import com.accenture.franquicias.models.dto.*;
import com.accenture.franquicias.models.entity.Franquicia;
import com.accenture.franquicias.models.entity.Sucursal;
import jakarta.validation.Valid;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel="spring" )
public interface SucursalMapper {
    SucursalMapper INSTANCE = Mappers.getMapper(SucursalMapper.class);

    // Establece el mapper para el objeto Franquicia dentro de Sucursal
    @Mapping(target = "franquicia", source = "idFranquicia", qualifiedByName = "idToFranquicia")
    Sucursal fromCreateDTO(@Valid SucursalCreateDto dto);

    @Named("idToFranquicia")
    default Franquicia mapIdToFranquicia(int idFranquicia){
        if (idFranquicia==0){
            return null;
        }
        Franquicia franquicia = new Franquicia();
        franquicia.setIdFranquicia(idFranquicia);
        return franquicia;
    }

    Sucursal fromUpdateDTO(@Valid SucursalUpdateDto dto);
    SucursalGetDto toGetDTO(Sucursal sucursal);
    List<SucursalGetDto> toGetDTOList(List<Sucursal> sucursal);
}
