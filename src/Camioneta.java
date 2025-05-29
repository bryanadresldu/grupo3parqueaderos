class Camioneta extends Auto {
    public Camioneta(String placa) {
        super(placa);
    }

    @Override
    public double tarifaDiaria() {
        return 35.0;
    }
}

