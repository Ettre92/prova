import java.lang.Object;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Timer;

public class Allenamento {
    private ArrayList<Esercizio> esercizi;
    public Allenamento() {
        esercizi = new ArrayList<>();
    }
    public void addEsercizio(Esercizio esercizio) {
        esercizi.add(esercizio);
    }
    public void removeEsercizio(Esercizio esercizio) {
        esercizi.remove(esercizio);
    }
    public String printEsercizi() {
        for (Esercizio esercizio : esercizi) {
            return esercizio.toString();
        }
        return "FINITO";

    }
    public double durata(){
        double total=0;
        for (Esercizio esercizio : esercizi) {
            total+=esercizio.getTimer();
        }
        return total;
    }

}
