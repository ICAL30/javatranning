public class Factura {

        /*Generar un código/programa donde hayan diversos precios y productos (mínimo cinco),
             al final se debe de visualizar  cada uno de los precios con IVA*/

    public static void main(String[] args)
    {
        System.out.println("\t\tFactura");

        short mango = 2500;
        short arandanos = 5000;
        short fresas = 4800;
        short lechuga = 3000;
        short moras = 6000;

//Obtener IVA

        Facturador facturarFruta=new FacturarFruta();
        double PROD1 = facturarFruta.calcularPrecioConIVA(mango);
        facturarFruta = new FacturarFrutaArgentina();
        double PROD2 = facturarFruta.calcularPrecioConIVA(arandanos);
        facturarFruta = new FacturarFrutaPeru();
        double PROD3 = facturarFruta.calcularPrecioConIVA(fresas);
        double PROD4 = facturarFruta.calcularPrecioConIVA(lechuga);
        facturarFruta = new FacturarFrutaBrazil();
        double PROD5 = facturarFruta.calcularPrecioConIVA(moras);

        System.out.println("\nEl precio de los productos con IVA es:\n");

//Precio de cada producto

        System.out.println("\tMango:" + PROD1+ " COP");
        System.out.println("\tArandanos:" + PROD2+ " COP");
        System.out.println("\tFresas:" + PROD3+ " COP");
        System.out.println("\tLechuga:" + PROD4+ " COP");
        System.out.println("\tMoras :" + PROD5+ " COP");
    }
}