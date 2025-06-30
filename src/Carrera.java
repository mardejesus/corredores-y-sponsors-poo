import java.util.HashSet;
import java.util.Set;

public abstract class Carrera {
    protected final String nombre;
    protected final int distancia;
    protected Set<Corredor> corredoresInscriptos = new HashSet<>();
    protected int puntos;

    public Carrera(String nombre, int distancia) {
        this.nombre = nombre;
        this.distancia = distancia;
    }

    public void inscribirCorredor(Corredor corredor){
        corredoresInscriptos.add(corredor);
    }

    public void recordarCorredoresInscriptos(){
        for (Corredor corredor : corredoresInscriptos){
            System.out.println(corredor.getNombre());
        }
    }

    public abstract boolean recibeInscripcion(Corredor corredor);
    public abstract void determinarPuntos(Corredor corredor);

    public int getDistancia(){
        return distancia;
    }
    public int getPuntos(){
        return puntos;
    }
}
