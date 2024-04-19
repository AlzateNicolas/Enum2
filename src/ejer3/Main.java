package ejer3;

public class Main {
    public static void main(String[] args) {
        for (VideoJuegos videoJuego : VideoJuegos.values()) {
            System.out.println("Nombre del juego: " + videoJuego.getNombreJuego());
            System.out.println("Instrucciones: " + videoJuego.getInstruccion());
            System.out.println("Año de creación: " + videoJuego.getAnio());
            videoJuego.mostrarPosicionRanking();
            videoJuego.comprarMonedas();
        }
    }
}
