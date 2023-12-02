package com.tareas.gestor.service;

import com.tareas.gestor.model.Tarea;
import com.tareas.gestor.repository.TareaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TareaService {
    @Autowired
    TareaRepository tareaRepository;

    public List<Tarea> getAllTarea() {
        List<Tarea> tareas = new ArrayList<Tarea>();
        tareas.addAll(tareaRepository.findAll());
        return tareas;
    }

    public void postTarea(Tarea tarea) {
        tareaRepository.save(tarea);
    }

    public void updateTarea() {

    }

    public void deleteTarea(Long id) {
        tareaRepository.deleteById(id);
    }
}
