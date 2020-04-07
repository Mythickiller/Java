import java.util.Scanner;
public class Ex12 {
public static void main(String[] args) {

Scanner ler = new Scanner (System.in);

double A,B,C,triangulo,circulo,trapezio,quadrado,retangulo;

System.out.println("Informe o valor de A: ");
A = ler.nextDouble();

System.out.println("Informe o valor de B: ");
B = ler.nextDouble();

System.out.println("Informe o valor de C: ");
C = ler.nextDouble();

triangulo = A*C/2;
circulo = 3.14159*(C*C);
trapezio = (A+B)/2*C;
quadrado = B*B;
retangulo = A*B;

System.out.printf("TRIANGULO = %.3f\nCIRCULO = %.3f\nTRAPEZIO = %.3f\nQUADRADO = %.3f\nRETANGULO = %.3f\n",triangulo, circulo, trapezio, quadrado, retangulo);


}
}