import java.util.ArrayList;
import java.util.List;

public class Testklass {
    public static void main(String[] args) {
        RaadioKuulaja raadiokuulaja1 = new RaadioKuulaja("Johannes");
        RaadioKuulaja raadioKuulaja2 = new RaadioKuulaja("Kati");
        HajameelneKuulaja hajameelneKuulaja1 = new HajameelneKuulaja("Siim");
        HajameelneKuulaja hajameelneKuulaja2 = new HajameelneKuulaja("Siiri");
        List<RaadioKuulaja> raadiokuulajad = new ArrayList<>();
        raadiokuulajad.add(raadiokuulaja1);
        raadiokuulajad.add(raadioKuulaja2);
        List<RaadioKuulaja> hajameelsedKuulajad = new ArrayList<>();
        hajameelsedKuulajad.add(hajameelneKuulaja1);
        hajameelsedKuulajad.add(hajameelneKuulaja2);
        List<String> aktuaalsedUudised = new ArrayList<>();
        String uudis1 = "Väljas on väga külm";
        String uudis2 = "Homme on soe ilm";
        String uudis3 = "Eile algas kevad";
        String uudis4 = "Täna on tööpäev";
        aktuaalsedUudised.add(uudis1);
        aktuaalsedUudised.add(uudis2);
        aktuaalsedUudised.add(uudis3);
        aktuaalsedUudised.add(uudis4);
        LotoNumbriTeataja lotoNumbriTeataja = new LotoNumbriTeataja(raadiokuulajad);
        ValiRaadiosaatja valiRaadiosaatja = new ValiRaadiosaatja(raadiokuulajad);
        UudisteRaadio uudisteRaadio = new UudisteRaadio(raadiokuulajad,aktuaalsedUudised);





    }
}
