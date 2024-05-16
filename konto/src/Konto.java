public class Konto{
    private long kontonummer;
    private double Kontostand;

    public Konto(long kontonummer){
        this.kontonummer=kontonummer;
        this.Kontostand=0.0;
    }

    public double getKontostand(){
        return Kontostand;
    }

    public void einzahlen(double betrag){
        Kontostand = Kontostand + betrag;

    }

    public void auszahlen(double betrag) {
        if (betrag > Kontostand) {
            System.out.println(" Es geht nicht ");

        } else {
            Kontostand = Kontostand - betrag;

        }
    }
    public void ueberweisung(Konto zielKonto, double betrag){
        if (betrag>this.Kontostand){
            System.out.println("Kontozustand");
        }
        else {
            this.auszahlen(betrag);
            zielKonto.einzahlen(betrag);
        }
    }
}

