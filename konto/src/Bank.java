import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Konto>ListeKonten;

    public Bank(){
        ListeKonten=new ArrayList<>();
    }

    public void hinzufuegen(Konto konto){
        ListeKonten.add(konto);
    }
    public void loeschen(Konto konto) {
        ListeKonten.remove(konto);
    }

    public void alleKontenAnzeigen(){
        for (Konto element:ListeKonten){
            System.out.println("Kontostand: " + element.getKontostand());
        }
    }
}
