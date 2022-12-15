//5) Ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit.
//A fórmula de conversão é F = (9*C + 160) /5, sendo F a temperatura em Fahrenheit e C a temperatura em Celsius. 
import java.util.Scanner;

public class Exercicio05 {
	
public static void main (String[] args) {
	
Scanner input = new Scanner(System.in);
	        
System.out.print("Digite o valor em Celsius que deseja converter =");

double c = input.nextDouble();
	 
double f = (9.0 * c + 160.0) / 5.0;
	        
System.out.printf ( "Equivale a " + f + "Fahrenheit");

}
}
	      
	    
	
