
package Programa01;

public class Registroingreso {
    // Agregamos los atributos
    private double ingresos;
    private double otrosingresos;
    private double gastos;
    
    // Agregamos el metodo constructor
    public Registroingreso(double xingreso,double xotrosingresos,double xgastos){
        this.ingresos=xingreso;
        this.otrosingresos=xotrosingresos;
        this.gastos=xgastos;
        
    }
    // Agregamos metodos a la clase
    public double ahorromensual(){
        return((this.ingresos+this.otrosingresos)-this.gastos);
    }
    public double ahorrosemestral(){
        return(this.ahorromensual()*6);
    }
    public double ahorroanual(){
        return (this.ahorrosemestral()*2);
    }
   
    
}
