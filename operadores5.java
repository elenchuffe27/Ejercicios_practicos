import java.util.Scanner; 
public class operadores5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    System.out.println("ingrese valor de V1");
    int v1 = sc.nextInt();

    System.out.println("Ingrese valor de V2");
    int v2 = sc.nextInt();

    double m1 = (double)v1/v2;
    double m2 = (double)v2/v1;
    double m3 = (double)v1/v1;
    double m4= (double)v2/v2;


    System.out.println(v1+v2);
    System.out.println(v1-v2);
    System.out.println(v1*v2);
    System.out.println(m1);
    System.out.println(m2);
    System.out.println(v2<v1);
    System.out.println(v1<v2);
    System.out.println(v1-v1);
    System.out.println(v1<=v1);
    System.out.println(v2>=v2);
    System.out.println(v1*(m1));
    System.out.println(v2*(m3));
    System.out.println(v1+v1);
    System.out.println(m3);
    System.out.println(m4);
    System.out.println(m4/m1);
    System.out.println(m1*m3+v1);
    System.out.println(m2<=m3);
    System.out.println(v1*v1*v1);
    System.out.println(v1*v2+m3/m2);
    System.out.println(v2-m4);

}
}
    
    

