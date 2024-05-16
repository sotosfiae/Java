
public class Main {
    public static void main(String[] args) {
        Konto konto1 = new Konto(0001);
        Konto konto2 = new Konto(0002);
        Bank bank = new Bank();

        konto1.einzahlen(30.0);
        konto1.auszahlen(0);

        konto2.ueberweisung(konto1, 50);

        bank.hinzufuegen(konto1);
        bank.hinzufuegen(konto2);
        bank.alleKontenAnzeigen();


        System.out.println(konto1.getKontostand());
    }
}
