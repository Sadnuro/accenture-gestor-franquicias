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
    public ResponseEntity<List<FranquiciaGetDto>> getAllFranquicias() {
        List<Franquicia> listaEntity = franquiciaService.getAll();
        return ResponseEntity.ok(FranquiciaMapper.INSTANCE.toGetDTOList(listaEntity));
    }

    @GetMapping({"{idFranquicia}"})
    public ResponseEntity<FranquiciaGetDto> getFranquicia(@Valid @PathVariable Integer idFranquicia) {
        Franquicia franquicia = franquiciaService.getById(idFranquicia);
        return ResponseEntity.ok(FranquiciaMapper.INSTANCE.toGetDTO(franquicia));
    }
    @PostMapping
    public ResponseEntity<FranquiciaGetDto> createOne(@Valid @RequestBody FranquiciaCreateDto franquiciaCreateDto) {
        Franquicia dbResponse = franquiciaService.createOne(franquiciaCreateDto);
        return ResponseEntity.ok(FranquiciaMapper.INSTANCE.toGetDTO(dbResponse));
    }

    @PatchMapping
    public ResponseEntity<FranquiciaGetDto> updateOne(@Valid @RequestBody FranquiciaUpdateDto franquiciaUpdateDto) {
        Franquicia dbResponse = franquiciaService.update(franquiciaUpdateDto);
        return ResponseEntity.ok(FranquiciaMapper.INSTANCE.toGetDTO(dbResponse));
    }

//    @DeleteMapping("/{idFranquicia}")
//    public ResponseEntity<Void> delete(@PathVariable Integer idFranquicia) {
//        franquiciaService.delete(idFranquicia);
//        return ResponseEntity.noContent().build();
//    }
}
