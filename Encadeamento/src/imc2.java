import java.util.Scanner;
public class imc2 {
 public static void main(String args[]) {
  Scanner in = new Scanner(System.in);
  float tot, a, p;
  System.out.println("Digite sua altura:");
  a = in.nextFloat();
  System.out.println("Digite seu peso:");
  p = in.nextFloat();
  tot = p/(a*a);
  if (tot<17) {
	System.out.println("Muito abaixo do peso "+tot);
  }else if (tot>=17) {
	 System.out.println("Abaixo do peso "+tot);
    }else if(tot<=18.49) {
	  System.out.println("Abaixo do peso");
     }else if (tot>18.5) {
	   System.out.println("Peso normal");
      }else if (tot<=24.99) {
	   System.out.println("Peso Normal");
       }else if (tot>25) {
	    System.out.println("Acima do Peso");
         }else if (tot<=29.99) {
	       System.out.println("Acima do Peso");
          }else if(tot>30) {
	       System.out.println("Obesidade I");
           }else if(tot<=34.99) {
	        System.out.println("Obesidade I");
             }else if(tot>35) {
	          System.out.println("Obesidade II");
              }else if(tot<=39.99) {
	           System.out.println("Obesiadade II(severa");
                }else {
	             System.out.println("Obesidade III(mórbida");
	  }
  
 }
 
}