import java.util.Scanner;
public class Ex08 {
public static void main(String[] args) {

Scanner ler = new Scanner (System.in);

int numero, horas;
double valorHora, salario;

System.out.println("Informe o número do funcionário: ");
numero = ler.nextInt();
System.out.println("Informe a quantidade de horas trabalhadas: ");
horas = ler.nextInt();
System.out.println("Informe o valor que o funcionário recebe por hora: ");
valorHora = ler.nextDouble();

salario = (horas*valorHora);

System.out.println("NUMBER = " + numero);
System.out.printf("SALARY = U$ %.2f", salario);

}
}