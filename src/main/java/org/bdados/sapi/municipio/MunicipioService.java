package org.bdados.sapi.municipio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MunicipioService {
    @Autowired
    private MunicipioRepository repository;

    public List<Municipio> findAll() {
        return repository.findAll();
    }
}
