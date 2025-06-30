//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // crear carreras
        CarreraCalle calleLarga = new CarreraCalle("calle larga", 12);
        CarreraCalle calleCorta = new CarreraCalle("calle corta", 5);

        CarreraTrail tandil = new CarreraTrail("tandil",20,1000,2);
        CarreraTrail cordoba = new CarreraTrail("córdoba",60,2000,5);

        CarreraRecreativa peques = new CarreraRecreativa("peques",5);

        // Crear corredores
        Corredor paloma = new Corredor(true, "paloma");
        Corredor juani = new Corredor(false, "juani");
        Corredor tino = new Corredor(true, "tino");

        // Inscribir corredores - pruebas CarreraCalle
        System.out.println("---");
        paloma.inscribirse(calleLarga);
        tino.inscribirse(calleLarga);
        juani.inscribirse(calleLarga);
        System.out.println("Inscriptos Carrera calle larga:");
        calleLarga.recordarCorredoresInscriptos();
        System.out.println("\npuntaje paloma: "+paloma.getPuntajeAcumulado());
        System.out.println("distancia máxima paloma: "+paloma.recordarDistanciaMaxima());
        System.out.println("carreras totales paloma: "+paloma.recordarCarreras());

        paloma.inscribirse(calleCorta);
        juani.inscribirse(calleCorta);
        tino.inscribirse(calleCorta);
        System.out.println("\nInscriptos Carrera calle corta:");
        calleCorta.recordarCorredoresInscriptos();
        System.out.println("\npuntaje paloma: "+paloma.getPuntajeAcumulado());
        System.out.println("distancia máxima paloma: "+paloma.recordarDistanciaMaxima());
        System.out.println("carreras totales paloma: "+paloma.recordarCarreras());

        System.out.println("---\n");

        // Inscribir corredores - pruebas CarreraTrail
        System.out.println("---");
        paloma.inscribirse(tandil);
        tino.inscribirse(tandil);
        juani.inscribirse(tandil);
        System.out.println("Inscriptos Carrera tandil:");
        tandil.recordarCorredoresInscriptos();
        System.out.println("\npuntaje paloma: "+paloma.getPuntajeAcumulado());
        System.out.println("distancia máxima paloma: "+paloma.recordarDistanciaMaxima());
        System.out.println("carreras totales paloma: "+paloma.recordarCarreras());

        paloma.inscribirse(cordoba);
        juani.inscribirse(cordoba);
        tino.inscribirse(cordoba);
        System.out.println("\nInscriptos Carrera cordoba:");
        cordoba.recordarCorredoresInscriptos();
        System.out.println("\npuntaje paloma: "+paloma.getPuntajeAcumulado());
        System.out.println("distancia máxima paloma: "+paloma.recordarDistanciaMaxima());
        System.out.println("carreras totales paloma: "+paloma.recordarCarreras());

        System.out.println("---\n");

        // Inscribir corredores - pruebas CarreraRecreativa
        System.out.println("---");
        paloma.inscribirse(peques);
        tino.inscribirse(peques);
        System.out.println("Inscriptos Carrera peques:");
        peques.recordarCorredoresInscriptos();
        System.out.println("\npuntaje paloma: "+paloma.getPuntajeAcumulado());
        System.out.println("distancia máxima paloma: "+paloma.recordarDistanciaMaxima());
        System.out.println("carreras totales paloma: "+paloma.recordarCarreras());

        // crear sponsors y su flujo
        Sponsor martin = new Sponsor();
        martin.patrocinar(paloma); // si
        martin.patrocinar(juani); // no
        martin.patrocinar(cordoba); // si
        martin.patrocinar(calleLarga); // no
        martin.patrocinar(peques); // no
        System.out.println(martin.cantidadPatrocinada()); // 2

    }
}