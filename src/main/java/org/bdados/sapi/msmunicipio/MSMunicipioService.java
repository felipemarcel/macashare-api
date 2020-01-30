package org.bdados.sapi.msmunicipio;

import org.bdados.sapi.metricas.Metrica;
import org.bdados.sapi.metricas.MetricaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MSMunicipioService {

    @Autowired
    private MSMunicipioRepository repository;

    @Autowired
    private MetricaService metricaService;

    public List<MSMunicipio> findAll() {
        return repository.findAll();
    }

    public List<Metrica> findBy(String codMunicipio) {
        return metricaService.findAllBy(codMunicipio);
    }
}
