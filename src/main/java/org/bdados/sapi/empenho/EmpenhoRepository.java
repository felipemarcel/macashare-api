package org.bdados.sapi.empenho;

import org.springframework.data.solr.repository.SolrCrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmpenhoRepository extends SolrCrudRepository<NotasEmpenho, String> {

    public Iterable<NotasEmpenho> findAll();
}
