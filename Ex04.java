import java.util.Scanner;
public class Ex04 {
public static void main(String[] args) {

Scanner ler = new Scanner (System.in);

int A, B, PROD;

System.out.println("Digite o primeiro valor: ");
A = ler.nextInt();
System.out.println("Digite o segundo valor: ");
B = ler.nextInt();
PROD = A * B;

System.out.println ("PRODUTO = " + PROD);

}
}