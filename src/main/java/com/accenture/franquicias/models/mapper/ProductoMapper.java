package com.accenture.franquicias.models.mapper;

import com.accenture.franquicias.models.dto.*;
import com.accenture.franquicias.models.entity.Producto;
import com.accenture.franquicias.models.entity.Sucursal;
import jakarta.validation.Valid;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel="spring" )
public interface ProductoMapper {
    ProductoMapper INSTANCE = Mappers.getMapper(ProductoMapper.class);

    // Establece el mapper para el objeto Sucursal dentro de Producto
    @Mapping(target = "sucursal", source = "idSucursal", qualifiedByName = "idToSucursal")
    Producto fromCreateDTO(@Valid ProductoCreateDto dto);

    @Named("idToSucursal")
    default Sucursal mapIdToSucursal(int idSucursal){
        if (idSucursal==0){
            return null;
        }
        Sucursal sucursal = new Sucursal();
        sucursal.setIdSucursal(idSucursal);
        return sucursal;
    }

    Producto fromUpdateDTO(@Valid ProductoUpdateDto dto);
    ProductoGetDto toGetDTO(Producto producto);
    List<ProductoGetDto> toGetDTOList(List<Producto> productos);
}
