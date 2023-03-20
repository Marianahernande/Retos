import java.util.Scanner;

public class Reto4 {
    public static void main(String[] args) {

        Scanner leer=new Scanner (System.in);
        
        String nombre;
        int resultado, respuesta, valorA, sistema;

        System.out.println("Ingrese su nombre");
        nombre=leer.next();

        System.out.println("Ingrese el valor de su apuesta");
        valorA=leer.nextInt();

        if(valorA>=10000){
            System.out.println("Puedes jugar, elige \n1 Piedra \n2 Papel \n3 Tijera");
            respuesta=leer.nextInt();
            sistema=(int)(Math.random()*3);

            if(respuesta==sistema){
                System.out.println("Usted queda en empate con la maquina");

            }
            else if (respuesta==1){
                if(sistema==3) { 
                  resultado=valorA*2;
                  System.out.println(" \nApostador " +nombre+" sacó Piedra \nMaquina sacó Tijera");
                  System.out.println("Ganó apostador "+nombre+" duplicando su apuesta a "+resultado);
                }   
                else{
                    System.out.println("Apostador "+nombre+" ha sacado piedra, usted ha perdido un total de "+valorA+" pesos");
                }   

            } 
            else if (respuesta==3){
                if(sistema==2){
                resultado=valorA*2;
                System.out.println("\nApostador " +nombre+" sacó Tijera \nMaquina sacó Papel");
                System.out.println("Ganó apostador "+nombre+" duplicando su apuesta a "+resultado);
          }
          else{
            System.out.println("Apostador" +nombre+" usted ha sacado tijera, ha perdido un total de "+valorA+" pesos");
          }
        }
            else if (respuesta==2){
                if(sistema==1){
                resultado=valorA*2;
                System.out.println(" \nApostador " +nombre+" sacó Papel \nMaquina sacó Piedra");
                System.out.println("Ganó apostador "+nombre+" duplicando su apuesta a "+resultado);
          }
          else{
            System.out.println("Apostador "+nombre+" usted ha sacado papel, ha perdido un total de "+valorA+" pesos");
          }
        }
          
        }
        else{
            System.out.println("No puede apostar ya que el valor debe ser mayor a 10000 pesos");
        }
        leer.close();
    }
}
