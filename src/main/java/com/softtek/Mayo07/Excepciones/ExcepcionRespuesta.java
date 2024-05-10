package com.softtek.Mayo07.Excepciones;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ExcepcionRespuesta {
    private LocalDateTime fechaHora;
    private String mensaje;
    private String descripcion;
}
