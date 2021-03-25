public class Factura{
    public static void main (String[] args) {
    
        int vf= 350;
        int vf1= 1100;
        int vf2= 350;
        int vf3= 350;
         
        if((vf>=500) && (vf<=700))
        {
        double a=(vf-(vf*0.15));
        System.out.println(" su descuento es del 15% "+a);
        }
         
        if(vf1>=700 && vf1<=1250)
        {
        double b=((vf1-(vf1*0.25)));   
        System.out.println(" su descuento es del 25% "+b);
        }
         
    }
} 


    