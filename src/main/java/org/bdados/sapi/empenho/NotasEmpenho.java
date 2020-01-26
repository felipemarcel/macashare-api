package org.bdados.sapi.empenho;

import lombok.Data;
import org.apache.solr.client.solrj.beans.Field;
import org.bdados.sapi.FaseDespesa;
import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.Indexed;
import org.springframework.data.solr.core.mapping.SolrDocument;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@Data
@SolrDocument(collection = "portais_ne")
public class NotasEmpenho {

    @Id
    @Indexed(name = "id", type = "string")
    private String _id;

    @Field(value = "num_empenho")
    @Indexed(name = "num_empenho", type = "string")
    private String numEmpenho;

    @Indexed(name = "data_emissao", type = "string")
    @Field(value = "data_emissao._date")
    private LocalDateTime dataEmissao;

    @Field(value = "fases_despesa.documento")
    private List<String> fasesDespesaDoc;

    @Indexed(name = "tipo", type = "string")
    private String tipo;

    @Indexed(name = "credor", type = "string")
    private String credor;

    @Indexed(name = "cpf_cnpj", type = "string")
    @Field(value = "cpf_cnpj")
    private String cpfCnpj;

    private String modalidade;

    @Field(value = "numero_da_licitacao")
    private String numeroLicitacao;

    @Indexed(name = "unidade_orcamentaria", type = "string")
    @Field(value = "unidade_orcamentaria")
    private String unidadeOrcamentaria;

    private String funcao;

    @Field(value = "subfuncao")
    private String subFuncao;

    @Indexed(name = "program_governo", type = "string")
    @Field(value = "programa_governo")
    private String programaGoverno;

    @Indexed(name = "projeto_atividade", type = "string")
    @Field(value = "projeto_atividade")
    private String projetoAtvidade;

    @Indexed(name = "fonte_recurso", type = "string")
    @Field(value = "fonte_recurso")
    private String fonteRecurso;

    @Indexed(name = "descricao_empenho", type = "string")
    @Field(value = "descricao_empenho")
    private String descricaoEmpenho;

    @Indexed(name = "tipo_natureza", type = "string")
    @Field(value = "tipo_natureza")
    private String tipoNatureza;

    @Field(value = "fases_despesa.*")
    private List<String> fasesDespesa;

    @Field(value = "data_atualizacao._date")
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

    @Field(value = "tce_municipio_id._oid")
    private String tceMunicipioId;

    public NotasEmpenho() {
    }

    public NotasEmpenho(String _id, String numEmpenho, LocalDateTime dataEmissao, String tipo, String credor, String cpfCnpj, String modalidade, String numeroLicitacao, String unidadeOrcamentaria, String funcao, String subFuncao, String programaGoverno, String projetoAtvidade, String fonteRecurso, String descricaoEmpenho, String tipoNatureza, List<String> fasesDespesa, String dataAtualizacao, String urlDespesa, String cdMunicipio, String codigoElementoDespesa, String descricaoNaturezaDespesa, String valorEmpenho, String tceMunicipioId, List<String> fasesDespesaDoc) {
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
        this.fasesDespesaDoc = fasesDespesaDoc;
    }
}
