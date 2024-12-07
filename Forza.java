import java.util.Timer;

public class Forza extends Esercizio implements Pianificabile{
    private double peso;
    public Forza(String nome, double timer, int ripetizioni, String difficolta, double peso){
        super(nome,timer,ripetizioni,difficolta);
        this.peso = peso;
    }
    public double getPeso(){
        return peso;
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
        return "Esegui l'esercizio di forza '" + getNome() + "' per " + getRipetizioni()
                + " ripetizioni con un peso di " + peso + " kg.";
    }
    public String pianificaAllenamento(){
        return "Pianifica l'esercizio cardio '" + getNome() + "' per " + getTimer() + " Ripetizioni: "
                +getRipetizioni() + " . Livello di difficoltà: " + getDifficolta() + "Peso:"+getPeso();
    }

}
