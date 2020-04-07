import java.util.Scanner;
public class Ex16 {
public static void main(String[] args) {

Scanner ler = new Scanner (System.in);

int distancia,minutos;

System.out.println("Informe a distancia de diferença entre os carros:");
distancia = ler.nextInt();

minutos = distancia*2;

System.out.println(minutos + " minutos");


}
}