public class Corredor {
    private int carrerasTotales;
    private int distanciaMaxima;
    private int puntajeAcumulado;
    private boolean tieneCertificado;
    private String nombre;

    public Corredor(boolean tieneCertificado, String nombre) {
        this.tieneCertificado = tieneCertificado;
        this.nombre = nombre;
    }

    public void actualizarValores(Carrera carrera){
        if (carrera.getDistancia() > distanciaMaxima){
            distanciaMaxima = carrera.getDistancia();
        }
        puntajeAcumulado += carrera.getPuntos();
        carrerasTotales += 1;
    }
    public void inscribirse(Carrera carrera){
        if (carrera.recibeInscripcion(this)){
            carrera.determinarPuntos(this);
            carrera.inscribirCorredor(this);
            actualizarValores(carrera);
        }
    }

    public int recordarCarreras(){
        return carrerasTotales;
    }
    public int recordarDistanciaMaxima(){
        return distanciaMaxima;
    }
    public boolean verificarCertificado(){
        return tieneCertificado;
    }
    public int getPuntajeAcumulado(){
        return puntajeAcumulado;
    }
    public String getNombre(){
        return nombre;
    }


}
