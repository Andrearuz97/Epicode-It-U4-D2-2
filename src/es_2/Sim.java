package es_2;

import java.util.ArrayList;
import java.util.List;

public class Sim {
    private String numeroTelefono;
    private double credito;
    private List<Chiamata> listaChiamate;

    public Sim(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
        this.credito = 0;
        this.listaChiamate = new ArrayList<>();
    }

    public void effettuaChiamata(String numeroChiamato, int durata) {
        Chiamata chiamata = new Chiamata(numeroChiamato, durata);
        listaChiamate.add(chiamata);
        if (listaChiamate.size() > 5) {
            listaChiamate.remove(0);
        }
    }

    public void aggiornaCredito(double importo) {
        credito += importo;
    }

    public void stampaDatiSim() {
        System.out.println("Numero di telefono: " + numeroTelefono);
        System.out.println("Credito disponibile: " + credito + " euro");

        System.out.println("Ultime 5 chiamate effettuate:");
        for (Chiamata chiamata : listaChiamate) {
            System.out.println("Numero chiamato: " + chiamata.getNumeroChiamato());
            System.out.println("Durata: " + chiamata.getDurata() + " minuti");
            System.out.println("-----------");
        }
    }
}
