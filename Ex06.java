import java.util.Scanner;
public class Ex06 {
public static void main(String[] args) {

Scanner ler = new Scanner (System.in);

double A, B, C, MEDIA;
do{
System.out.println("Digite a primeira nota: ");
A = (ler.nextDouble())*2;
if(A/2<0 || A/2>10)
System.out.println("Nota incorreta, informe novamente.");
}while(A/2<0 || A/2>10);
do{
System.out.println("Digite a segunda nota: ");
B = (ler.nextDouble())*3;
if(B/3<0 || B/3>10)
System.out.println("Nota incorreta, informe novamente.");
}while(B/3<0 || B/3>10);
do{
System.out.println("Digite a terceira nota: ");
C = (ler.nextDouble())*5;
if(C/5<0 || C/5>10)
System.out.println("Nota incorreta, informe novamente.");
}while(C/5<0 || C/5>10);

MEDIA = (A+B+C)/10;

System.out.printf("MEDIA = %.1f",MEDIA);

}
}