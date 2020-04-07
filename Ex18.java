import java.util.Scanner;
public class Ex18 {
public static void main(String[] args) {

Scanner ler = new Scanner (System.in);

int A, B, not100, not50, not20, not10, not5, not2, not1;

not100 = not50 = not20 = not10 = not5 = not2 = not1 = 0;

do{
	System.out.println("Informe o valor: ");
	A = ler.nextInt();
	if(A<0 || A>1000000){
		System.out.println("Valor inválido. informe novamente");
	}
}while(A<0 || A>1000000);

B = A;
while(A>=100){
	A=A-100;
	not100++;
}

while(A>=50){
	A=A-50;
	not50++;
}

while(A>=20){
	A=A-20;
	not20++;
}

while(A>=10){
	A=A-10;
	not10++;
}

while(A>=5){
	A=A-5;
	not5++;
}

while(A>=2){
	A=A-2;
	not2++;
}

while(A>=1){
	A=A-1;
	not1++;
}

System.out.println(B);
System.out.println(not100+" nota(s) de R$ 100,00");
System.out.println(not50+" nota(s) de R$ 50,00");
System.out.println(not20+" nota(s) de R$ 20,00");
System.out.println(not10+" nota(s) de R$ 10,00");
System.out.println(not5+" nota(s) de R$ 5,00");
System.out.println(not2+" nota(s) de R$ 2,00");
System.out.println(not1+" nota(s) de R$ 1,00");

}
}