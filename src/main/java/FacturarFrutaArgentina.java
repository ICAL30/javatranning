public class FacturarFrutaArgentina implements Facturador{
    private double IVA=0.21;
    @Override
    public double calcularPrecioConIVA(short precio) {
        return precio*IVA+precio;
    }
}

