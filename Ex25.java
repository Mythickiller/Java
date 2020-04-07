import java.util.Scanner;
public class Ex25 {
public static void main(String[] args) {

Scanner ler = new Scanner (System.in);

int A, B;

System.out.println("Informe o valor de A: ");
A = ler.nextInt();

System.out.println("Informe o valor de B: ");
B = ler.nextInt();

if(A%B==0 || B%A==0){
	System.out.println("São múltiplos");
}else{
	System.out.println("Não são múltiplos");
}


}
}