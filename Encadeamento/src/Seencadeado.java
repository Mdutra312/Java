import java.util.Scanner;
public class Seencadeado {
  public static void main(String args[]) {
	  Scanner ler = new Scanner(System.in);
	  int nasc, atual, id;
	  System.out.println("Digite o ano de nascimento:");
	  nasc = ler.nextInt();
	  System.out.println("Digite o ano atual:");
	  atual = ler.nextInt();
	  id = atual-nasc;
	  System.out.println("Sua idade é:\n"+id+ " anos");
		if (id<10)	{
		System.out.println(" criança"); 
		} else if (id<18) {
			System.out.println("Adolescente");
		    }else if (id<60) {
		    	System.out.print("adulto");
		        }else {
		    	      System.out.println("Idoso");
	
		     }
	ler.close();
  }
}
