import java.util.Scanner;
public class Idade {
	public static void main(String args[]) {
		int valor,alunos,contagemdealuno=0,contmaior18=0,contmenor18=0;
		 Scanner in = new Scanner(System.in); 
		 while(contagemdealuno<10) {
			 System.out.println("Qual a sua idade?");
			 alunos = in.nextInt();
		     contagemdealuno++;
		     System.out.println(contagemdealuno);
		     if (alunos>=18) {
		    	contmaior18 =contmaior18+1;
		     }else{
		           contmenor18=contmenor18+1;
		   
		     }
		 }   System.out.println("Alunos maior do que 18 anos:"+contmaior18);
		     System.out.println("Alunos maior do que 18 anos:"+contmenor18);
}
}

