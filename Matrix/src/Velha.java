import java.util.Scanner;
public class Velha {
 public static void main(String[] args) {
	Scanner in = new Scanner (System.in); 
		int a[][],r, i=0 , j=0,c,l;
		a = new int[3][3];
		
			for (i=0;i<3; i++) {
				for(j=0;j<3;j++) {
				System.out.print(a[0][0]+" ");
				System.out.print(a[0][1]+" ");
				System.out.println(a[0][2]+" ");
				System.out.print(a[1][0]+" ");
				System.out.print(a[1][1]+" ");
				System.out.println(a[1][2]+" ");
				System.out.print(a[2][0]+" ");
				System.out.print(a[2][1]+" ");
				System.out.println(a[2][2]+" ");
				System.out.println("!DIGITE AS COORDENADAS PARA O JOGO DA VELHA!");
				System.out.println("linha:");
				l = in.nextInt();
				System.out.println("coluna:");
				c = in.nextInt();
				System.out.println("digite o número[1/2] para a linha: "+l+" e coluna: "+c+":");
				r = in.nextInt();
				if (c==0 && l==0) {//n precisa aq
					a[0][0]=r;
					
				}else if (c==1 && l==0) {//n precisa aq
					a[0][1]=r;
				
				} else if (c==0 && l==1) {//n precisa aq
					  a[1][0]=r;
				
				}else if (c==2 && l==0) {//n precisa aq
					   a[0][2]=r;
							
				}else if (c==0 && l==2) {
					   a[2][0]=r;
				
				}else if (c==1 && l==1) {//n precisa aq
					a[1][1]=r;
		
				}else if (c==2 && l==1) {//nprecisa aq
					a[1][2]=r;
					
				}else if (c==1 && l==2) {//n precisa aq
					a[2][1]=r;
					
				}else if (c==2 && l==2) {//n precisa aq
					a[2][2]=r;

			    }else {
				   System.out.println("digite um número válido!");
			    
			    }
				}			
			}
			
			System.out.print(a[0][0]+" ");
			System.out.print(a[0][1]+" ");
			System.out.println(a[0][2]+" ");
			System.out.print(a[1][0]+" ");
			System.out.print(a[1][1]+" ");
			System.out.println(a[1][2]+" ");
			System.out.print(a[2][0]+" ");
			System.out.print(a[2][1]+" ");
			System.out.println(a[2][2]+" ");
		}
		
 }
