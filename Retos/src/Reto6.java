import java.util.Scanner;

public class Reto6 {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        String  decision, nombre;
        int valorA,respuesta=0, resultado=0, sistema, i=1, total=0;

        System.out.println("Ingrese su nombre");
        nombre=leer.next();

        System.out.println("Ingrese el valor de dinero a apostar");
        valorA=leer.nextInt();
        do{
                System.out.println("Digite su jugada (Cara o Sello)");
                decision=leer.next();
                sistema=(int)Math.floor(Math.random()*2);
                
        if (decision.equals("cara")) {
            if (sistema==0) {
                resultado= valorA*2;
                total= total+resultado;
                
                System.out.println("Apostador "+nombre+" usted ha ganado con la jugada "+decision+" y ha duplicado obteniendo: "+resultado);
                System.out.println("Desea jugar de nuevo  \n1 Si \n2 No: ");
                respuesta=leer.nextInt();
            }
            else{
                System.out.println("Apostador "+nombre+" usted ha perdido, el sistema dio el resultado Sello ¿desea jugar de nuevo? \n1 Si \n2 No ");
                total=total-valorA;
                respuesta=leer.nextInt();
            }
        }
        if (decision.equals("sello")) {
            if (sistema==1) {
                resultado= valorA*2;
                System.out.println("Apostador "+nombre+" usted ha ganado con la jugada "+decision+" y a duplicado obteniendo: "+resultado);
                    System.out.println("Desea jugar de nuevo  \n1 Si \n2 No: ");
                    respuesta=leer.nextInt();
                    total= total+resultado;
            }
            else{
                System.out.println("Apostador "+nombre+" usted ha perdido, el sistema dio el resultado Cara. ¿Desea jugar de nuevo? \n1 Si \n2 No:");
                total=total-valorA;
                respuesta=leer.nextInt();
            }
        } 
    }
            while(respuesta==1);
            i++;
            if (respuesta==2) {
                System.out.println("Apostador "+nombre+" usted a obtenido el total de: "+total+" y ha jugado "+i+" veces");
            }
            leer.close();        
        }           
    }
