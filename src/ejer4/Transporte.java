package ejer4;

public enum Transporte {
    BUS(50, "Diesel") {
        public void mostrarDescripcion() {
            System.out.println("El bus tiene una capacidad de " + getCapacidad() + " y un motor de tipo " + getTipoMotor());
        }
    },
    TREN(200, "Eléctrico") {
        public void mostrarDescripcion() {
            System.out.println("El tren tiene una capacidad de " + getCapacidad() + " y un motor de tipo " + getTipoMotor());
        }
    },
    BARCO(500, "Diesel") {
        public void mostrarDescripcion() {
            System.out.println("El barco tiene una capacidad de " + getCapacidad() + " y un motor de tipo " + getTipoMotor());
        }
    },
    MOTO(2, "Gasolina") {
        public void mostrarDescripcion() {
            System.out.println("La moto tiene una capacidad de " + getCapacidad() + " y un motor de tipo " + getTipoMotor());
        }
    },
    AVION(150, "Turbina de jet") {
        public void mostrarDescripcion() {
            System.out.println("El avión tiene una capacidad de " + getCapacidad() + " y un motor de tipo " + getTipoMotor());
        }
    };

    private final int capacidad;
    private final String tipoMotor;

    Transporte(int capacidad, String tipoMotor) {
        this.capacidad = capacidad;
        this.tipoMotor = tipoMotor;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public abstract void mostrarDescripcion();
}
