package com.accenture.franquicias.controllers;

import com.accenture.franquicias.models.dto.FranquiciaCreateDto;
import com.accenture.franquicias.models.dto.FranquiciaGetDto;
import com.accenture.franquicias.models.dto.FranquiciaUpdateDto;
import com.accenture.franquicias.models.entity.Franquicia;
import com.accenture.franquicias.models.mapper.FranquiciaMapper;
import com.accenture.franquicias.services.IFranquiciaService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping({"/api/franquicia/", "/api/franquicia"})
public class FranquiciaController {
    @Autowired
    IFranquiciaService franquiciaService;

    @Operation(summary = "Obtener todas las franquicias", description = "Devuelve una lista con todas las franquicias registradas")
    @GetMapping
    public ResponseEntity<List<FranquiciaGetDto>> getAllFranquicias() {
        List<Franquicia> listaEntity = franquiciaService.getAll();
        return ResponseEntity.ok(FranquiciaMapper.INSTANCE.toGetDTOList(listaEntity));
    }

    @Operation(summary = "Buscar franquicia por ID", description = "Devuelve una franquicia según su ID")
    @GetMapping({"{idFranquicia}"})
    public ResponseEntity<FranquiciaGetDto> getFranquicia(  @Valid
                                                            @Parameter(description = "ID de la franquicia", required = true)
                                                            @PathVariable Integer idFranquicia) {
        Franquicia franquicia = franquiciaService.getById(idFranquicia);
        return ResponseEntity.ok(FranquiciaMapper.INSTANCE.toGetDTO(franquicia));
    }

    @Operation(summary = "Crear una franquicia", description = "Crea una franquicia con el nombre proporcionado y genera un id automaticamente")
    @PostMapping
    public ResponseEntity<FranquiciaGetDto> createOne(@Valid @RequestBody FranquiciaCreateDto franquiciaCreateDto) {
        Franquicia dbResponse = franquiciaService.createOne(franquiciaCreateDto);
        return ResponseEntity.ok(FranquiciaMapper.INSTANCE.toGetDTO(dbResponse));
    }

    @Operation(summary = "Actualizar una franquicia", description = "Modifica el nombre de una franquicia existente")
    @PatchMapping
    public ResponseEntity<FranquiciaGetDto> updateOne(  @Valid
                                                        @RequestBody FranquiciaUpdateDto franquiciaUpdateDto) {
        Franquicia dbResponse = franquiciaService.update(franquiciaUpdateDto);
        return ResponseEntity.ok(FranquiciaMapper.INSTANCE.toGetDTO(dbResponse));
    }

//    @DeleteMapping("/{idFranquicia}")
//    public ResponseEntity<Void> delete(@PathVariable Integer idFranquicia) {
//        franquiciaService.delete(idFranquicia);
//        return ResponseEntity.noContent().build();
//    }
}
