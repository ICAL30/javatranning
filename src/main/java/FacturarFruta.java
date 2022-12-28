public class FacturarFruta implements Facturador {

    private double IVA=0.19;
    @Override
    public double calcularPrecioConIVA(short precio) {
        return precio*IVA+precio;
    }
}
