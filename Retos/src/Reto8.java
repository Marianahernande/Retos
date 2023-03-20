import java.util.Scanner;
public class Reto8 {
    public static void main(String[] args) {

       Scanner leer=new Scanner(System.in);
    String nombre;
       int num, i=10, opcion; 

       num=(int)(Math.random()*100);

       System.out.println(num);
       System.out.println("Bienvenido, el juego consiste en adivinar un numero del 1 al 100");

       System.out.println("Ingresa tu nombre");
       nombre=leer.next();

       do{
        System.out.println("Intento #"+(11-i)+": ");
        opcion=leer.nextInt();
         if (opcion==num)  {
            System.out.println("Felicitaciones "+nombre+" adivinaste el numero. \nTuviste "+(11-i)+" intentos.");
            return;

     } 
     
     else if (opcion<num) {

            System.out.println(nombre+" vuelve a intentarlo ya que el numero es más mayor que "+opcion);
            } 
              
                else if (opcion>num){
                     System.out.println(nombre+" vuelve a intentarlo ya que el numero es menor que "+opcion);
            }
                    i--;
       } 
       while(opcion>0);
       
       System.out.println(nombre+" Lo siento, no adivinaste el número \nEl número a adivinar era: "+num);

       leer.close();
       
    }
}

