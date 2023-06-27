package es_1;

public class Rettangolo {
    private double altezza;
    private double larghezza;

    public Rettangolo(double altezza, double larghezza) {
        this.altezza = altezza;
        this.larghezza = larghezza;
    }

    public double calcolaArea() {
        return altezza * larghezza;
    }

    public double calcolaPerimetro() {
        return 2 * (altezza + larghezza);
    }

    public static void stampaRettangoli(Rettangolo rettangolo1, Rettangolo rettangolo2, Rettangolo rettangolo3) {
        System.out.println("Rettangolo 1:");
        System.out.println("Area: " + rettangolo1.calcolaArea());
        System.out.println("Perimetro: " + rettangolo1.calcolaPerimetro());

        System.out.println("Rettangolo 2:");
        System.out.println("Area: " + rettangolo2.calcolaArea());
        System.out.println("Perimetro: " + rettangolo2.calcolaPerimetro());
        
        System.out.println("Rettangolo 3:");
        System.out.println("Area: " + rettangolo3.calcolaArea());
        System.out.println("Perimetro: " + rettangolo3.calcolaPerimetro());
    }

    
}
