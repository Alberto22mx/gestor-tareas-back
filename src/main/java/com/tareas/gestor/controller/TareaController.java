package com.tareas.gestor.controller;

import com.tareas.gestor.model.Tarea;
import com.tareas.gestor.service.TareaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TareaController {
    @Autowired
    TareaService tareaService;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/tarea")
    private List<Tarea> getTarea() {
        return tareaService.getAllTarea();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/tarea")
    private void postTarea(@RequestBody Tarea tarea) { tareaService.postTarea(tarea); }

    @CrossOrigin(origins = "http://localhost:4200")
    @PutMapping("/tarea")
    private void updateUsuario(@RequestBody Tarea tarea) { tareaService.postTarea(tarea); }

    @CrossOrigin(origins = "http://localhost:4200")
    @DeleteMapping("/tarea/{id}")
    private void deleteUsuario(@PathVariable("id") Long id) { tareaService.deleteTarea(id); }
}
