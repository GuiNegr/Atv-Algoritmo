import java.io.IOException;
import java.util.Scanner;

public class Main{

	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	double[][] matriz = new double[12][12];
	String opc = sc.next();
	double x = 0;
	double result = 0;

	for(int i = 0; i< matriz.length; i++){
		for(int j = 0; j < matriz[i].length; j++){
			x = sc.nextDouble();
			matriz[i][j] = x;
		}	
	}

	if(opc.equals("S")){
		result = soma(matriz);
	} else if (opc.equals("M")){
		result = media(matriz);
	}
	System.out.printf("%.lf\n", result);
} public static double soma(double[][] matriz){
	double soma = 0;
	int ref = 11;

	for(int i = 0; i < matriz.length; i++){
		for(int j = 0; j <  matriz[i].length; j++){
		if(j > ref){
			soma += matriz[i][j];
		}
	}
	if(i<5){
	   ref--;
	}else if(i >= 6){
	    ref++;
	}
	}
	return soma;
}
	public static double media (double[][] matriz){
		double media = 0; 
		double soma = 0;
		double qtd = 0;
	int ref = 11;

	for(int i = 0; i < matriz.length; i++){
		for(int j = 0; j <  matriz[i].length; j++){
		if(j > ref){
			soma += matriz[i][j];
			qtd++;
		}
	}
	if(i<5){
	   ref--;
	}else if(i >= 6){
	    ref++;
	}
	}

	media = soma / qtd;
	return media;

}
}