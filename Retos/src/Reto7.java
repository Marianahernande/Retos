import java.util.Scanner;

public class Reto7 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String nombre, persona;
        int Vapuesta, i=1, sistema, respuesta=0, resultado=0,total=0;
        
        System.out.println("Ingresa por favor tu nombre: ");
        nombre=leer.next();
        System.out.println("Ingresa por favor su apuesta: ");
        Vapuesta=leer.nextInt();
        do {
            System.out.println("Introduzca su jugada por favor \n Piedra \n Papel \n Tijera: ");
            persona=leer.next();
            sistema=(int)Math.floor(Math.random()*3);
            if (persona.equals("piedra")) {
                if (sistema==1) {
                    System.out.println("Usted ha quedado en empate con la maquina");
                    System.out.println("Desea jugar de nuevo  \n1 Si \n2 No: ");
                    respuesta=leer.nextInt();
                }
                else if (sistema==3) {
                    System.out.println("Apostador "+nombre+" ¡usted ha ganado! en contra de la maquina con la jugada "+persona+" y ha incrementado su apuesta a "+total);
                    resultado= Vapuesta*2;
                    total= total+resultado;
                    System.out.println("Desea jugar de nuevo  \n1 Si \n2 No: ");
                    respuesta=leer.nextInt();
                    
                }
                else{
                    
                    System.out.println("¡Perdiste "+nombre+" con la jugada "+persona+", ya que la maquina sacó Papel restandole "+total+" pesos");
                    total= total-Vapuesta;
                    
                    System.out.println("Desea jugar de nuevo  \n1 Si \n2 No: ");
                    respuesta=leer.nextInt();
                }
            }
            
            else if (persona.equals("papel")) {
                if (sistema==2) {
                    System.out.println("Has quedado en empate con la maquina");
                    System.out.println("Desea jugar de nuevo  \n1 Si \n2 No: ");
                    respuesta=leer.nextInt();
                }
                else if (sistema==1) {
                    resultado= Vapuesta*2;
                    total= total+resultado;
                    System.out.println("Apostador "+nombre+" ¡usted ha ganado! en contra de la maquina con la jugada "+persona+" y ha duplicado su apuesta a "+total);
                    System.out.println("Desea jugar de nuevo  \n1 Si \n2 No: ");
                    respuesta=leer.nextInt();
                    
                    
                }
                else{
                    total= total-Vapuesta;
                    System.out.println("¡Perdiste "+nombre+" con la jugada "+persona+", ya que la maquina sacó Tijera, restandole a su acumulado "+total+" pesos");
                    System.out.println("Desea jugar de nuevo  \n1 Si \n2 No: ");
                    respuesta=leer.nextInt();
                    
                }
            }
            else if (persona.equals("tijera")) {
                if (sistema==3) {
                    System.out.println("Has quedado en empate con la maquina");
                    System.out.println("Desea jugar de nuevo  \n1 Si \n2 No: ");
                    respuesta=leer.nextInt();
                }
                else if (sistema==2) {
                    resultado= Vapuesta*2;
                    total= total+resultado;
                    System.out.println("Apostador "+nombre+" ¡usted ha ganado! en contra de la maquina con la jugada "+persona+" y ha duplicado su apuesta a "+total);
                    System.out.println("Desea jugar de nuevo  \n1 Si \n2 No: ");
                    respuesta=leer.nextInt();
                }
                else{
                    System.out.println("¡Perdiste "+nombre+" con la jugada "+persona+", ya que la maquina sacó Piedra, restandole a su acumulado " +total+ " pesos");
                    total= total-Vapuesta;
                    System.out.println("Desea jugar de nuevo  \n1 Si \n2 No: ");
                    respuesta=leer.nextInt();
                }
            }

        } 
    
        
        while (respuesta==1);
        i++;
        if (respuesta == 2) {
            System.out.println("Ganador: "+nombre+" acomulaste el total de : "+total+" y jugaste: "+i+" veces");
        }
leer.close();
    }

    }

