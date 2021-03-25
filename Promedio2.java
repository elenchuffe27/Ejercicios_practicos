public class Promedio2{
    public static void main (String[]args){
        byte numero1=127;//Declaracion
        int numero2=2147483647;//Declaracion
        short numero3=32767;//Declaracion
        long numero4=9223372036854775807l;//Declaracion
        char numero5=5;//Declaracion
        float numero6=0.0F;//Declaracion

        numero6=((numero1+numero2+numero3+numero4+numero5)/numero5);
        
        System.out.println("el promedio es="+numero6);

        System.out.print( " byte " + numero1);
        System.out.print( " int " + numero2);
        System.out.print( " short " + numero3);
        System.out.print( " long "+numero4);
        System.out.print( " char "+ numero5);
        System.out.print( " float "+numero6);
        System.out.println();
        System.out.println(" el promedio es "+ numero6);
        
        


    
    }
}