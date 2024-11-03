package Programa02;
import java.util.Scanner;
public class Ejercicio02 {
    public static void main(String[]args){
        
        //Declaramos las variables.
        int comp1,comp2,comp3,comp4;
        Scanner lectura=new Scanner(System.in);
        
        // Entrada de datos
        System.out.print("Ingrese las compras 1 : ");
        comp1=lectura.nextInt();
        System.out.print("Ingrese las compras 2 : ");
        comp2=lectura.nextInt();
        System.out.print("Ingrese las compras 3 : ");
        comp3=lectura.nextInt();
        System.out.print("PIngrese las compras 4 : ");
        comp4=lectura.nextInt();
        
        // creando el objeto a traves de la instancia de la clase
         Registrocompras objregcompras=new Registrocompras(comp1,
                 comp2,comp3,comp4);
         
         //salida de datos
         
         System.out.println("El total de las compras es : "+objregcompras.totalcompras());
         System.out.println("El promedio de las compras es : "+objregcompras.promediocompras());
         System.out.println("La compra mayor es : "+objregcompras.compramayor());
         System.out.println("La compra menor es : "+objregcompras.compramenor());
    }
    
}
