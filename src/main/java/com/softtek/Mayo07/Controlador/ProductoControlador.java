package com.softtek.Mayo07.Controlador;

import com.softtek.Mayo07.Modelo.Producto;
import com.softtek.Mayo07.Repositorio.IProductoRepositorio;
import com.softtek.Mayo07.Servicio.ProductoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoControlador {
    @Autowired
    ProductoServicio productoServicio;

    @GetMapping
    public List<Producto> AllProductos(){
        return productoServicio.obtenerTodos();
    }

    @GetMapping("/{id}")
    public Producto productoById(@PathVariable int id){
        return productoServicio.obtenerUno(id);
    }

    @PostMapping
    public Producto insertProducto(@RequestBody Producto p){
        return productoServicio.insertar(p);
    }

    @PutMapping
    public Producto updateProducto(@RequestBody Producto p){
        return productoServicio.modificar(p);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable int id){
        productoServicio.eliminar(id);
    }
}
