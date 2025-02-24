package com.accenture.franquicias.controllers;

import com.accenture.franquicias.models.dto.*;
import com.accenture.franquicias.models.entity.Producto;
import com.accenture.franquicias.models.entity.Sucursal;
import com.accenture.franquicias.models.mapper.ProductoMapper;
import com.accenture.franquicias.models.mapper.SucursalMapper;
import com.accenture.franquicias.services.IProductoService;
import com.accenture.franquicias.services.ISucursalService;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping({"/api/producto", "/api/producto/"})
public class ProductoController {
    @Autowired
    IProductoService productoService;
    @Autowired
    ISucursalService sucursalService;

    @Operation(summary = "Obtener todos los productos", description = "Devuelve una lista con todos los productos registradas")
    @GetMapping
    public List<ProductoGetDto> getAllProductos(){
        List<Producto> listaEntity =  productoService.getAll();
        return ProductoMapper.INSTANCE.toGetDTOList(listaEntity);
    }

    @Operation(summary = "Buscar producto por ID", description = "Devuelve un producto según su ID")
    @GetMapping({"{idProducto}"})
    public ProductoGetDto getProducto(@Valid @PathVariable("idProducto") Integer id){
        Producto producto =  productoService.getById(id);
        return ProductoMapper.INSTANCE.toGetDTO(producto);
    }

    @Operation(summary = "Crear un producto", description = "Crea un producto para la sucursal asociada y con el nombre y stock proporcionado (por defecto 0)")
    @PostMapping
    public ResponseEntity<Object> createOne(@Valid @RequestBody ProductoCreateDto productoDto){
        // Verifica existencia de Sucursal. Si no existe devuelve NotFoundException
        Sucursal sucursal = sucursalService.getById(productoDto.getIdSucursal());
        Producto dbResponse = productoService.createOne(productoDto);
        return ResponseEntity.ok(ProductoMapper.INSTANCE.toGetDTO(dbResponse));
    }

    @Operation(summary = "Actualizar un producto", description = "Modifica el nombre o stock de un producto")
    @PatchMapping
    public ResponseEntity<ProductoGetDto> updateOne(@Valid
                                                    @RequestBody ProductoUpdateDto productoUpdateDto) {
        Producto dbResponse = productoService.update(productoUpdateDto);
        return ResponseEntity.ok(ProductoMapper.INSTANCE.toGetDTO(dbResponse));
    }

    @DeleteMapping({"{idProducto}"})
    public ResponseEntity<Object> deleteOne(@Valid @PathVariable("idProducto") Integer id){
        productoService.delete(id);
        return ResponseEntity.ok("Producto borrado correctamente");
    }
}
