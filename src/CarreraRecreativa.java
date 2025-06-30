public class CarreraRecreativa extends Carrera{

    public CarreraRecreativa(String nombre, int distancia) {
        super(nombre, distancia);
    }

    @Override
    public boolean recibeInscripcion(Corredor corredor) {
        return true;
    }

    @Override
    public void determinarPuntos(Corredor corredor) {
        puntos = 0;
    }
}
