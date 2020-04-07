import java.util.Scanner;
public class Ex24 {
public static void main(String[] args) {

Scanner ler = new Scanner (System.in);

int codigo, quantidade;
double total;

System.out.println("Informe o codigo e a quantidade do produto:");
codigo = ler.nextInt();
quantidade = ler.nextInt();
switch(codigo){
case 1: 
	total = (quantidade*4.0);
	System.out.printf("Total de cachorro quente: %.2f",total);
break;
case 2:
	total = (quantidade*4.5);
	System.out.printf("Total de x-salada: %.2f",total);
break;
case 3:
	total = (quantidade*5.0);
	System.out.printf("Total de x-bacon: %.2f",total);
break;
case 4:
	total = (quantidade*2.0);
	System.out.printf("Total de torrada: %.2f",total);
break;
case 5: 
	total = (quantidade*1.5);
	System.out.printf("Total de refrigerante: %.2f",total);
break;
default:
	System.out.println("Código incorreto!");
}

}
}