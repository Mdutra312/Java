import java.util.Scanner;
public class IrRenda {
   public static void main (String args[]) {
	   Scanner ler = new Scanner(System.in);
	   Double s,totsal1;
	   System.out.println("Digite seu sal�rio:");
	   s = ler.nextDouble();
	   if (s<=1434.59) {
		   System.out.println("N�o paga nada");
	     }else if(s>=1434.60) {
	    	 totsal1 = s-107.59;
	    	 System.out.println("Pagar� "+ totsal1+"de imposto");
	     }else if (s<=2150)
	    	 totsal2 = s-107.59;
	         System.out.println("Pagar�"+totsal2+"de imposto");
	         else if (s>) 	        
	   }
	   
   }
}
