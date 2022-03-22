import java.util.Scanner;
public class Porcentagem {
	public static void main(String args[]) {
		 int decisao;
		 double result,result2,porc,prod;
		 Scanner in = new Scanner(System.in);
		 do{
		 System.out.println("entre com a porcentagem de lucro:");
		 porc = in.nextInt();
		 System.out.println("entre com o valor do produto:");
		 prod = in.nextInt();
		 result = (prod*porc)/100;
		 result2 = result+prod;
		 System.out.println("O produto passará a custar:"+result2);
		 System.out.println("Deseja continuar o programa?[1-Sim/2-Não]");
		 decisao = in.nextInt();
		 }while(decisao!=2);
 }
   }
