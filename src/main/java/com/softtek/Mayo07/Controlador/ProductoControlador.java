package com.softtek.Mayo07.Controlador;

import com.softtek.Mayo07.DTO.ProductoDTO;
import com.softtek.Mayo07.Excepciones.ExcepcionPersonalizadaNoEncontrada;
import com.softtek.Mayo07.Modelo.Producto;
import com.softtek.Mayo07.Servicio.ProductoServicio;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoControlador {
    @Autowired
    ProductoServicio productoServicio;

    @GetMapping
    public ResponseEntity<List<ProductoDTO>> consultaTodos(){
        List<Producto> productos = productoServicio.consultaTodos();
        List<ProductoDTO> productosDTO = new ArrayList<>();
        for (Producto producto : productos) {
            ProductoDTO pDto = new ProductoDTO();
            productosDTO.add(pDto.castProductoADto(producto));
        }
        return new ResponseEntity<>(productosDTO, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductoDTO> consultaUno(@PathVariable int id){
        Producto p1 = productoServicio.consultaUno(id);
        if(p1 == null){
            throw new ExcepcionPersonalizadaNoEncontrada("Producto no encontrado " + id);
        }
        return new ResponseEntity<>(new ProductoDTO().castProductoADto(p1), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<ProductoDTO> crear(@Valid @RequestBody ProductoDTO p){
        Producto p1 = p.castProducto();
        p1 = productoServicio.crear(p1);
        return new ResponseEntity<>(p.castProductoADto(p1), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<ProductoDTO> modificar(@Valid @RequestBody ProductoDTO p){
        Producto p1 = productoServicio.consultaUno(p.getId_producto());
        if (p1==null){
            throw new ExcepcionPersonalizadaNoEncontrada("Producto no encontrado " + p.getId_producto());
        }
        p1 = productoServicio.modificar(p.castProducto());
        return new ResponseEntity<>(p.castProductoADto(p1), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable int id){
        Producto p1 = productoServicio.consultaUno(id);
        if (p1==null){
            throw new ExcepcionPersonalizadaNoEncontrada("Producto no encontrado " + id);
        }
        productoServicio.eliminar(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
