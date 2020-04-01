import java.util.Scanner;
public class Ex09 {
public static void main(String[] args) {

Scanner ler = new Scanner (System.in);

String nome;
double salarioFixo, totalVendas;

System.out.println("Informe o nome do vendedor: ");
nome = ler.next();
System.out.println("Informe o salário fixo: ");
salarioFixo = ler.nextDouble();
System.out.println("Informe o valor total das vendas: ");
totalVendas = ler.nextDouble();

System.out.println("TOTAL = " + (salarioFixo+(0.15*totalVendas)));


}
}