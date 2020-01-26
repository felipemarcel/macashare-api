package org.bdados.sapi;

import org.apache.solr.client.solrj.SolrClient;

import static org.apache.solr.client.solrj.impl.HttpSolrClient.Builder;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.data.solr.repository.config.EnableSolrRepositories;

@Configuration
@ComponentScan
@EnableSolrRepositories(basePackages = "org.bdados.sapi")
public class SolrConfig {

    @Bean
    public SolrClient solrClient() {
        return new Builder("http://localhost:8983/solr").build();
    }

    @Bean
    public SolrTemplate solrTemplate(SolrClient client) {
        return new SolrTemplate(client);
    }
}
