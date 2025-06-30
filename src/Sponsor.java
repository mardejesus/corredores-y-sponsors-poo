import java.util.HashSet;
import java.util.Set;

public class Sponsor {
    private Set<Patrocinable> patrocinables = new HashSet<>();

    public void patrocinar(Patrocinable patrocinable){
        if (patrocinable.esPatrocinable()){
            patrocinables.add(patrocinable);
        }
    }

    public int cantidadPatrocinada(){
        return patrocinables.size();
    }
}
