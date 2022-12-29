public class FacturarFrutaPeru implements Facturador{
    private float IVA=0.16f;
    @Override
    public float calcularPrecioConIVA(short precio) {
        return precio*IVA+precio;
    }
}