import java.util.Scanner;
public class Pocentagem {
public static void main(String[] args) {
	Double preco,porc,cal,result;
	String resp="S";
	Scanner in = new Scanner(System.in);
	while (resp.equalsIgnoreCase("S")){
	System.out.println("digite o preço do produto:");
	preco = in.nextDouble();
	System.out.println("digite a pocentagem de lucro do produto:");
	porc = in.nextDouble();
	System.out.println("Deseja continuar o programa?[S/N]");
	resp = in.next();
	cal = (porc*preco)/100;
	result = cal+preco;
	System.out.println("O lucro será de: "+result);
	}
	}
}

