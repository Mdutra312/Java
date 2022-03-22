import java.util.Scanner;
public class Tabuada {
	public static void main(String args[]) {
		int result,n,i=1;
		Scanner in = new Scanner(System.in);
		System.out.println("entre");
		n = in.nextInt();
		do{
			result=n*i;
			System.out.println(result);
			i++;
		}while(i<=10);
		in.close();
	}	
}
