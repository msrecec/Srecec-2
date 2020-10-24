package hr.java.covidportal.model;

public class Virus extends Bolest implements Zarazno {
    public Virus(String naziv, Simptom[] simptomi) {
        super(naziv, simptomi);
    }

    // Implementirati "Deep Copy"

    @Override
    public void prelazakZarazeNaOsobu(Osoba osoba) {
        osoba.setZarazenBolescu(this);
    }

}
