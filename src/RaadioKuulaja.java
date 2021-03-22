import java.util.ArrayList;
import java.util.List;

public class RaadioKuulaja {
    private String raadiokuulaja;
    private List<String> raadiosaated = new ArrayList<>();


    public void kuula(String raadiosaade){
        raadiosaated.add(raadiosaade);
    }

    public List<String> meenuta(){
        return raadiosaated;
    }

    public List<String> getRaadiosaated() {
        return raadiosaated;
    }

    public RaadioKuulaja(String raadiokuulaja) {
        this.raadiokuulaja = raadiokuulaja;
    }

    public String getRaadiokuulaja() {
        return raadiokuulaja;
    }

    @Override
    public String toString() {
        return "RaadioKuulaja: "+ raadiokuulaja + ", raadiosaated: " + raadiosaated;
    }
}
