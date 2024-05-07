package com.softtek.Mayo07.Servicio;

import com.softtek.Mayo07.Modelo.Producto;
import com.softtek.Mayo07.Repositorio.IGenericoRepositorio;
import com.softtek.Mayo07.Repositorio.IProductoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoServicio extends CRUDImp<Producto, Integer> implements IProductoServicio{
    @Autowired
    private IProductoRepositorio repo;

    @Override
    protected IGenericoRepositorio<Producto, Integer> getRepo() {
        return repo;
    }

}
