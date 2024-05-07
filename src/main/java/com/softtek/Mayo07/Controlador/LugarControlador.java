package com.softtek.Mayo07.Controlador;

import com.softtek.Mayo07.Modelo.Lugar;
import com.softtek.Mayo07.Modelo.Producto;
import com.softtek.Mayo07.Servicio.LugarServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lugares")
public class LugarControlador {
    @Autowired
    LugarServicio lugarServicio;

    @GetMapping
    public List<Lugar> consultaTodos(){
        return lugarServicio.consultaTodos();
    }

    @GetMapping("/{id}")
    public Lugar consultaUno(@PathVariable int id){
        return lugarServicio.consultaUno(id);
    }

    @PostMapping
    public Lugar crear(@RequestBody Lugar l){
        return lugarServicio.crear(l);
    }

    @PutMapping
    public Lugar modificar(@RequestBody Lugar l){
        return lugarServicio.modificar(l);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable int id){
        lugarServicio.eliminar(id);
    }
}
