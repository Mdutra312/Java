import java.util.Scanner; 
public class Placa {
    public static void main(String args[]) { 
    	Scanner in = new Scanner(System.in); 
    	int p; 
    	System.out.println("Digite o n�mero final da placa do seu carro:"); 
    	p = in.nextInt(); 
    	switch(p) { 
    	case 0: System.out.println("N�o pode circular Sexta-feira"); 
    	break; 
    	 case 9: System.out.println("N�o pode circular Sexta-feira"); 
    	break; 
    	  case 8:System.out.println("N�o circula Quinta-feira"); 
    	break; 
    	   case 7:System.out.println("N�o circula Quinta-feira"); 
    	break; 
    	     case 6:System.out.println("N�o circula na Quarta-feira"); 
    	break; 
    	      case 5:System.out.println("N�o circula na Quarta-feira"); 
    	break; 
    	       case 4:System.out.println("N�o circula na Ter�a-feira"); 
    	break; 
    	        case 3:System.out.println("N�o circula na Ter�a-feira"); 
        break; 
    	         case 2:System.out.println("N�o circula na Segunda-feira"); 
    	break; 
    	          case 1:System.out.println("N�o circula na Segunda-feira"); 
    	break; 
    	default:System.out.println("N�mero inv�lido"); 

    	in.close(); 

    	} 

   } 
}