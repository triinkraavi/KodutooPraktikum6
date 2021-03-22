import java.util.ArrayList;
import java.util.List;

public class HajameelneKuulaja extends RaadioKuulaja{

    public HajameelneKuulaja(String raadiokuulaja) {
        super(raadiokuulaja);
    }

    @Override
    public void kuula(String raadiosaade) {
        super.kuula(raadiosaade);
    }

    @Override
    public List<String> meenuta() {
        List<String> uusList = new ArrayList<>();
        for (int i = 0; i < super.getRaadiosaated().size(); i =+ 2) {
            uusList.add(getRaadiosaated().toString());
        }
        return uusList;

    }
}
