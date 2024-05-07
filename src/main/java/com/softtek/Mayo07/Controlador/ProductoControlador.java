package com.softtek.Mayo07.Controlador;

import com.softtek.Mayo07.Modelo.Producto;
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
    public List<Producto> consultaTodos(){
        return productoServicio.consultaTodos();
    }

    @GetMapping("/{id}")
    public Producto consultaUno(@PathVariable int id){
        return productoServicio.consultaUno(id);
    }

    @PostMapping
    public Producto crear(@RequestBody Producto p){
        return productoServicio.crear(p);
    }

    @PutMapping
    public Producto modificar(@RequestBody Producto p){
        return productoServicio.modificar(p);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable int id){
        productoServicio.eliminar(id);
    }
}
