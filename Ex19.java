import java.util.Scanner;
public class Ex19 {
public static void main(String[] args) {

Scanner ler = new Scanner (System.in);

int N,horas,minutos;
horas = minutos = 0;

System.out.println("Informe o tempo total em segundos: ");
N = ler.nextInt();

while(N>=60){
	N=N-60;
	minutos++;	
}

while(minutos>=60){
	minutos=minutos-60;
	horas++;	
}

System.out.println(horas + ":"+minutos+":"+N);


}
}