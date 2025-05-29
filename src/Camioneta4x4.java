class Camioneta4x4 extends Camioneta {
    public Camioneta4x4(String placa) {
        super(placa);
    }

    @Override
    public double tarifaDiaria() {
        return 50.0;
    }
}