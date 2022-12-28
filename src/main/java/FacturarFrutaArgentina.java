public class FacturarFrutaArgentina implements Facturador{
    private double IVA=0.27;
    @Override
    public double calcularPrecioConIVA(short precio) {
        return precio*IVA+precio;
    }
}

