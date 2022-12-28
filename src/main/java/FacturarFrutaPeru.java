public class FacturarFrutaPeru implements Facturador{
    private double IVA=0.16;
    @Override
    public double calcularPrecioConIVA(short precio) {
        return precio*IVA+precio;
    }
}