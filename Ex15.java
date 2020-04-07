import java.util.Scanner;
import java.lang.Math;
public class Ex15 {
public static void main(String[] args) {

Scanner ler = new Scanner (System.in);

double x1,y1,x2,y2,distancia,total;

System.out.println("Informe o valor de x1 e y1:");
x1 = ler.nextDouble();
y1 = ler.nextDouble();

System.out.println("Informe o valor de x2 e y2:");
x2 = ler.nextDouble();
y2 = ler.nextDouble();

total = ((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1)); 
distancia = Math.sqrt(total);
System.out.printf("%.4f",distancia);


}
}