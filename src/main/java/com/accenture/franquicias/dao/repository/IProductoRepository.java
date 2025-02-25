package com.accenture.franquicias.dao.repository;

import com.accenture.franquicias.models.dto.ProductoFranquiciaSucursalGetDto;
import com.accenture.franquicias.models.entity.Producto;
import com.accenture.franquicias.models.entity.Sucursal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface IProductoRepository extends JpaRepository<Producto, Integer> {
    Optional<List<Producto>> findByIdSucursal(Integer idSucursal);

    @Query(value="SELECT f.id_franquicia, f.nombre_franquicia, " +
        "s.id_sucursal, s.nombre_sucursal, " +
        "p.id_producto, p.nombre_producto, p.stock " +
        "FROM productos p " +
        "JOIN sucursales s ON p.id_sucursal = s.id_sucursal " +
        "JOIN franquicias f ON s.id_franquicia = f.id_franquicia " +
        "WHERE f.id_franquicia = :idFranquicia " +
        "AND p.stock = ( SELECT MAX(p2.stock) FROM productos p2 WHERE p2.id_sucursal = p.id_sucursal) ",
        nativeQuery = true)
    List<ProductoFranquiciaSucursalGetDto> findMaxStockProductsByFranquicia(@Param("idFranquicia") int idFranquicia);
}
