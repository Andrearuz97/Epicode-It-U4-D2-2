package es_3;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("C001", "Giuseppe Verdi", "joseph@email.com",
                LocalDate.of(2023, 6, 27));

        Carrello carrello = new Carrello(cliente);

        Articolo articolo1 = new Articolo("A001", "Prodotto 1", 10.0, 5);
        Articolo articolo2 = new Articolo("A002", "Prodotto 2", 15.0, 3);

        carrello.aggiungiArticolo(articolo1);
        carrello.aggiungiArticolo(articolo2);

        System.out.println("Dettagli cliente:");
        System.out.println("Codice cliente: " + cliente.getCodiceCliente());
        System.out.println("Nome e cognome: " + cliente.getNomeCognome());
        System.out.println("Email: " + cliente.getEmail());
        System.out.println("Data iscrizione: " + cliente.getDataIscrizione());

        System.out.println("\nDettagli carrello:");
        System.out.println("Cliente associato: " + carrello.getClienteAssociato().getNomeCognome());
        System.out.println("Totale costo articoli: " + carrello.getTotaleCostoArticoli() + " euro");

        System.out.println("\nDettagli articoli nel carrello:");
        for (Articolo articolo : carrello.getElencoArticoli()) {
            System.out.println("Codice articolo: " + articolo.getCodiceArticolo());
            System.out.println("Descrizione: " + articolo.getDescrizione());
            System.out.println("Prezzo: " + articolo.getPrezzo() + " euro");
            System.out.println("Pezzi disponibili: " + articolo.getPezziDisponibili());
            System.out.println();
        }
    }
}
