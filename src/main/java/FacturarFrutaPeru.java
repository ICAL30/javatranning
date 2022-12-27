public class FacturarFrutaPeru implements Facturador{
    private double IVA=0.10;
    @Override
    public double calcularPrecioConIVA(short precio) {
        return precio*IVA+precio;
    }
}