package org.bdados.sapi.empenho;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.data.solr.core.query.*;
import org.springframework.data.solr.core.query.result.ScoredPage;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;


@Service
public class EmpenhoService {

    @Autowired
    private EmpenhoRepository repository;


    @Autowired
    private SolrTemplate solrTemplate;

    public List<NotasEmpenho> findBy(String cidade, String dataInicio, String dataFim, String termoDeBusca) {

        Query query = new SimpleQuery(Criteria.WILDCARD);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");


        if (cidade != null) {
            query.addCriteria(Criteria.where("tce_municipio_id._oid").is(cidade));
        }

        if (dataFim != null) {
            query.addCriteria(new Criteria("data_emissao._date").lessThanEqual(LocalDate.parse(dataFim, formatter).atStartOfDay().format(DateTimeFormatter.ISO_DATE_TIME) + "Z"));
        }

        if (termoDeBusca != null) {
            FilterQuery filter = new SimpleFilterQuery(new Criteria("descricao_empenho").contains(termoDeBusca.split(" ")));
            query.addFilterQuery(filter);
        }

        if (dataInicio != null) {
            query.addCriteria(new Criteria("data_emissao._date").greaterThanEqual(LocalDate.parse(dataInicio, formatter).atStartOfDay().format(DateTimeFormatter.ISO_DATE_TIME) + "Z"));
        }

//        return solrTemplate.queryForPage("portais_ne", query, NotasEmpenho.class);
        return repository.findBy(termoDeBusca);
    }

    public NotasEmpenho findBy(String id) {
        return repository.findById(id).orElseThrow(RuntimeException::new);
    }
}
