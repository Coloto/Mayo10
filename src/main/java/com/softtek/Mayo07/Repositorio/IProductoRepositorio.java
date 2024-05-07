package com.softtek.Mayo07.Repositorio;

import com.softtek.Mayo07.Modelo.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductoRepositorio extends JpaRepository<Producto, Integer> {
}
