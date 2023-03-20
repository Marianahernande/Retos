import java.util.Scanner;

public class Reto1 {
    public static void main(String[] args) {
        
    String nombreMama, nombreBebe, nombreVacuna;
    int peso, edad, dosis1,dosis;
    Scanner entrada=new Scanner(System.in);

    System.out.println("Por favor ingrese nombre de la mamá");
        nombreMama=entrada.nextLine();
    System.out.println("Por favor ingrese nombre bebé");
        nombreBebe=entrada.nextLine();
   System.out.println("Ingrese por favor el nombre de la vacuna");
        nombreVacuna=entrada.nextLine();
    System.out.println("Por favor ingresar peso bebé");
        peso=entrada.nextInt();
    System.out.println("Ingrese por favor la edad del bebé");
        edad=entrada.nextInt();

    dosis1=(edad*10) / (peso+10);
    dosis=dosis1*8;
    System.out.println("El nombre de la mamá del bebé es: "+nombreMama+", el nombre del bebé es:"+nombreBebe+
    ", se le aplicó la vacuna: "+nombreVacuna+", la cantidad de dosis son: "+dosis+" vacunas");
entrada.close();
    }
}
