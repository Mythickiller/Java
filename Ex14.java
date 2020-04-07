import java.util.Scanner;
public class Ex14 {
public static void main(String[] args) {

Scanner ler = new Scanner (System.in);

int X;
double Y, consumo;

System.out.println("Informe a distância total percorrida(em Km): ");
X = ler.nextInt();

System.out.println("Informe o total de combustível gasto: ");
Y = ler.nextDouble();

consumo = X/Y; 

System.out.printf("%.3f km/l",consumo);


}
}