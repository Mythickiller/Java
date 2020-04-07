import java.util.Scanner;
import java.lang.Math;
public class Ex17 {
public static void main(String[] args) {

Scanner ler = new Scanner (System.in);

int horas, velocidade;
double litros,distancia;

System.out.println("Informe o tempo gasto na viagem em horas:");
horas = ler.nextInt();

System.out.println("Informe a velocidade média:");
velocidade = ler.nextInt();

distancia = horas*velocidade;
litros = distancia/12;


System.out.printf("%.4f",litros);


}
}