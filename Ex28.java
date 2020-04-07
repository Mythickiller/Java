import java.util.Scanner;
public class Ex28 {
public static void main(String[] args) {

Scanner ler = new Scanner (System.in);

int X,i,cont=0;

System.out.println("Informe o valor: ");
X = ler.nextInt();

while(cont<6){
	if(X%2==1){
		System.out.println(X);
		cont++;
	}
X++;	
	
}	
}
}