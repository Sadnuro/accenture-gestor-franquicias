package com.accenture.franquicias.models.mapper;

import com.accenture.franquicias.models.dto.FranquiciaCreateDto;
import com.accenture.franquicias.models.dto.FranquiciaGetDto;
import com.accenture.franquicias.models.dto.FranquiciaUpdateDto;
import com.accenture.franquicias.models.entity.Franquicia;
import jakarta.validation.Valid;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel="spring" )
public interface FranquiciaMapper {
    FranquiciaMapper INSTANCE = Mappers.getMapper(FranquiciaMapper.class);

    Franquicia fromCreateDTO(@Valid FranquiciaCreateDto dto);
    Franquicia fromUpdateDTO(@Valid FranquiciaUpdateDto dto);
    FranquiciaGetDto toGetDTO(Franquicia franquicia);
}
