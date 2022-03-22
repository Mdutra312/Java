import java.util.Scanner;

public class IMC3 {
	public static void main(String args[]) {
		Scanner ler = new Scanner (System.in);
		Double p, a ,imc;
		System.out.println("Digite seu peso:");
		p = ler.nextDouble();
		System.out.println("Digite sua altura:");
		a = ler.nextDouble();
			imc = p/(a*a);
		   
			  if (imc<17) {
					System.out.println("Muito abaixo do peso \n IMC:"+imc);
				   }else if (imc>=17 && imc<=18.49) {
					System.out.println("Abaixo do peso \n IMC:"+imc);
				     }else if (imc>=18.5 && imc<=24.99) {
					  System.out.println("Peso ideial \n IMC:"+imc);
				       }else if (imc>=25 && imc<=29.99) {
					    System.out.println("Acima do Peso \n IMC:"+imc);
				        }else if (imc>=30 && imc<=34.99) {
						 System.out.println("Obesidade I \n IMC:"+imc);  
					     }else if (imc>=35 && imc<=39.99) {
						  System.out.println("Obesidade II(severa)\n IMC:"+imc);
					      }else {
						   System.out.println("Obesidade III(mórbida) \n IMC"+imc);
					  }
					  
			 
				
	}
}
