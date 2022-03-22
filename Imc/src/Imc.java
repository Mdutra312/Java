import java.util.Scanner;
public class Imc {
	public static void main(String args[]) {
		Scanner ler = new Scanner (System.in);
		Double p, a ,tot, tot2;
		System.out.println("Digite seu peso:");
		p = ler.nextDouble();
		System.out.println("Digite sua altura:");
		a = ler.nextDouble();
		tot2 = p/(a*a);
	     if (tot2<17) {
		   System.out.println("Muito abaixo do peso"+tot2);
		    }else if (tot2>=17) {
		      System.out.print("Abaixo do peso");
			   }else if (tot2<=18.49) {
			    System.out.println("Abaixo do peso");
		         }else if (tot2>18.5) {
			      System.out.println("Peso Normal");
		           }else if (tot2<=24.99){
		    	    System.out.println("Peso Normal");
		             }else if (tot2>25){
		    	      System.out.println("Obesidade Grau I");
		               }else if (tot2<=29.99) {
		    	         System.out.println("Obesidade Grau I");
		                  }else if (tot2>30) {
		    	            System.out.print("Obesidade Grau II");
		                     } else if (tot2<34.99) { 
		                    	 System.out.println("Obesidade Grau II");
		                       }else if (tot2>35){
		    	                   System.out.println("Obesidade Grau III");
		                          }else if (tot2<39.99) {
		    	                	  System.out.println("Obesidade II(severa");
		    	                    }else if (tot2<39.99) {
		    	                	      System.out.println("Obesidade II(severa");
		    	                     }else {
		    	                	          System.out.println("Obesidade III(Mórbida");
		  
		    	                	      }
		    	                    }
   }
