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
			System.out.print("Digite o primeiro n�mero inteiro: ");
			n1= input.nextInt();
			System.out.print("Digite o segundo n�mero inteiro: ");
			n2= input.nextInt();
			soma= n1+n2;
			sub= n1-n2;
			mult= n1*n2;
			div= n1/n2;
			res= n1%n2;
			
			System.out.println("Resultado da soma: "+soma );
			System.out.println("Resultado da subtra��o: "+sub );
			System.out.println("Resultado da multiplica��o: "+mult );
			System.out.println("A divis�o do primeiro n�mero pelo segundo n�mero: "+div );
			System.out.print("O resto da divis�o do primeiro n�mero pelo segundo n�mero: "+res );
			
			
		}

	}