public class Vehiculo {
    String placa;

    public Vehiculo() {}

    public Vehiculo(String placa) {
        this.placa = placa;
    }

    public double tarifaDiaria() {
        return 0.0;
    }

    public void registrarEntrada() {
        System.out.println("Entrada registrada sin datos.");
    }

    public void registrarEntrada(String placa) {
        this.placa = placa;
        System.out.println("Entrada registrada con placa: " + placa);
    }

    public void registrarEntrada(String placa, String hora) {
        this.placa = placa;
        System.out.println("Entrada registrada con placa: " + placa + " a las " + hora);
    }
}
