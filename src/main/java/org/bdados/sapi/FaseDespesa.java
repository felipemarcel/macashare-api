package org.bdados.sapi;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.Indexed;

import java.time.LocalDateTime;

@Data
public class FaseDespesa {

    @Field(value = "documento")
    @Indexed(name = "documento", type = "string")
    @JsonProperty(value = "documento")
    private String documento;

    @Field(value = "data._date")
    private LocalDateTime data;

    @Indexed(name = "tipo", type = "string")
    private String tipo;

    @Indexed(name = "registro", type = "string")
    private String registro;

    @Indexed(name = "valor", type = "string")
    private String valor;

    public FaseDespesa() {
    }

    public FaseDespesa(String documento, LocalDateTime data, String tipo, String registro, String valor) {
        this.documento = documento;
        this.data = data;
        this.tipo = tipo;
        this.registro = registro;
        this.valor = valor;
    }
}
