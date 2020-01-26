package org.bdados.sapi.metricas;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


//@Document(collection = "portais_scre")
@Data
public class Metrica {

    private String municipioID;
    //sao gonçalo do amarante
    //Aratuba
    //Aracati
    //Paracuru
    private Integer notaGestor;
    private String municipio;
    private Integer dataDespesa;
    private Integer numeroPagamentoEmpenho;
    private Integer classificacaoOrcamentaria;
    private Integer identificacaoCredor;

    @JsonCreator
    public Metrica(String municipioID, Integer notaGestor, String municipio, Integer dataDespesa, Integer numeroPagamentoEmpenho, Integer classificacaoOrcamentaria, Integer identificacaoCredor) {
        this.municipioID = municipioID;
        this.notaGestor = notaGestor;
        this.municipio = municipio;
        this.dataDespesa = dataDespesa;
        this.numeroPagamentoEmpenho = numeroPagamentoEmpenho;
        this.classificacaoOrcamentaria = classificacaoOrcamentaria;
        this.identificacaoCredor = identificacaoCredor;
    }
}
