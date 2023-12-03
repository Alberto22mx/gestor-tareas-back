package com.tareas.gestor.enums;

import jakarta.persistence.Table;

@Table(name = "tipo")
public enum ProcesoEstado {
    PENDIENTE,
    ENPROCESO,
    COMPLETADO
}
