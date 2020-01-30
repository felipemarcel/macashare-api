package org.bdados.sapi.metricas;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;


@Data
@Document(collection = "ms_metricas")
public class Metrica {

    @Id
    private String id;

    @Field("unidade_gestora")
    private Integer unidadeGestora;

    @Field("data_emissao")
    private LocalDateTime dataEmissao;

    @Field("num_empenho")
    private Integer numEmpenho;

    @Field("valor_empenho")
    private Integer valorEmpenho;

    @Field("cod_elemento_despesa")
    private Integer codElementoDespesa;

    @Field("desc_despesa")
    private Integer descDespesa;

    private Integer credor;

    @Field("cpf_cnpj")
    private Integer cpfCnpj;

    @Field("desc_empenho")
    private Integer descEmpenho;

    private Integer gestor;

    @Field("permite_download")
    private Boolean permiteDownload;

    @Field("contem_api")
    private Integer contemApi;

    @Field("ms_cod_municipio")
    private String codMunicipio;

    public Metrica() {
    }

    public Metrica(String codMunicipio, Integer unidadeGestora, LocalDateTime dataEmissao, Integer numEmpenho, Integer valorEmpenho, Integer codElementoDespesa, Integer descDespesa, Integer credor, Integer cpfCnpj, Integer descEmpenho, Integer gestor, Boolean permiteDownload, Integer contemApi) {
        this.codMunicipio = codMunicipio;
        this.unidadeGestora = unidadeGestora;
        this.dataEmissao = dataEmissao;
        this.numEmpenho = numEmpenho;
        this.valorEmpenho = valorEmpenho;
        this.codElementoDespesa = codElementoDespesa;
        this.descDespesa = descDespesa;
        this.credor = credor;
        this.cpfCnpj = cpfCnpj;
        this.descEmpenho = descEmpenho;
        this.gestor = gestor;
        this.permiteDownload = permiteDownload;
        this.contemApi = contemApi;
    }
}
