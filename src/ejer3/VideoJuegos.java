package ejer3;

enum VideoJuegos implements VideoJuegoInterface {
    DEPORTIVOS("FIFA 21", "Usa los controles para mover a los jugadores", 2020),
    ESTRATEGIA("Age of Empires II", "Construye tu civilización y conquista a las demás", 1999),
    MUSICALES("Guitar Hero", "Sigue las notas musicales en la pantalla", 2005),
    AVENTURA("The Legend of Zelda: Breath of the Wild", "Explora el vasto mundo de Hyrule", 2017),
    SIMULACION("The Sims 4", "Crea una vida virtual para tus Sims", 2014);

    private String nombre;
    private String instrucciones;
    private int anio;

    VideoJuegos(String nombre, String instrucciones, int anio) {
        this.nombre = nombre;
        this.instrucciones = instrucciones;
        this.anio = anio;
    }

    public String getNombreJuego() {
        return this.nombre;
    }

    public String getInstruccion() {
        return this.instrucciones;
    }

    public int getAnio() {
        return this.anio;
    }

    public void mostrarPosicionRanking() {
        // Implementación del método
    }

    public void comprarMonedas() {
        // Implementación del método
    }
}