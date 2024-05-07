package com.softtek.Mayo07.Servicio;

import com.softtek.Mayo07.Modelo.Producto;

import java.util.List;

public interface IProductoServicio {
    Producto insertar(Producto p);
    Producto modificar(Producto p);

    void eliminar(int id_producto);
    List<Producto> obtenerTodos();

    Producto obtenerUno(int id_producto);
}
