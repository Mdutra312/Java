import java.util.Random;
public class Bingo {
 public static void main(String[] args) {
	int v[][] = new int[3][3];
	int i,j,z=0,p=0,menor=0,menor1=0,maior=0,l=0,c=0;
	Random in = new Random();
	for (i=0;i<3;i++) {
		for(j=0;j<3;j++) {
			v[i][j] = in.nextInt()%50;
			if (i==0 && j==0) {
				maior=v[i][j];
				menor=v[i][j];
			
			       }if (v[j][i]>menor) { 
				    menor1=menor;
					  
			       }if(v[i][j]>maior) {
			    	   maior=v[i][j];
			    	   
			    	   
			       }
					}
			}
	for (i=0;i<3;i++) {
		System.out.println();
		for(j=0;j<3;j++) {
			System.out.print("["+v[i][j]+"]");
		}
	}
	
	System.out.println();
	System.out.println("o maior valor da matriz foi: "+maior+" que se encontra na posi��o:"+l+" e "+c);
	System.out.println("o menor valor da matriz foi: "+menor+" que se encontar na posi��o:"+i+" e ");
	}
  }

