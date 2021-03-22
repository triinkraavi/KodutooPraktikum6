import java.util.ArrayList;
import java.util.List;

public class UudisteRaadio extends Raadiosaatja{
    private List<String> aktuaalsedUudised = new ArrayList<>();

    public UudisteRaadio(List<RaadioKuulaja> raadiokuulajad, List<String> aktuaalsedUudised) {
        super(raadiokuulajad);
        this.aktuaalsedUudised = aktuaalsedUudised;
    }

    void uuendaAktuaalsedUudised (List<String> uudised){
        aktuaalsedUudised.add(uudised.toString());
    }

    void edastaUudised(){
        for (String uudis:aktuaalsedUudised) {
            super.edasta(uudis);
        }
    }
}
