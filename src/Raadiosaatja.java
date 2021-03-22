import java.util.ArrayList;
import java.util.List;

public class Raadiosaatja {
    private List<RaadioKuulaja> raadiokuulajad = new ArrayList<>();

    public Raadiosaatja(List<RaadioKuulaja> raadiokuulajad) {
        this.raadiokuulajad = raadiokuulajad;
    }


    public void lisaKuulaja(RaadioKuulaja raadiokuulaja){
        raadiokuulajad.add(raadiokuulaja);
    }

    public void edasta(String raadiosaade){
        for (RaadioKuulaja raadiokuulaja: raadiokuulajad) {
            raadiokuulaja.kuula(raadiosaade);
        }
    }

    public List<RaadioKuulaja> getRaadiokuulajad() {
        return raadiokuulajad;
    }
    
}
