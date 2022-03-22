import java.util.Scanner;
public class Baseexpoente {
 public static void main(String args[]) {
	 int b,e,result=1,result1,cont=0;
	 Scanner in = new Scanner(System.in);
	 System.out.println("entre b:");
	 b = in.nextInt();
	 System.out.println("entre e:");
	 e = in.nextInt();
	 while(cont<e) { 
		 result=result*b;
		 System.out.println(result);
	 cont++;
 }
}
}
