
import java.util.Scanner;

public class Reto5 {
    public static void main(String[] args) {

       Scanner leer=new Scanner (System.in);

       String nombreEmp, nombreCli, nombreProd;
       int precio=0, cantidad=0, totalProduc, total=0,paga=0;
    
       System.out.println("Ingresar nombre empleado");
       nombreEmp=leer.next();

       System.out.println("Ingresar nombre cliente");
       nombreCli=leer.next();

       

       if (nombreCli.equals("Mariana")) {
               System.out.println("El cliente se encuentra registrado");
               System.out.println("Ingrese la cantidad de productos que desea llevar");
                cantidad=leer.nextInt();
               for(int i=0; i<cantidad; i++){
                System.out.println("Ingrese el nombre del producto "+i);
                nombreProd=leer.next();

                System.out.println("Ingrese el precio del producto "+i);
                precio=leer.nextInt();
                total +=precio;
                
               }
               System.out.println("El nombre del empleado es: "+nombreEmp+", el nombre del cliente es: "+nombreCli+
                " compró un total de "+cantidad+" productos, y tiene que pagar un total de: "+total);
                System.out.println("Digite cuanto tiene para pagar: ");
                paga=leer.nextInt();
                if (paga<total) {
                    System.out.println("No le alcanza para pagar la cuenta");
                }
                else {
                    System.out.println("Gracias por su compra");
                }

       }

    else if (nombreCli.equals("Jhoan")) {
        System.out.println("El cliente se encuentra registrado");
        System.out.println("Ingrese la cantidad de productos que desea llevar");
            cantidad=leer.nextInt();
        for(int i=0; i<cantidad; i++){
            System.out.println("Ingrese el nombre del producto "+i);
            nombreProd=leer.next();

            System.out.println("Ingrese el precio del producto "+i);
            precio=leer.nextInt();
            total +=precio;
            
        }
        System.out.println("El nombre del empleado es: "+nombreEmp+", el nombre del cliente es: "+nombreCli+
            " compró un total de "+cantidad+" productos, y tiene que pagar un total de: "+total);
            System.out.println("Digite cuanto tiene para pagar: ");
                paga=leer.nextInt();
                if (paga<total) {
                    System.out.println("No le alcanza para pagar la cuenta");
                }
                else {
                    System.out.println("Gracias por su compra");
                }
}

       else if (nombreCli.equals("Negrito")) {
        System.out.println("El cliente se encuentra registrado");
        System.out.println("Ingrese la cantidad de productos que desea llevar");
            cantidad=leer.nextInt();
    for(int i=0; i<cantidad; i++){
        System.out.println("Ingrese el nombre del producto "+i);
        nombreProd=leer.next();

        System.out.println("Ingrese el precio del producto "+i);
        precio=leer.nextInt();
        total +=precio;

    }
    System.out.println("El nombre del empleado es: "+nombreEmp+", el nombre del cliente es: "+nombreCli+
        " compró un total de "+cantidad+" productos, y tiene que pagar un total de: "+total);
        System.out.println("Digite cuanto tiene para pagar: ");
                paga=leer.nextInt();
                if (paga<total) {
                    System.out.println("No le alcanza para pagar la cuenta");
                }
                else {
                    System.out.println("Gracias por su compra");
                }
}
else{
    System.out.println("El cliente no se encuentra registrado");
}
      
leer.close();
    }
}
