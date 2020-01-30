package org.bdados.sapi.msmunicipio;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping("/municipios")
public class MSMunicipioController {

    @Autowired
    private MSMunicipioService service;

    @GetMapping
    public ResponseEntity<?> findAll() {
        return ok(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findBy(@PathVariable String id) {
        return ok(service.findBy(id));
    }

    @GetMapping("/{codMunicipio}/metricas")
    public ResponseEntity<?> findByCodMunicipio(@PathVariable String codMunicipio) {
        return ok(service.findBy(codMunicipio));
    }
}
