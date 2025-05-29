class Auto extends Vehiculo {
    public Auto(String placa) {
        super(placa);
    }

    @Override
    public double tarifaDiaria() {
        return 20.0;
    }
}