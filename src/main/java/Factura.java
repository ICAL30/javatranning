public class Factura {


        /*Generar un código/programa donde hayan diversos precios y productos (mínimo cinco),
             al final se debe de visualizar  cada uno de los precios con IVA*/

    public static void main(String[] args)
    {
        System.out.println("Factura");

        short mango = 5000;
        short arandanos = 5000;
        short fresas = 4000;
        short lechuga = 3000;
        short moras = 6000;
Facturador facturarFruta=new FacturarFruta();
//Obtener IVA
        double PROD1 = facturarFruta.calcularPrecioConIVA(mango);
        double PROD2 = facturarFruta.calcularPrecioConIVA(arandanos);
        facturarFruta = new FacturarFrutaPeru();
        double PROD3 = facturarFruta.calcularPrecioConIVA(fresas);
        double PROD4 = facturarFruta.calcularPrecioConIVA(lechuga);
        double PROD5 = facturarFruta.calcularPrecioConIVA(moras);

        System.out.println("El precio de los productos con IVA es:");
//Precio de cada producto

        System.out.println("Mango:" + PROD1+ " COP");
        System.out.println("Arandanos:" + PROD2+ " COP");
        System.out.println("Fresas:" + PROD3+ " COP");
        System.out.println("Lechuga:" + PROD4+ " COP");
        System.out.println("Moras :" + PROD5+ " COP");
    }
}