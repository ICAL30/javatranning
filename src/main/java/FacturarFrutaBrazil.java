public class FacturarFrutaBrazil implements Facturador {

    private float IVA=0.18f;
    @Override
    public float calcularPrecioConIVA(short precio) {
      return precio*IVA+precio;
    }
}
