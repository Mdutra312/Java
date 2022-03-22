import java.util.Scanner; 
public class Placa {
    public static void main(String args[]) { 
    	Scanner in = new Scanner(System.in); 
    	int p; 
    	System.out.println("Digite o número final da placa do seu carro:"); 
    	p = in.nextInt(); 
    	switch(p) { 
    	case 0: System.out.println("Não pode circular Sexta-feira"); 
    	break; 
    	 case 9: System.out.println("Não pode circular Sexta-feira"); 
    	break; 
    	  case 8:System.out.println("Não circula Quinta-feira"); 
    	break; 
    	   case 7:System.out.println("Não circula Quinta-feira"); 
    	break; 
    	     case 6:System.out.println("Não circula na Quarta-feira"); 
    	break; 
    	      case 5:System.out.println("Não circula na Quarta-feira"); 
    	break; 
    	       case 4:System.out.println("Não circula na Terça-feira"); 
    	break; 
    	        case 3:System.out.println("Não circula na Terça-feira"); 
        break; 
    	         case 2:System.out.println("Não circula na Segunda-feira"); 
    	break; 
    	          case 1:System.out.println("Não circula na Segunda-feira"); 
    	break; 
    	default:System.out.println("Número inválido"); 

    	in.close(); 

    	} 

   } 
}