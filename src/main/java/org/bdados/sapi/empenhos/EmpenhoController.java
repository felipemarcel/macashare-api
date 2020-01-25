package org.bdados.sapi.empenhos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping("/notas-de-empenho")
public class EmpenhoController {

    @Autowired
    private EmpenhoRepository repository;

    @GetMapping
    private ResponseEntity<?> find() {
        return ok(repository.findAll());
    }

}
