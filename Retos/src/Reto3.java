import java.util.Scanner;
public class Reto3 {
    public static void main(String[] args) {
       Scanner lect=new Scanner(System.in);

      String nombre, respuesta;
      int apuesta, resultado, sistema;
  
     System.out.println("Ingrese su nombre");
        nombre = lect.next();

     System.out.println("Ingrese su apuesta");
        apuesta = lect.nextInt(); 

        if (apuesta>=10000) {
             System.out.println("Elija cara o sello : ");
            respuesta = lect.next();

            sistema=(int)(Math.random()*2);

            if (respuesta.equals("cara")) {
                if (sistema == 0) {
                    resultado=apuesta*2;
                    System.out.println("Apostador "+nombre+" usted ha ganado con "+respuesta+" y duplicado el valor apostado con un total de "+resultado);
                } 
                
                     else {
                    System.out.println("Jugador "+nombre+" ha salido sello, usted ha perdido "+apuesta+" pesos.");
                }
            } 
            
            else if (respuesta.equals("sello")) {
                if (sistema== 1) {
                    resultado=apuesta*2;
                    System.out.println("Apostador "+nombre+" usted ha ganado con "+respuesta+" y duplicado el valor apostado con un total de "+resultado);
                }
                
                else {
                    System.out.println("Apostador "+nombre+" usted ha perdido con "+respuesta+", perdiendo lo apostado que es "+apuesta);
                }
            }
            
                  else {
                System.out.println("Eleccion invalida.");
            } 
        } 

        else {
            System.out.println("La apuesta debe ser de 10000 en adelante");
        }

           lect.close();
    }

} 
    