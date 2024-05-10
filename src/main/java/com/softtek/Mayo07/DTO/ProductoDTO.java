package com.softtek.Mayo07.DTO;

import com.softtek.Mayo07.Modelo.Producto;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ProductoDTO {
    private int id_producto;
    @NotEmpty
    @Size(min = 3,max = 30)
    private String nombre_producto;
    @NotNull
    private int stock;
    @NotNull
    private double precio_unitario;

    public Producto castProducto(){
        Producto p1 = new Producto();
        p1.setId_producto(id_producto);
        p1.setNombre_producto(nombre_producto);
        p1.setStock(stock);
        p1.setPrecio_unitario(precio_unitario);
        return p1;
    }

    public ProductoDTO castProductoADto (Producto p){
        id_producto = p.getId_producto();
        nombre_producto = p.getNombre_producto();
        stock = p.getStock();
        precio_unitario = p.getPrecio_unitario();
        return this;
    }
}
