public class FacturarFrutaBrazil implements Facturador {

    private double IVA=0.18;
    @Override
    public double calcularPrecioConIVA(short precio) {
      return precio*IVA+precio;
    }
}
