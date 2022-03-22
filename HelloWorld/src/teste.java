import java.util.Scanner;
public class teste {
	public static void main(String args[]) {
		Scanner ler = new Scanner (System.in);
		Double p, a ,tot;
		System.out.println("Digite seu peso:");
		p = ler.nextDouble();
		System.out.println("Digite sua altura:");
		a = ler.nextDouble();
			tot = p/(a*a);
		   
			 if (tot<17) {
					System.out.println("Muito abaixo do peso \n IMC:"+tot);
				  }else if (tot>=17 && tot<=18.49) {
					 System.out.println("Abaixo do peso \n IMC:"+tot);
				  }else if (tot>=18.5 && tot<=24.99) {
					System.out.println("Peso ideial \n IMC:"+tot);
				  }else if (tot>=25 && tot<=29.99) {
					  System.out.println("Acima do Peso \n IMC:"+tot);
				  }else if (tot>=30 && tot<=34.99) {
						System.out.println("Obesidade I \n IMC:"+tot);  
					  }else if (tot>=35 && tot<=39.99) {
						  System.out.println("Obesidade II(severa)\n IMC:"+tot);
					  }else {
						  System.out.println("Obesidade III(mórbida) \n IMC"+tot);
					  }
					  
			 
				
	}
}