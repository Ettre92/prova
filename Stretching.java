import java.util.Timer;

public class Stretching extends Esercizio implements Pianificabile {
    private Timer tempoRec;
    public Stretching(String nome, double timer, int ripetizioni, String difficolta,Timer tempoRec) {
        super(nome,timer,ripetizioni,difficolta);
        this.tempoRec = tempoRec;
    }


    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public String getDifficolta() {
        return super.getDifficolta();
    }

    @Override
    public int getRipetizioni() {
        return super.getRipetizioni();
    }

    @Override
    public double getTimer() {
        return super.getTimer();
    }

    public Timer getTempoRec() {
        return tempoRec;
    }
    public String eseguiEsercizio() {
        return "Esegui lo stretching '" + getNome() + "' per " + getTimer()
                + " minuti con " + tempoRec + " secondi di recupero.";
    }
    public String pianificaAllenamento(){
        return "Pianifica l'esercizio stretching '" + getNome() + "' per " + getTimer() + " ripetizioni: "
                + getRipetizioni() + " . Livello di difficoltà: " + getDifficolta() + "Tempo recupero "+getTempoRec();
    }
}
