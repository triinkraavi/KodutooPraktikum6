import java.util.List;
import java.util.Locale;

public class ValiRaadiosaatja extends Raadiosaatja{

    public ValiRaadiosaatja(List<RaadioKuulaja> raadiokuulajad) {
        super(raadiokuulajad);
    }

    @Override
    public void edasta(String raadiosaade){
        for (RaadioKuulaja raadiokuulaja: super.getRaadiokuulajad()) {
            raadiokuulaja.kuula(raadiosaade.toUpperCase());
        }
    }
}
