package com.softtek.Mayo07.Servicio;

import com.softtek.Mayo07.Modelo.Lugar;
import com.softtek.Mayo07.Repositorio.IGenericoRepositorio;
import com.softtek.Mayo07.Repositorio.ILugarRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LugarServicio extends CRUDImp<Lugar, Integer> implements ILugarServicio {
    @Autowired
    private ILugarRepositorio repo;

    @Override
    protected IGenericoRepositorio<Lugar, Integer> getRepo() {
        return repo;
    }

}
