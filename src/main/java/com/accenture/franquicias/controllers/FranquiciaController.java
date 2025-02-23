package com.accenture.franquicias.controllers;

import com.accenture.franquicias.models.dto.FranquiciaCreateDto;
import com.accenture.franquicias.models.dto.FranquiciaGetDto;
import com.accenture.franquicias.models.dto.FranquiciaUpdateDto;
import com.accenture.franquicias.models.entity.Franquicia;
import com.accenture.franquicias.models.mapper.FranquiciaMapper;
import com.accenture.franquicias.services.IFranquiciaService;
import jakarta.validation.Valid;
import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping({"/api/franquicia/", "/api/franquicia"})
public class FranquiciaController {
    @Autowired
    IFranquiciaService franquiciaService;

    @GetMapping
    public List<FranquiciaGetDto> getAllFranquicias(){
        List<Franquicia> listaEntity =  franquiciaService.getAll();
        return FranquiciaMapper.INSTANCE.toGetDTOList(listaEntity);
    }
    @GetMapping({"{idFranquicia}"})
    public FranquiciaGetDto getFranquicia(@Valid @PathVariable("idFranquicia") Integer id){
        Franquicia franquicia =  franquiciaService.getById(id);
        System.out.println("dbresponse: "+ franquicia);
        return FranquiciaMapper.INSTANCE.toGetDTO(franquicia);
    }
    @PostMapping
    public ResponseEntity<Object>  createOne(@Valid @RequestBody FranquiciaCreateDto franquiciaCreateDto){
        Franquicia dbResponse = franquiciaService.createOne(franquiciaCreateDto);
        return ResponseEntity.ok(FranquiciaMapper.INSTANCE.toGetDTO(dbResponse));  //ResponseEntity.ok(response);
    }
    @PatchMapping
    public ResponseEntity<Object> updateOne(@Valid @RequestBody FranquiciaUpdateDto franquiciaUpdateDto){
        Franquicia dbResponse = franquiciaService.update(franquiciaUpdateDto);
        return ResponseEntity.ok(FranquiciaMapper.INSTANCE.toGetDTO(dbResponse));
    }
}
