package org.bdados.sapi.metricas;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MetricaRepository extends MongoRepository<Metrica, String> {

    List<Metrica> findAllByCodMunicipio(String codMunicipio);

}
