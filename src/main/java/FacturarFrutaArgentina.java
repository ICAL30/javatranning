public class FacturarFrutaArgentina implements Facturador{
    private float IVA=0.27f;
    @Override
    public float calcularPrecioConIVA(short precio) {
        return precio*IVA+precio;
    }
}

