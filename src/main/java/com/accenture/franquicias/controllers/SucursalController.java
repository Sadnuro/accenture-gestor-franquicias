package com.accenture.franquicias.controllers;

import com.accenture.franquicias.models.dto.SucursalCreateDto;
import com.accenture.franquicias.models.dto.SucursalGetDto;
import com.accenture.franquicias.models.entity.Franquicia;
import com.accenture.franquicias.models.entity.Sucursal;
import com.accenture.franquicias.models.mapper.SucursalMapper;
import com.accenture.franquicias.services.IFranquiciaService;
import com.accenture.franquicias.services.ISucursalService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping({"/api/sucursal", "/api/sucursal/"})
public class SucursalController {
    @Autowired
    ISucursalService sucursalService;
    @Autowired
    IFranquiciaService franquiciaService;

    @GetMapping
    public List<SucursalGetDto> getAllSucursales(){
        List<Sucursal> listaEntity =  sucursalService.getAll();
        return SucursalMapper.INSTANCE.toGetDTOList(listaEntity);
    }
    @GetMapping({"{idSucursal}"})
    public SucursalGetDto getFranquicia(@Valid @PathVariable("idSucursal") Integer id){
        Sucursal sucursal =  sucursalService.getById(id);
        System.out.println("dbresponse: "+ sucursal);
        return SucursalMapper.INSTANCE.toGetDTO(sucursal);
    }
    @PostMapping
    public ResponseEntity<Object> createOne(@Valid @RequestBody SucursalCreateDto sucursalDto){
        // Verifica existencia de Franquicia. Si no existe devuelve NotFoundException
        Franquicia franquicia = franquiciaService.getById(sucursalDto.getIdFranquicia());
        System.out.println("Existe franquicia:" + franquicia.toString());
        Sucursal dbResponse = sucursalService.createOne(sucursalDto);
        return ResponseEntity.ok(SucursalMapper.INSTANCE.toGetDTO(dbResponse));
    }
}
