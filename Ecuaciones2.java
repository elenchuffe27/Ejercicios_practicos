import java.util.Scanner;
public class Ecuaciones2{
public static void main (String[]args) {

    Scanner lector = new Scanner(System.in);

    System.out.println("ingrese valor de x");
    int x = lector.nextInt();

    System.out.println("ingrese valor de y");
    int y = lector.nextInt();

    int resultado;// Declaracion 

    resultado=0;//inicializacion
    resultado=(((4*(x*x))/(2*y+1))/((5*x*y)/(2+(1/2+(x*x)))));

    int resultado2;//inicializacion 
    resultado2 = 0;
    resultado2 = ((((1+3*y)/(2*x))+((1)+(2*x)/(1+(y*y))))/((1)+(3*y)/(1+5*(x*x))));

    System.out.println("el resultado de la ecuacion es:" +resultado);
    System.out.println("el resultado de la ecuacion es" +resultado2);

}
}