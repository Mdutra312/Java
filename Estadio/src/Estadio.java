import java.util.Scanner;

public class Estadio {
	public static void main(String args[]) {
		Scanner in = new Scanner (System.in);
		int comp, l, area;
		System.out.println("DIgite o comprimento:");
		comp = in.nextInt();
		System.out.println("Digite a largura:");
		l = in.nextInt();
		area = l*comp;
		if (area<110){
		System.out.println("Seu estádio está fora do padrão FIFA");
		}else {
		System.out.println("Seu estádio está dentro do padrão FIFA");
		}
	}

}
