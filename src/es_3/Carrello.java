package es_3;

import java.util.ArrayList;
import java.util.List;

public class Carrello {
    private Cliente clienteAssociato;
    private List<Articolo> elencoArticoli;
    private double totaleCostoArticoli;

    public Carrello(Cliente clienteAssociato) {
        this.clienteAssociato = clienteAssociato;
        this.elencoArticoli = new ArrayList<>();
        this.totaleCostoArticoli = 0.0;
    }

    public Cliente getClienteAssociato() {
        return clienteAssociato;
    }

    public List<Articolo> getElencoArticoli() {
        return elencoArticoli;
    }

    public double getTotaleCostoArticoli() {
        return totaleCostoArticoli;
    }

    public void aggiungiArticolo(Articolo articolo) {
        elencoArticoli.add(articolo);
        totaleCostoArticoli += articolo.getPrezzo();
    }

    public void rimuoviArticolo(Articolo articolo) {
        elencoArticoli.remove(articolo);
        totaleCostoArticoli -= articolo.getPrezzo();
    }

    public void svuotaCarrello() {
        elencoArticoli.clear();
        totaleCostoArticoli = 0.0;
    }
}
