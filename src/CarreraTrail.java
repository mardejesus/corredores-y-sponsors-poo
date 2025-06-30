public class CarreraTrail extends Carrera{
    private final int desnivel;
    private int cupoMaximo;

    public CarreraTrail(String nombre, int distancia, int desnivel, int cupoMaximo) {
        super(nombre, distancia);
        this.desnivel = desnivel;
        this.cupoMaximo = cupoMaximo;
    }

    public void modificarCupoMaximo(int nuevoCupoMaximo){
        cupoMaximo = nuevoCupoMaximo;
    }

    @Override
    public boolean recibeInscripcion(Corredor corredor) {
        if (corredoresInscriptos.size() == cupoMaximo){
            return false;
        } else {
            return true;
        }
    }

    @Override
    public void determinarPuntos(Corredor corredor) {
        puntos = (desnivel / 1000) + (distancia / 20);
    }

    // interfaz
    @Override
    public boolean esPatrocinable() {
        for (Corredor corredor : corredoresInscriptos){
            if (corredor.getPuntajeAcumulado() >= 5 || desnivel >= 2000){
                return true;
            }
        } return false;
    }
}
