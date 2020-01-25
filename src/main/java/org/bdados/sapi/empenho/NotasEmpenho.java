package org.bdados.sapi.empenho;

import lombok.Data;
import org.apache.solr.client.solrj.beans.Field;
import org.bdados.sapi.FaseDespesa;
import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.Indexed;
import org.springframework.data.solr.core.mapping.SolrDocument;

import java.time.LocalDate;
import java.util.List;

@Data
@SolrDocument(collection = "portais_ne")
public class NotasEmpenho {

    @Id
    @Indexed(name = "id", type = "string")
    private String _id;

    @Field(value = "num_empenho")
    private String numEmpenho;

    @Field(value = "data_emissao")
    private LocalDate dataEmissao;

    private String tipo;

    private String credor;

    @Field(value = "cpf_cnpj")
    private String cpfCnpj;

    private String modalidade;

    @Field(value = "numero_da_licitacao")
    private String numeroLicitacao;

    @Field(value = "unidade_orcamentaria")
    private String unidadeOrcamentaria;

    private String funcao;

    @Field(value = "subfuncao")
    private String subFuncao;

    @Field(value = "programa_governo")
    private String programaGoverno;

    @Field(value = "projeto_atividade")
    private String projetoAtvidade;

    @Field(value = "fonte_recurso")
    private String fonteRecurso;

    @Field(value = "descricao_empenho")
    private String descricaoEmpenho;

    @Field(value = "tipo_natureza")
    private String tipoNatureza;

    @Field(value = "fases_despesa")
    private List<FaseDespesa> fasesDespesa;

    @Field(value = "data_atualizacao")
    private String dataAtualizacao;

    @Field(value = "url_despesa")
    private String urlDespesa;

    @Field(value = "cd_municipio")
    private String cdMunicipio;

    @Field(value = "codigo_elemento_despesa")
    private String codigoElementoDespesa;

    @Field(value = "descricao_natureza_despesa")
    private String descricaoNaturezaDespesa;

    @Field(value = "valor_empenho")
    private String valorEmpenho;

    @Field(value = "tce_municipio_id")
    private String tceMunicipioId;

    public NotasEmpenho() {
    }

    public NotasEmpenho(String _id, String numEmpenho, LocalDate dataEmissao, String tipo, String credor, String cpfCnpj, String modalidade, String numeroLicitacao, String unidadeOrcamentaria, String funcao, String subFuncao, String programaGoverno, String projetoAtvidade, String fonteRecurso, String descricaoEmpenho, String tipoNatureza, List<FaseDespesa> fasesDespesa, String dataAtualizacao, String urlDespesa, String cdMunicipio, String codigoElementoDespesa, String descricaoNaturezaDespesa, String valorEmpenho, String tceMunicipioId) {
        this._id = _id;
        this.numEmpenho = numEmpenho;
        this.dataEmissao = dataEmissao;
        this.tipo = tipo;
        this.credor = credor;
        this.cpfCnpj = cpfCnpj;
        this.modalidade = modalidade;
        this.numeroLicitacao = numeroLicitacao;
        this.unidadeOrcamentaria = unidadeOrcamentaria;
        this.funcao = funcao;
        this.subFuncao = subFuncao;
        this.programaGoverno = programaGoverno;
        this.projetoAtvidade = projetoAtvidade;
        this.fonteRecurso = fonteRecurso;
        this.descricaoEmpenho = descricaoEmpenho;
        this.tipoNatureza = tipoNatureza;
        this.fasesDespesa = fasesDespesa;
        this.dataAtualizacao = dataAtualizacao;
        this.urlDespesa = urlDespesa;
        this.cdMunicipio = cdMunicipio;
        this.codigoElementoDespesa = codigoElementoDespesa;
        this.descricaoNaturezaDespesa = descricaoNaturezaDespesa;
        this.valorEmpenho = valorEmpenho;
        this.tceMunicipioId = tceMunicipioId;
    }
}
