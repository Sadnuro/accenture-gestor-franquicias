package com.accenture.franquicias.controllers;

import com.accenture.franquicias.models.dto.*;
import com.accenture.franquicias.models.entity.Franquicia;
import com.accenture.franquicias.models.entity.Sucursal;
import com.accenture.franquicias.models.mapper.FranquiciaMapper;
import com.accenture.franquicias.models.mapper.SucursalMapper;
import com.accenture.franquicias.services.IFranquiciaService;
import com.accenture.franquicias.services.IProductoService;
import com.accenture.franquicias.services.ISucursalService;
import io.swagger.v3.oas.annotations.Operation;
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
    @Autowired
    IProductoService productoService;

    @Operation(summary = "Obtener todas las sucursales", description = "Devuelve una lista con todas las sucursales registradas")
    @GetMapping
    public List<SucursalGetDto> getAllSucursales(){
        List<Sucursal> listaEntity =  sucursalService.getAll();
        return SucursalMapper.INSTANCE.toGetDTOList(listaEntity);
    }

    @Operation(summary = "Buscar sucursal por ID", description = "Devuelve una sucursal según su ID")
    @GetMapping({"{idSucursal}"})
    public SucursalGetDto getFranquicia(@Valid @PathVariable("idSucursal") Integer id){
        Sucursal sucursal =  sucursalService.getById(id);
        SucursalGetDto sucursalGetDto = SucursalMapper.INSTANCE.toGetDTO(sucursal);
        sucursalGetDto.setProductos(productoService.getByIdSucursal(id));
        return sucursalGetDto;
    }

    @Operation(summary = "Crear una sucursal", description = "Crea una sucursal para la franquicia asociada y con el nombre proporcionado")
    @PostMapping
    public ResponseEntity<Object> createOne(@Valid @RequestBody SucursalCreateDto sucursalDto){
        // Verifica existencia de Franquicia. Si no existe devuelve NotFoundException
        Franquicia franquicia = franquiciaService.getById(sucursalDto.getIdFranquicia());
        System.out.println("Existe franquicia:" + franquicia.toString());
        Sucursal dbResponse = sucursalService.createOne(sucursalDto);
        return ResponseEntity.ok(SucursalMapper.INSTANCE.toGetDTO(dbResponse));
    }

    @Operation(summary = "Actualizar una sucursal", description = "Modifica el nombre de una sucursal existente")
    @PatchMapping
    public ResponseEntity<SucursalGetDto> updateOne(@Valid
                                                      @RequestBody SucursalUpdateDto sucursalUpdateDto) {
        Sucursal dbResponse = sucursalService.update(sucursalUpdateDto);
        return ResponseEntity.ok(SucursalMapper.INSTANCE.toGetDTO(dbResponse));
    }
}
