package es_3;

import java.time.LocalDate;

public class Cliente {
    private String codiceCliente;
    private String nomeCognome;
    private String email;
    private LocalDate dataIscrizione;

    public Cliente(String codiceCliente, String nomeCognome, String email, LocalDate dataIscrizione) {
        this.codiceCliente = codiceCliente;
        this.nomeCognome = nomeCognome;
        this.email = email;
        this.dataIscrizione = dataIscrizione;
    }

    public String getCodiceCliente() {
        return codiceCliente;
    }

    public String getNomeCognome() {
        return nomeCognome;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getDataIscrizione() {
        return dataIscrizione;
    }
}
