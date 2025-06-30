public class CarreraCalle extends Carrera{

    public CarreraCalle(String nombre, int distancia) {
        super(nombre, distancia);
    }

    @Override
    public boolean recibeInscripcion(Corredor corredor) {
        if (distancia < 10 || corredor.verificarCertificado()){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void determinarPuntos(Corredor corredor) {
        if (corredor.getPuntajeAcumulado() < 10){
            puntos = 1;
        }
    }
}
