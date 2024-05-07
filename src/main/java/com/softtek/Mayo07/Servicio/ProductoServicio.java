package com.softtek.Mayo07.Servicio;

import com.softtek.Mayo07.Modelo.Producto;
import com.softtek.Mayo07.Repositorio.IProductoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServicio implements IProductoServicio{
    @Autowired
    IProductoRepositorio productoRepositorio;

    @Override
    public Producto insertar(Producto p) {
        return productoRepositorio.save(p);
    }

    @Override
    public Producto modificar(Producto p) {
        return productoRepositorio.save(p);
    }

    @Override
    public void eliminar(int id_producto) {
        productoRepositorio.deleteById(id_producto);
    }

    @Override
    public List<Producto> obtenerTodos() {
        return productoRepositorio.findAll();
    }

    @Override
    public Producto obtenerUno(int id_producto) {
        return productoRepositorio.findById(id_producto).orElse(null);
    }
}
