import java.util.Timer;

public class Cardio extends Esercizio implements Pianificabile{
    public int velocita;
    public Cardio(String nome, double timer, int ripetizioni, String difficolta,int velocita){
        super (nome,timer,ripetizioni,difficolta);
        this.velocita = velocita;
    }

    public int getVelocita() {
        return velocita;
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
    public String eseguiEsercizio() {
        return "Esegui il cardio '" + getNome() + "' per " + getTimer() + " minuti a una velocità di "
                + velocita+ " km/h.";
    }

    public String pianificaAllenamento(){
        return "Pianifica l'esercizio cardio '" + getNome() + "' per " + getTimer() + " minuti a una velocità di "
                + velocita + " km/h. Livello di difficoltà: " + getDifficolta() + ".";
    }

    @Override
    public String toString() {
        return "TIPO: "+getClass().getName()+" Nome: "+getNome()+" Timer: "+getTimer()+" Ripetizioni: "+getRipetizioni();
    }
}
