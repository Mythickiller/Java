import java.util.Scanner;
public class Ex05 {
public static void main(String[] args) {

Scanner ler = new Scanner (System.in);

double A, B, MEDIA;

System.out.println("Digite o primeiro valor: ");
A = (ler.nextDouble())*3.5;
System.out.println("Digite o segundo valor: ");
B = (ler.nextDouble())*7.5;

MEDIA = (A+B)/11;

System.out.printf("PRODUTO = %.5f",MEDIA);

}
}