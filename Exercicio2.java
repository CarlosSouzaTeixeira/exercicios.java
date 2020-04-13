import java.util.Scanner;
public class Exercicio2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int	n1;
		int	n2;
		int	soma;
		int	sub;
		int	mult;
		int	div;
		int	res;
			System.out.print("Digite o primeiro número inteiro: ");
			n1= input.nextInt();
			System.out.print("Digite o segundo número inteiro: ");
			n2= input.nextInt();
			soma= n1+n2;
			sub= n1-n2;
			mult= n1*n2;
			div= n1/n2;
			res= n1%n2;
			
			System.out.println("Resultado da soma: "+soma );
			System.out.println("Resultado da subtração: "+sub );
			System.out.println("Resultado da multiplicação: "+mult );
			System.out.println("A divisão do primeiro número pelo segundo número: "+div );
			System.out.print("O resto da divisão do primeiro número pelo segundo número: "+res );
			
			
		}

	}