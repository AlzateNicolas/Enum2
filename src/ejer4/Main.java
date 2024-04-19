package ejer4;

public class Main {
    public static void main(String[] args) {
        for (Transporte transporte : Transporte.values()) {
            transporte.mostrarDescripcion();
        }
    }
}
