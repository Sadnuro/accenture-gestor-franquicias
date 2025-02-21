package com.accenture.franquicias.controllers;

import com.accenture.franquicias.models.dto.FranquiciaGetDto;
import com.accenture.franquicias.models.entity.Franquicia;
import com.accenture.franquicias.models.mapper.FranquiciaMapper;
import com.accenture.franquicias.services.IFranquiciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping({"/franquicia"})
public class FranquiciaController {
    @Autowired
    IFranquiciaService franquiciaService;
    @Autowired
    FranquiciaMapper franquiciaMapper;

    @GetMapping({"/"})
    public List<FranquiciaGetDto> getAllFranquicias(){
        List<Franquicia> listaEntity =  franquiciaService.getAll();
        List<FranquiciaGetDto> franquicias = franquiciaMapper.toGetDTOList(listaEntity);
        return franquicias;
    }
}
