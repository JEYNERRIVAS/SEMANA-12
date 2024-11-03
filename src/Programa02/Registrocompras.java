
package Programa02;
public class Registrocompras {
    // creando los atributos
    private double compras1;
    private double compras2;
    private double compras3;
    private double compras4;
    
    // creando el metodo constructor
    public Registrocompras(double xcompras1,double xcompras2,double xcompras3,double xcompras4){
        this.compras1=xcompras1;
        this.compras2=xcompras2;
        this.compras3=xcompras3;
        this.compras4=xcompras4;
    }
    // Agregando los metodos 
    public double totalcompras(){
        return(this.compras1+this.compras2+this.compras3+this.compras4);
    }
   public double promediocompras(){
        return(this.totalcompras()/4);
   }
   public double compramayor(){
       double xmayor;
       xmayor=this.compras1;
       if (this.compras2>xmayor) {
           xmayor=this.compras2;
       }
       if (this.compras3>xmayor) {
           xmayor=this.compras3;
       }
       if (this.compras4>xmayor) {
           xmayor=this.compras4; 
       }
       return (xmayor);
           
       }
   public double compramenor(){
       double xmenor;
       xmenor=this.compras1;
       if (this.compras2<xmenor) {
           xmenor=this.compras2;   
       }
       if (this.compras3<xmenor) {
           xmenor=this.compras3;
       }
       if (this.compras4<xmenor) {
           xmenor=this.compras4;  
       }
       return(xmenor);
       
   }
}