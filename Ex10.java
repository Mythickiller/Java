import java.util.Scanner;
public class Ex10 {
public static void main(String[] args) {

Scanner ler = new Scanner (System.in);

int codigo1, quantidade1, codigo2, quantidade2;
double valorUnitario1, valorUnitario2;

System.out.println("Informe o código da peça, a quantidade e o valor unitário: ");
codigo1 = ler.nextInt();
quantidade1 = ler.nextInt();
valorUnitario1 = ler.nextDouble();
System.out.println("Informe o código da peça, a quantidade e o valor unitário: ");
codigo2 = ler.nextInt();
quantidade2 = ler.nextInt();
valorUnitario2 = ler.nextDouble();
System.out.println("VALOR A PAGAR = " + ((quantidade1*valorUnitario1)+(quantidade2*valorUnitario2)));


}
}