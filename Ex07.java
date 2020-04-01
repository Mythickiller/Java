import java.util.Scanner;
public class Ex07 {
public static void main(String[] args) {

Scanner ler = new Scanner (System.in);

int A, B, C, D, DIFERENCA;

System.out.println("Informe o valor de A: ");
A = ler.nextInt();
System.out.println("Informe o valor de B: ");
B = ler.nextInt();
System.out.println("Informe o valor de C: ");
C = ler.nextInt();
System.out.println("Informe o valor de D: ");
D = ler.nextInt();

DIFERENCA = (A*B-C*D);

System.out.println("DIFERENCA = " + DIFERENCA);

}
}