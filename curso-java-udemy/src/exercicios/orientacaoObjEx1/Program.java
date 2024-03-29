package exercicios.orientacaoObjEx1;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		/*Fazer um programa para ler os valores da largura e altura de um retângulo. 
		 * Em seguida, mostrar na tela o valor de sua área, perímetro e diagonal. 
		 * Usar uma classe como mostrado no projeto ao lado.*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);		
		
		//declarando variavel
		Rectangle rect = new Rectangle();
		
		System.out.println("Enter rectangle width and height: ");
		rect.width = sc.nextDouble();
		rect.height = sc.nextDouble();
		
		System.out.printf("AREA = %.2f%n", rect.area());
		System.out.printf("PERIMETER = %.2f%n", rect.perimeter());
		System.out.printf("DIAGONAL = %.2f", rect.diagonal());
		
		sc.close();
	}
}
