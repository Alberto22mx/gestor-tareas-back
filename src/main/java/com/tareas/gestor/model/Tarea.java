package com.tareas.gestor.model;

import com.tareas.gestor.enums.ProcesoEstado;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Tarea {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private String titulo;
    private String descripcion;
    private Date fechaCreacion;
    @Enumerated(EnumType.STRING)
    @Column(name = "estado")
    private ProcesoEstado estado;
}
