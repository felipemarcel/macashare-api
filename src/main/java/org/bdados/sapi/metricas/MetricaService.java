package org.bdados.sapi.metricas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MetricaService {

    @Autowired
    private MetricaRepository repository;

    public List<Metrica> findAllBy(String codMunicipio) {
        return repository.findAllByCodMunicipio(codMunicipio);
    }

}
