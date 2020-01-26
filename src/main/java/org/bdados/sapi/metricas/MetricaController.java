package org.bdados.sapi.metricas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping("/metricas")
public class MetricaController {

    @Autowired
    private MetricaService service;

    @GetMapping
    private ResponseEntity<?> findAllByMunicipioId(@PathVariable String municipio) {

        Metrica m = new Metrica("21", 4, "Aratuba", 10, 3, 4, 9);
        Metrica m2 = new Metrica("31", 3, "Aracati", 5, 6, 10, 9);
        Metrica m3 = new Metrica("12", 3, "Paracuru", 2, 15, 4, 10);
        Metrica m4 = new Metrica("11", 10, "São Gonçalo do Amarante", 10, 9, 5, 5);

        return ok(Arrays.asList(m, m2, m3, m4));
    }
}
