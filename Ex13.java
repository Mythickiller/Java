import java.util.Scanner;
import java.lang.Math;
public class Ex13 {
public static void main(String[] args) {

Scanner ler = new Scanner (System.in);

int A, B, C, maiorAB, maior,resultado;

System.out.println("Informe o valor de A: ");
A = ler.nextInt();

System.out.println("Informe o valor de B: ");
B = ler.nextInt();

System.out.println("Informe o valor de C: ");
C = ler.nextInt();

resultado = Math.abs(A-B);
maiorAB = (A+B+resultado)/2;
resultado = Math.abs(maiorAB-C);
maior = (maiorAB+C+resultado)/2;

System.out.println(maior + " eh o maior");


}
}