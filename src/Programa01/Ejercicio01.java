package Programa01;
import java.util.Scanner;
public class Ejercicio01 {
    public static void main(String[]args){
        
        // Declaramos las variables
        double ing,Oing,gast;
        Scanner lectura=new Scanner(System.in);
        
        // ingresamos datos
        System.out.print("Ingresos del empleado : ");
        ing=lectura.nextDouble();
        System.out.print("Otros Ingresos del empleado : ");
        Oing=lectura.nextDouble();
        System.out.print("Gastos del empleado : ");
        gast=lectura.nextDouble();
        
        // creamos el objeto mediante la instancia de la clase.
        Registroingreso objingreso=new Registroingreso(ing,Oing,gast);
        
        // Salida de datos
        System.out.println("El ahorro mensual del empleado es : "+objingreso.ahorromensual());
        System.out.println("El ahorro semestral es : "+objingreso.ahorrosemestral());
        System.out.println("El ahorro anual es : "+objingreso.ahorroanual());
    }


    
    
}
