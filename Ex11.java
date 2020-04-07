import java.util.Scanner;
public class Ex11 {
public static void main(String[] args) {

Scanner ler = new Scanner (System.in);

double raio,volume,pi=3.14159;

System.out.println("Informe o raio da esfera: ");
raio = ler.nextDouble();
volume = (4/3.0)*pi*(raio*raio*raio);

System.out.printf("VOLUME = %.3f",volume);


}
}