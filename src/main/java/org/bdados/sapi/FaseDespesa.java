package org.bdados.sapi;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class FaseDespesa {

    private String documento;
    private LocalDateTime data;
    private String tipo;
    private String registro;
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
