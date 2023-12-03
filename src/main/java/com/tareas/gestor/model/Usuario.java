package com.tareas.gestor.model;

import com.tareas.gestor.enums.ProcesoEstado;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private String usuario;
    private String password;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private int activo;
}
