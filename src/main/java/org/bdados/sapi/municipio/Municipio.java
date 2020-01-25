package org.bdados.sapi.municipio;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document(collection = "tces_municipios")
public class Municipio {

    @Id
    private String _id;

    @Field(value = "codigo_municipio")
    private String codigoMunicipio;

    @Field(value = "nome_municipio")
    private String nome;

    private String geoibgeId;

    public Municipio() {
    }

    public Municipio(String _id, String codigoMunicipio, String nome, String geoibgeId) {
        this._id = _id;
        this.codigoMunicipio = codigoMunicipio;
        this.nome = nome;
        this.geoibgeId = geoibgeId;
    }
}
