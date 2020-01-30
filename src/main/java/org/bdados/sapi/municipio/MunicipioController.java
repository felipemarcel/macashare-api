package org.bdados.sapi.municipio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping("/tce-municipios")
public class MunicipioController {

    @Autowired
    private MunicipioService service;

    @GetMapping
    public ResponseEntity<?> findAll() {
        return ok(service.findAll());
    }

}
