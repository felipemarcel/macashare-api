package org.bdados.sapi.municipio;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MunicipioRepository extends MongoRepository<Municipio, String> {
}
