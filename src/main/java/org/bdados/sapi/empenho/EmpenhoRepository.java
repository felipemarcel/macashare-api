package org.bdados.sapi.empenho;

import org.springframework.data.solr.repository.Query;
import org.springframework.data.solr.repository.SolrCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface EmpenhoRepository extends SolrCrudRepository<NotasEmpenho, String> {

    public Iterable<NotasEmpenho> findAll();

    @Query("descricao_empenho: ?0 or credor: ?0")
    public List<NotasEmpenho> findBy(String termoDeBusca);
}
