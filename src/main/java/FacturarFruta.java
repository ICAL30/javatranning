public class FacturarFruta implements Facturador {

    private float IVA=0.19f;
    @Override
    public float calcularPrecioConIVA(short precio) {
        return precio*IVA+precio;
    }
}
