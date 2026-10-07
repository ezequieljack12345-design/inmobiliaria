package com.example.inmobiliaria.controller;

import com.example.inmobiliaria.entity.Piso;
import jakarta.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RestPisoController {

    private List<Piso> pisoList;

    @PostConstruct
    public void loadData() {
        pisoList = new ArrayList<>();
        pisoList.add(new Piso((short) 1, "A", 80.0f, "CODE1", "Disponible"));
        pisoList.add(new Piso((short) 1, "B", 110.28f, "CODE2", "Ocupado"));
        pisoList.add(new Piso((short) 2, "A", 80.0f, "CODE3", "Disponible"));
        pisoList.add(new Piso((short) 2, "B", 110.28f, "CODE4", "Disponible"));
    }

    @GetMapping("/pisos")
    public List<Piso> listPisos() {
        return pisoList;    
    }

    @GetMapping("/pisos/{numeroPiso}/{puerta}")
    public Piso getPiso(@PathVariable("numeroPiso") short numeroPiso,
            @PathVariable("puerta") String puerta) {
        for (Piso piso : this.pisoList) {
            if (piso.getNumeroPiso() == numeroPiso && puerta.equals(piso.getPuerta())) {
                return piso;    
            }
        }
        return null;
    }

    @PostMapping("/pisos")
    public Piso addPiso(@RequestBody Piso thePiso) {
        this.pisoList.add(thePiso);
        return thePiso;
    }

    @PutMapping("/pisos/{numeroPiso}/{puerta}")
    public Piso updatePiso(@PathVariable("numeroPiso") short numeroPiso,
            @PathVariable("puerta") String puerta,
            @RequestBody Piso thePiso) {
        for (Piso piso : pisoList) {
            if (piso.getNumeroPiso() == numeroPiso && puerta.equals(piso.getPuerta())) {
                piso.setSuperficie(thePiso.getSuperficie());
                piso.setCodigoCatastral(thePiso.getCodigoCatastral());
                piso.setEstadoDeUso(thePiso.getEstadoDeUso());
                return piso;
            }
        }
        return null;
    }

    @DeleteMapping("/pisos/{numeroPiso}/{puerta}")
    public String deletePiso(@PathVariable("numeroPiso") short numeroPiso,
            @PathVariable("puerta") String puerta) {
        boolean deleted = pisoList.removeIf(
                piso -> piso.getNumeroPiso() == numeroPiso && puerta.equals(piso.getPuerta()));
        if (deleted) {
            return "El piso " + numeroPiso + ", puerta " + puerta + " ha sido eliminado.";
        }
        return "El piso " + numeroPiso + ", puerta " + puerta + " no fue encontrado.";
    }
}
