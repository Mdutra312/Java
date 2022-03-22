import java.util.Scanner;
  
public class Invertido{
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.print("Informe um número inteiro: ");
    int numero = Integer.parseInt(entrada.nextLine());
    int inverso = 0, temp; 
    
    while(numero != 0){    
      temp = numero % 10;   
      inverso = inverso * 10 + temp;    
      numero = numero / 10;    
    }    
    System.out.println("O número invertido é " + inverso); 
  }
}