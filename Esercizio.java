import java.util.Timer;

public abstract class Esercizio  {
    private String nome;
    private double timer;
    private int ripetizioni;
    private String difficolta;
    public Esercizio(String nome, double timer, int ripetizioni, String difficolta) {
        this.nome = nome;
        this.timer = timer;
        this.ripetizioni = ripetizioni;
        this.difficolta = difficolta;

    }
    public String getNome() {
        return nome;
    }
    public double getTimer() {
    return timer;}
    public int getRipetizioni() {
        return ripetizioni;
    }
    public String getDifficolta() {
        return difficolta;
    }

    public abstract String eseguiEsercizio();
}
