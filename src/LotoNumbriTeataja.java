import java.util.ArrayList;
import java.util.List;

public class LotoNumbriTeataja extends Raadiosaatja{


    public LotoNumbriTeataja(List<RaadioKuulaja> raadiokuulajad) {
        super(raadiokuulajad);
    }

    public void loosiJaEdasta(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            int võidunumber = (int)Math.round(Math.random()*100);
            sb.append(võidunumber);
        }
        super.edasta(sb.toString());
    }
}
