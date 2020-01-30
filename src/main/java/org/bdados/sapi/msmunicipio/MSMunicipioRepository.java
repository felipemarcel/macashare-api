package org.bdados.sapi.msmunicipio;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MSMunicipioRepository extends MongoRepository<MSMunicipio, String> {
}
