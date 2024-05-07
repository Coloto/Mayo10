package com.softtek.Mayo07.Modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "Producto")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_producto;
    @Column(length = 30, nullable = false)
    private String nombre_producto;
    @Column(nullable = false)
    private int stock;
    @Column(nullable = false)
    private double precio_unitario;
}
