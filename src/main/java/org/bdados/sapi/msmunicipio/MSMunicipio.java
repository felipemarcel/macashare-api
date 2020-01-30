package org.bdados.sapi.msmunicipio;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document(collection = "ms_municipios")
public class MSMunicipio {

    @Id
    private String _id;

    @Field(value = "capital")
    private Boolean isCapital;

    @Field(value = "ms_cd_municipio")
    private String codMSMunicipio;

    @Field(value = "nome")
    private String nome;

    @Field(value = "codigo_uf")
    private String codUF;

    public MSMunicipio() {
    }

    public MSMunicipio(Boolean isCapital, String codMSMunicipio, String nome, String codUF) {
        this.isCapital = isCapital;
        this.codMSMunicipio = codMSMunicipio;
        this.nome = nome;
        this.codUF = codUF;
    }
}
