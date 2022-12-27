public class Factura {


        /*Generar un código/programa donde hayan diversos precios y productos (mínimo cinco),
             al final se debe de visualizar  cada uno de los precios con IVA*/

    public static void main(String[] args)
    {
        System.out.println("Factura");

        double IVA = 0.16;
        short mango = 5000;
        short arandanos = 5000;
        short fresas = 4000;
        short lechuga = 3000;
        short moras = 6000;

//Obtener IVA
        double PROD1 = mango*IVA+mango;
        double PROD2 = arandanos*IVA+arandanos;
        double PROD3 = fresas*IVA+fresas;
        double PROD4 = lechuga*IVA+lechuga;
        double PROD5 = moras*IVA+moras;

        System.out.println("El precio de los productos con IVA es:");
//Precio de cada producto

        System.out.println("Mango:" + PROD1+ " COP");
        System.out.println("Arandanos:" + PROD2+ " COP");
        System.out.println("Fresas:" + PROD3+ " COP");
        System.out.println("Lechuga:" + PROD4+ " COP");
        System.out.println("Moras :" + PROD5+ " COP");
    }
}