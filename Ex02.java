import java.util.Scanner;
public class Ex02 {
public static void main(String[] args) {

Scanner ler = new Scanner (System.in);

double n = 3.14159, raio, area;

System.out.println("Digite o valor do raio: ");
raio = ler.nextDouble();
area = (raio*raio)*n;
System.out.println ("Área: " + area);

}
}