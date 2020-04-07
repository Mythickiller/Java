import java.util.Scanner;
public class Ex20 {
public static void main(String[] args) {

Scanner ler = new Scanner (System.in);

int dias, meses, anos;

meses = anos = 0;
System.out.println("Informe a idade da pessoa em dias: ");
dias = ler.nextInt();

while(dias>=365){
	dias = dias-365;
	anos++;
}

while(dias>=30){
	dias = dias-30;
	meses++;
}

System.out.println(anos + " ano(s)");
System.out.println(meses + " mes(es)");
System.out.println(dias + " dia(s)");


}
}