import java.util.Scanner;

public class Reto2 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);

        int kelvin;
        double centigrados;

        System.out.println("Ingrese grados kelvin");
        kelvin=leer.nextInt();

        centigrados= kelvin-273.15;

        System.out.println("La conversión de grados kelvin a grados centigrados es:"+centigrados);
   leer.close(); 
    }
}
