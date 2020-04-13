import java.util.Scanner;
public class Exercicio1 {
	String nome, cidade;
	 int idade ;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
       System.out.print("Digite o seu nome: ");
       String nome = in.nextLine();
           System.out.println("Boas vindas, "+nome);
           System.out.print("Digite sua idade: ");
           int idade = in.nextInt();
           System.out.print("Digite a cidade onde você mora: ");
           String cidade = in.next();
           System.out.println("Nome: "+nome);
           System.out.println("Idade: "+idade);
           System.out.print("Cidade: "+cidade);           
	}

}