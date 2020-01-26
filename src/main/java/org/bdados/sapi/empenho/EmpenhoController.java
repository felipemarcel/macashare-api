package org.bdados.sapi.empenho;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotEmpty;
import java.time.LocalDateTime;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping("/notas-de-empenho")
public class EmpenhoController {

    @Autowired
    private EmpenhoService service;

    @GetMapping
    //ct -> cidade
    //sd -> start date
    //ed -> end date
    //q -> search term
    private ResponseEntity<?> findBy(@RequestParam(value = "ct", required = false) @NotEmpty String cidade,
                                     @RequestParam(value = "sd", required = false) String dataInicio,
                                     @RequestParam(value = "ed", required = false) String dataFim,
                                     @RequestParam(value = "q", required = false) String termoDeBusca) {
        return ok(service.findBy(cidade, dataInicio, dataFim, termoDeBusca));
    }

    @GetMapping("/{id}")
    private ResponseEntity<?> findBy(@PathVariable String id) {
        return ok(service.findBy(id));
    }

}
