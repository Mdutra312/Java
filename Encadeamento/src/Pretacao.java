import java.util.Scanner; 
public class Pretacao { 
  public static void main(String args[]) { 
  Scanner in = new Scanner (System.in); 
 Double result1prest,prest,result2prest,result3prest,novamulta,rnovamulta; 
 int atraso; 
 System.out.println("Digite o valor da prestação:"); 
   prest = in.nextDouble(); 
 System.out.println("Digite a quantidade de dias em atraso:"); 
   atraso = in.nextInt(); 
 result1prest = prest*2/100; 
 result2prest = result1prest*0.1/100; 
 result3prest = result1prest+prest+result2prest; 
 if (atraso>45) { 
 novamulta = prest*3/100; 
 rnovamulta = novamulta+result3prest; 
 System.out.println("A nova multa será de:"+rnovamulta); 
 }else  
 System.out.println("Sua pretação ficou: "+result3prest); 
 in.close(); 

 } 

  } 