import java.util.ArrayList;

public class PianoAllenamento {
   private ArrayList<Allenamento> allenamenti;
   private String difficolta;
   private double durata;
    public PianoAllenamento(String difficolta,double durata) {
        this.durata = durata;
       allenamenti = new ArrayList<>();
       this.difficolta = difficolta;
    }


}
