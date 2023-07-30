package programa;

import java.util.Locale;
import java.util.Scanner;

public class AttSalario {
	public int gender;
	public int year;
	public double pay;
	public double porcent = 0;
	
	public AttSalario() {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("=========================");
		System.out.println("1. Feminino");
		System.out.println("2. Maculino");
		System.out.print("Qual seu genero? ");
		gender = sc.nextInt();
		System.out.println("=========================");
		
		System.out.print("Quantos anos de empresa voce tem? ");
		year = sc.nextInt();
		System.out.println("=========================");
		
		System.out.print("Qual seu salario atual? R$");
		pay = sc.nextDouble();
				
		pay = porcent(gender, year, pay);
		
		System.out.println("Salario atualizado: R$" + pay);
		
		
	}
	
	public double porcent (int x, int z, double y) {
		
		if (x == 1) {
			
			if (z < 15) {
				
				porcent = y * 0.5;
				}
			else if(z >= 15 && z <= 20) {
				porcent = y * 0.12;
				
			}
			
			else {
				porcent = y * 0.23;
			}
		}
		
		
		if (x==2) {
			
	     if (z < 20) {
				
				porcent = y * 0.3;
				}
			else if(z >= 20 && z <= 30) {
				porcent = y * 0.13;
				
			}
			
			else {
				porcent = y * 0.25;
			}
	     
		}
		
		y = porcent + y;
		return y;
		
	}

}
