import java.util.Scanner;
import java.lang.Math;
public class Ex22 {
public static void main(String[] args) {

Scanner ler = new Scanner (System.in);

double a, b, c, x1, x2;

System.out.println("Informe o valor de A, B e C: ");
a = ler.nextDouble();
b = ler.nextDouble();
c = ler.nextDouble();


x1=((b*(-1))+Math.sqrt(b*b-4*a*c))/2*a;

x2=((b*(-1))-Math.sqrt(b*b-4*a*c))/2*a;

System.out.println("R1 "+x1);
System.out.println("R2 "+x2);


}
}