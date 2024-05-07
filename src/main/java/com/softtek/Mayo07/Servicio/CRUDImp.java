package com.softtek.Mayo07.Servicio;

import com.softtek.Mayo07.Repositorio.IGenericoRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public abstract class CRUDImp<T, ID> implements ICRUD<T,ID>{
    protected abstract IGenericoRepositorio<T, ID> getRepo();

    @Override
    public T crear(T t) {
        return getRepo().save(t);
    }

    @Override
    public T modificar(T t) {
        return getRepo().save(t);
    }

    @Override
    public void eliminar(ID id) {
        getRepo().deleteById(id);
    }

    @Override
    public T consultaUno(ID id) {
        return getRepo().findById(id).orElse(null);
    }

    @Override
    public List<T> consultaTodos() {
        return getRepo().findAll();
    }
}
