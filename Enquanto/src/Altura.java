public class  Altura{ 

public static void main(String[] args) { 

	double joao = 1.34, pedro = 1.45 ; 

	int cont = 0; 

	while(joao<=pedro) { 
		joao = joao + 0.025; 
		pedro = pedro + 0.02; 
		cont++; 
	}	 

System.out.println(cont+" anos"); 

} 

 

} 