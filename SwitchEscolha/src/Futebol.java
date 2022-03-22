

import java.util.Scanner; 
public class Futebol { 
     public static void main(String args[]) { 
 Scanner in = new Scanner (System.in); 
 int avaliacao; 
 System.out.println("Digite sua idade para saber a" 
 		+ " categroria que se encaixa"); 
 		avaliacao = in.nextInt(); 
 		switch(avaliacao) { 
 		 case 6:System.out.println("Categoria: Dente de Leite"); 
 		 break; 
 		  case 7:System.out.println("Categoria: Júnior"); 
 		 break; 
 		    case 8:System.out.println("Categoria: Júnio Max"); 
 		 break; 
 		     case 9: System.out.println("Categoria: Júnio Master"); 
 		 break; 
 		      case 10: System.out.println("Categoria: Master"); 
 		 break; 
 		default: System.out.println("Idade Inválida"); 

 		in.close(); 

 		} 

   } 

} 
